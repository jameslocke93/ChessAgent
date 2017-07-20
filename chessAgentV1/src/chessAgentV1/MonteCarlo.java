package chessAgentV1;

import java.util.ArrayList;
import java.util.Random;

//Basic implementation of MCTS using UCB1
public class MonteCarlo {

	ChessGame internalGame;
	ChessGame originalGame;
	long timePerMove;
	private Node gameTree;

	MonteCarlo(ChessGame game, int timePerMove) {
		internalGame = new ChessGame();
		internalGame = internalGame.setGame(game);

		originalGame = new ChessGame();
		originalGame = originalGame.setGame(game);

		this.timePerMove = timePerMove;

		gameTree = new Node();
	}

	public Move generateMove() {

		long endTime = System.nanoTime() + (timePerMove * 1000000000);

		ArrayList<Move> moveList = new ArrayList<Move>();
		double constant = 0.85;

		while (System.nanoTime() < endTime) {
			moveList = internalGame.moveList(internalGame);

			double maxScore = Double.MIN_VALUE;
			int moveIndex = 0;

			if (gameTree.numberOfChildren() == moveList.size()) {
				for (int i = 0; i < gameTree.numberOfChildren(); i++) {
					double exploitation = gameTree.getChild(i).getRatio();
					double exploration = constant
							* Math.sqrt((2 * Math.log(gameTree.getVisits()) / gameTree.getChild(i).getVisits()));
					if (exploitation + exploration > maxScore) {
						maxScore = exploitation + exploration;
						moveIndex = i;
					}

				}
				gameTree = gameTree.getChild(moveIndex);
			} else {
				for (int i = 0; i < gameTree.numberOfChildren(); i++) {
					int j = 0;
					boolean searching = true;
					while (searching && j < moveList.size()) {
						if (gameTree.getChild(i).getMove().compare(moveList.get(j))) {
							moveList.remove(j);
							searching = false;
						}
						j++;
					}
				}

				Random rand = new Random();

				moveIndex = rand.nextInt(moveList.size());
				gameTree.setChild(
						new Move(moveList.get(moveIndex).getPosition(), moveList.get(moveIndex).getDestination()));
				gameTree = gameTree.getChild(gameTree.numberOfChildren() - 1);
			}

			internalGame.moveCheck(gameTree.getMove().getPosition(), gameTree.getMove().getDestination());

			if (internalGame.kingCheck()) {
				if (internalGame.getPlayer() == originalGame.getPlayer()) {
					while (gameTree.getParent() != null) {
						gameTree.incrimenetVisits();
						gameTree.incrimentWon();
						gameTree = gameTree.getParent();
					}
					gameTree.incrimenetVisits();
				} else {
					while (gameTree.getParent() != null) {
						gameTree.incrimenetVisits();
						gameTree = gameTree.getParent();
					}
					gameTree.incrimenetVisits();
				}
				internalGame = internalGame.setGame(originalGame);
			}

			if (internalGame.check(internalGame)) {
				if (internalGame.checkMate(internalGame)) {
					if (internalGame.getPlayer() == originalGame.getPlayer()) {
						while (gameTree.getParent() != null) {
							gameTree.incrimenetVisits();
							gameTree.incrimentWon();
							gameTree = gameTree.getParent();
						}
						gameTree.incrimenetVisits();
					} else {
						while (gameTree.getParent() != null) {
							gameTree.incrimenetVisits();
							gameTree = gameTree.getParent();
						}
						gameTree.incrimenetVisits();
					}
					internalGame = internalGame.setGame(originalGame);
				}
			}

			internalGame.changePlayer(internalGame);
		}

		while (gameTree.getParent() != null) {
			gameTree = gameTree.getParent();
		}
		int numberOfCycles = 0;
		for (int i = 0; i < gameTree.numberOfChildren(); i++) {
			System.out.println(i + ": " + gameTree.getChild(i).getRatio() + " " + gameTree.getChild(i).getVisits());
			numberOfCycles += gameTree.getChild(i).getVisits();
		}
		System.out.println("Number of Cycles at the top layer: " + numberOfCycles);

		return null;
	}
}
