package chessAgentV1;

import java.util.Scanner;

public class Game {

	private ChessGame game;

	Game() {
		game = new ChessGame();
	}

	public static void main(String[] args) {
		Game game = new Game();

		//game.playerVsPlayer();
		game.playerVsMCTS();
	}

	public void playerVsPlayer() {
		boolean running = true;
		Scanner input = new Scanner(System.in);

		game.setupBoard();

		printBoard(game);

		while (running) {
			System.out.printf("Please enter your move: ");
			String[] inputValues = input.nextLine().split(" ");
			if (game.moveCheck(Integer.parseInt(inputValues[0]), Integer.parseInt(inputValues[1]))) {
				if (game.check(game)) {
					if (game.checkMate(game)) {
						running = false;
					}
				}
				game.changePlayer(game);
				printBoard(game);
			}
		}

	}
	
	public void playerVsMCTS(){
		MonteCarlo machine = new MonteCarlo(game, 60);
		
		machine.generateMove();
		
	}
	
	public void printBoard(ChessGame game) {

		for (int i = 0; i < game.getBoard().length; i++) {
			if (i % 8 == 0 && i != 0) {
				System.out.printf("\n");
			}
			System.out.printf("%3d", game.getBoard()[i]);
		}
		System.out.printf("\n");
	}
}