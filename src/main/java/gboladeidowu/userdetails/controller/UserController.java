package gboladeidowu.userdetails.controller;

import gboladeidowu.userdetails.repository.UserRepository;
import gboladeidowu.userdetails.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository repository) {
        this.userRepository = repository;
    }

    @GetMapping
    public Iterable<UserDetails> getUserDetails(){
        return userRepository.findAll();
    }

    @GetMapping("/{email}")
    public Optional<UserDetails> findByEmail(@PathVariable String email){
        return userRepository.findById(email);
    }

    @PostMapping("add")
    public UserDetails userDetails(@RequestBody UserDetails userDetails) {
        if (userRepository.existsById(userDetails.getEmail())) {
            throw new IllegalStateException("Email taken!");
        }
        else {
            return userRepository.save(userDetails);
        }
    }

    @PutMapping("/{email}")
    public void update(@RequestBody UserDetails userDetails, @PathVariable String email){
        if (!userRepository.existsById(email)){
            throw new IllegalStateException("Email not found");
        }
        userRepository.deleteById(email);
        userRepository.save(userDetails);
    }

    @DeleteMapping("/{email}")
    public void  delete(@PathVariable String email){
        if (!userRepository.existsById(email)){
            throw new IllegalStateException("E mail doesn't exist!");
        }
        userRepository.deleteById(email);
    }


}
