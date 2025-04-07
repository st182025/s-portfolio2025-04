// message.js
const text = document.getElementById('movingText');
const container = document.getElementById('message-container');

let pos = 0;
let direction = 1; // 1: 右、-1: 左
const speed = 2;

function animate() {
  const containerWidth = container.clientWidth;
  const textWidth = text.clientWidth;

  pos += direction * speed;

  if (pos + textWidth >= containerWidth || pos <= 0) {
    direction *= -1; // 端に来たら反転
  }

  text.style.left = pos + 'px';
  requestAnimationFrame(animate);
}

animate();