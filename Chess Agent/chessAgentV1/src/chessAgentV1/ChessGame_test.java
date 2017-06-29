package chessAgentV1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChessGame_test {
	
	private ChessGame testGame = new ChessGame();
	
	@Test
	public void setupBoard() {
		StringBuilder sb = new StringBuilder();
		testGame.setupBoard();
		
		for(int i = 0; i < testGame.getBoard().length; i++){
			if(i > 55){
				sb.append(testGame.getBoard()[i] + " ");
			} else {
				sb.append(testGame.getBoard()[i] + "  ");
			}
			if(i % 8 == 7){
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}

}
