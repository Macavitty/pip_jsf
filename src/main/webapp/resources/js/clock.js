const clock = document.getElementById('clock');
function update() {
    clock.innerText = new Date().toLocaleTimeString();
    setTimeout(update, 10000);
}
update();