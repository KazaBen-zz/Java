package assignment2017;

import uk.ac.sheffield.com1003.EasyReader;

public class PlayConnect4 {

	public static void main(String[] args) {
		MyGameState gameState = new MyGameState();
		gameState.startGame();
		EasyReader read = new EasyReader();
	//	gameState.board[0][0]=0;
		//gameState.board[gameState.getRows()-1][6]=1;
		//gameState.board[gameState.getRows()][gameState.getCols()]=0;
		int input = 50;
		while(input!=10){
			gameState.promt();
			input = read.readInt();
			gameState.move(input);
			Connect4ConsoleDisplay.display(gameState, gameState.getRows(),gameState.getCols());
		}
		}

}
