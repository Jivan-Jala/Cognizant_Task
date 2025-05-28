// 1. Welcome message on load
window.onload = () => {
    console.log("Welcome to the Community Portal");
    alert("Page is fully loaded");
};

// 2. Form submission
document.getElementById("registrationForm").addEventListener("submit", function (e) {
    e.preventDefault();
    document.getElementById("confirmationMessage").textContent = "Thank you for registering!";
});

// 3. Phone validation
function validatePhone() {
    const phone = document.getElementById("phone").value;
    if (!/^\d{10}$/.test(phone)) {
        alert("Please enter a valid 10-digit phone number.");
    }
}

// 4. Character counter
function countCharacters() {
    const text = document.getElementById("feedbackText").value;
    document.getElementById("charCount").textContent = text.length;
}

// 5. Video ready
function videoReadyMessage() {
    document.getElementById("videoMessage").textContent = "Video ready to play";
}

// 6. Geolocation
function findNearbyEvents() {
    if (!navigator.geolocation) {
        document.getElementById("locationDisplay").textContent = "Geolocation not supported.";
        return;
    }

    navigator.geolocation.getCurrentPosition(
        (position) => {
            const { latitude, longitude } = position.coords;
            document.getElementById("locationDisplay").textContent =
                `Your coordinates: ${latitude}, ${longitude}`;
        },
        (error) => {
            document.getElementById("locationDisplay").textContent = `Error: ${error.message}`;
        },
        { enableHighAccuracy: true, timeout: 10000 }
    );
}

// 7. onbeforeunload warning
window.onbeforeunload = function () {
    return "Are you sure you want to leave? Your registration form may be unfinished.";
};

// Fetch and display events from JSON
fetch('data/events.json')
    .then(response => response.json())
    .then(events => {
        const eventList = document.getElementById("eventList");
        events.forEach(event => {
            const div = document.createElement("div");
            div.innerHTML = `<strong>${event.title}</strong> - ${event.date} @ ${event.location}`;
            eventList.appendChild(div);
        });
    })
    .catch(error => console.error("Error loading events:", error));
