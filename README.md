# Simple2PlayerGame
 TicTacToe  2 PLayer Game
# Java Tic Tac Toe Game

A simple command-line implementation of the classic Tic Tac Toe game written in Java.

## Description

This is a traditional 2-player Tic Tac Toe game where players take turns marking spaces on a 3x3 grid. The game is played in the console, where players input their moves using coordinates.

### Features

- Clean command-line interface
- 2-player gameplay (X and O)
- Input validation for moves
- Board state display after each move
- Win detection (horizontal, vertical, and diagonal)
- Draw detection
- Simple and intuitive coordinate system

## How to Play

1. The game starts with an empty 3x3 grid
2. Players take turns placing their marks (X or O)
3. To make a move, enter:
   - Row number (0-2)
   - Column number (0-2)
4. The game ends when either:
   - A player wins by getting three marks in a row (horizontally, vertically, or diagonally)
   - The board is full with no winner (draw)

## Technical Details

- Written in Java
- Uses 2D array to represent the game board
- Input handling using Java Scanner class
- Modular code structure with separate methods for:
  - Board initialization
  - Move validation
  - Win checking
  - Draw detection
  - Board display

## Requirements

- Java Runtime Environment (JRE) 8 or higher
- Java Development Kit (JDK) for compilation

## How to Run

1. Compile the game:
2. Run the game:
   
## Future Improvements

Potential enhancements that could be added:
- GUI implementation
- AI opponent
- Score tracking
- Game replay feature
- Customizable board size
- Network multiplayer support

## License

Feel free to use and modify this code for your own projects.

## Author

[Shaikh Chanu]

## Contributing

Feel free to fork this project and submit pull requests with improvements!
# Simple 2 Player TicTacToe Game

A console-based Tic Tac Toe game implemented in Java where two players can play against each other.

## Game Logic

1. **Board Structure**
   - Uses a 3x3 grid represented by a 2D char array
   - Empty cells are marked with spaces
   - Player X uses 'X' symbol
   - Player O uses 'O' symbol

2. **Game Flow**
   - Game starts with an empty board
   - Players take turns (X goes first)
   - Each turn:
     - Board is displayed
     - Current player enters row (0-2) and column (0-2)
     - Move is validated
     - Board is updated if move is valid

3. **Win Conditions**
   - Three same symbols in a row (horizontally)
   - Three same symbols in a column (vertically)
   - Three same symbols in a diagonal

4. **Draw Condition**
   - All cells are filled
   - No player has won

## How to Play

1. Run the game
2. Enter row number (0-2) when prompted
3. Enter column number (0-2) when prompted
4. Game continues until someone wins or it's a draw

## Board Coordinates

## Requirements
- Java Runtime Environment (JRE)

## How to Run
1. Compile: `javac TicTacToe.java`
2. Run: `java TicTacToe`
