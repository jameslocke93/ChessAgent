package chessAgentV1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestChessGame {
	
	private ChessGame testGame = new ChessGame();
	
	@Test
	public void setupBoard() {
		int[] board = new int[] 
				{4,6,5,8,7,5,6,4,
				 3,3,3,3,3,3,3,3,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 9,9,9,9,9,9,9,9,
				 10,12,11,14,13,11,12,10};
		
		testGame.setupBoard();
		
		assertArrayEquals(board, testGame.getBoard());
	}
}
