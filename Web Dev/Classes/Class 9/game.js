//initialise global variable to be accessible anywhere in the code
var iRandomGeneratedNumber, iUserNumber, iNumberOfTries, sMessage;
//declare a variable to hold a reference to the HTML element that will display messages to the user during game play
var messageToUserTarget = document.getElementById('messageToUser');
//hide the DIV that will only be visible at the end of the game
document.getElementById('gameOver').style.display = "none";

//call the function that will start the main game
StartGame();

function StartGame() {
  //hide the div containing the dialog about gamne restart
  document.getElementById('restartGame').style.display = "none";
  //display the div with the main game play
  document.getElementById('playGame').style.display = "block";
  //generate the integer random number between 1 and 10
  iRandomGeneratedNumber = Math.floor(Math.random() * 10 + 1);
  //alert(iRandomGeneratedNumber);

  //reset the number of tries
  iNumberOfTries = 0;
  //display the number of tries
  document.getElementById('numberOfTries').innerHTML = 0;
  //initialise the message to be displayed the user
  messageToUserTarget.innerHTML = "";
  //set the focus on the numbers spinner
  document.getElementById('userInput').focus();
}

function CheckNumber() {
  //retrieve the number selected by the user
  iUserNumber = document.getElementById('userInput').value;

  //compare it against the random number
  if (iUserNumber == iRandomGeneratedNumber) {
    //create the partial message to be displayed in the "restart game" dialog
    sMessage = "Congratulations, you guessed correctly!";
    //if a guess, ask if to restart the game
    RestartGame();
  } else if (iUserNumber > iRandomGeneratedNumber) {
    messageToUserTarget.innerHTML = "You guessed too high, sorry!";
    iNumberOfTries++;
  } else {
    messageToUserTarget.innerHTML = "You guessed too low, sorry!";
    iNumberOfTries++;
  }
  document.getElementById('numberOfTries').innerHTML = iNumberOfTries;
  if (iNumberOfTries == 3) {
    //create the partial message to be displayed in the "restart game" dialog
    sMessage = "You ran out of tries, sorry!<br>The number was " + iRandomGeneratedNumber;
    //if not a guess after three tries, ask if to restart the game
    RestartGame();
  }
}

function RestartGame() {
  //to the partial message created above append the question about game restart
  document.getElementById('message').innerHTML = sMessage + "<br>Play again?";
  //hide the div with the main game play
  document.getElementById('restartGame').style.display = "block";
  //display the div with the "restart game" dialog
  document.getElementById('playGame').style.display = "none";
}

function GameOver() {
  //hide the div with the "restart game" dialog - the div with the main play is already hidden
  document.getElementById('restartGame').style.display = "none";
  //display the div with game over
  document.getElementById('gameOver').style.display = "block";
}
