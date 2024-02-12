
    function registerUser() {
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    const userData = {
    firstName: firstName,
    lastName: lastName,
    email: email,
    password: password
};

    fetch('http://localhost:8080/api/user', {
    method: 'POST',
    headers: {
    'Content-Type': 'application/json',
},
    body: JSON.stringify(userData),
})
    .then(response => {
    if (!response.ok) {
    throw new Error('Network response was not ok');
}
    return response.json();
})
    .then(data => {
    console.log('Success:', data);
    alert('Registration successful!');
    // Redirect or perform any other action upon successful registration
})
    .catch(error => {
    console.error('Error:', error);
    alert('Registration failed. Please try again later.');
});
}