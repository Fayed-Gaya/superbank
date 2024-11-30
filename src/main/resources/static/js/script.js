function changeTextColor() {
    const colors = ["red", "blue", "green", "purple", "orange"];
    const randomColor = colors[Math.floor(Math.random() * colors.length)];
    const textElement = document.getElementById("welcome-text");
    textElement.style.color = randomColor;
}