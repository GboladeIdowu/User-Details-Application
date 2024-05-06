document.getElementById('userDetailsForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Collect form data
    const formData = new FormData(this);

    // Convert form data to JSON
    const jsonData = {};
    formData.forEach((value, key) => {
        jsonData[key] = value;
    });

    // Send data to backend using fetch API
    fetch('http://localhost:5000/api/user/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(jsonData)
    })
        .then(response => {
            if (response.ok) {
                // Show success message
                alert('User details submitted successfully!');
            } else {
                // Show error message
                alert('Failed to submit user details. Please try again.');
            }
        })
        .catch(error => {
            console.error('Error:', error);
            // Show error message
            alert('Failed to submit user details. Please try again.');
        });
});
