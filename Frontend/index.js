document.getElementById("userForm").addEventListener("submit", async function(event) {

    event.preventDefault();

    const data = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        phone: Number(document.getElementById("phone").value),
        age: Number(document.getElementById("age").value),
        country: document.getElementById("country").value,
        city: document.getElementById("city").value
    };

    const response = await fetch("https://user-form-k4zv.onrender.com/user/details", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    });

    const result = await response.text();

    alert(result);
});