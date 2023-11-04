var game = document.getElementById('game');
var ball = document.getElementById('ball');
var paddle = document.getElementById('paddle');
var startButton = document.getElementById('start');
var restartButton = document.getElementById('restart');

var gameWidth = parseInt(window.getComputedStyle(game).getPropertyValue('width'));
var gameHeight = parseInt(window.getComputedStyle(game).getPropertyValue('height'));

var ballDirX = 2;
var ballDirY = 2;

var paddleHeight = 20; // Altura do paddle
var paddleWidth = 100; // Largura do paddle
var paddleX = (gameWidth - paddleWidth) / 2; // Posição inicial do paddle

var score = 0;
var scoreElement = document.getElementById('score');
var messageElement = document.getElementById('message');

var gameOver = false;
var gameStarted = false;

function moveBall() {
  if (!gameStarted || gameOver) return;

  var ballPosTop = parseInt(window.getComputedStyle(ball).getPropertyValue('top'));
  var ballPosLeft = parseInt(window.getComputedStyle(ball).getPropertyValue('left'));

  var paddlePosTop = parseInt(window.getComputedStyle(paddle).getPropertyValue('top'));
  var paddlePosLeft = parseInt(window.getComputedStyle(paddle).getPropertyValue('left'));

  if (ballPosTop <= 0 || ballPosTop >= gameHeight - 20) {
    ballDirY *= -1;
  }

  if (ballPosLeft <= 0 || ballPosLeft >= gameWidth - 20) {
    ballDirX *= -1;
  }

  if (
    ballPosTop + 20 >= paddlePosTop &&
    ballPosLeft + 20 >= paddlePosLeft &&
    ballPosLeft <= paddlePosLeft + paddleWidth
  ) {
    ballDirY *= -1;
    score++;
    scoreElement.textContent = 'Score: ' + score;
  }

  if (ballPosTop >= gameHeight - 20) {
    gameOver = true;
    messageElement.textContent = 'Você perdeu!';
    messageElement.style.display = 'block';
    restartButton.style.display = 'block';
    startButton.style.display = 'none'; // Oculta o botão "Começar"
  }

  ball.style.top = ballPosTop + ballDirY + 'px';
  ball.style.left = ballPosLeft + ballDirX + 'px';
}

function startGame() {
  gameStarted = true;
  gameOver = false;
  score = 0;
  scoreElement.textContent = 'Score: 0';
  messageElement.style.display = 'none';
  restartButton.style.display = 'none';
  ball.style.top = '50%';
  ball.style.left = '50%';
  ballDirX = 2;
  ballDirY = 2;
  startButton.style.display = 'none'; // Oculta o botão "Começar"
}

startButton.addEventListener('click', startGame);
restartButton.addEventListener('click', startGame);

function movePaddle(event) {
  var paddlePosLeft = event.clientX - game.getBoundingClientRect().left - paddleWidth / 2;

  if (paddlePosLeft >= 0 && paddlePosLeft <= gameWidth - paddleWidth) {
    paddle.style.left = paddlePosLeft + 'px';
  }
}

document.addEventListener('mousemove', movePaddle);

setInterval(moveBall, 10);
