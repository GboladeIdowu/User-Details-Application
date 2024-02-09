package gboladeidowu.userdetails.repository;

import gboladeidowu.userdetails.userdetails.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDetails, String> {

}

