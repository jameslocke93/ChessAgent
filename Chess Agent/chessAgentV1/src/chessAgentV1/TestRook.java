package chessAgentV1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRook {
	
	private ChessGame testGame = new ChessGame();
	
	@Test
	public void rookMoveForwardBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 10,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{10,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(56, 0));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void rookMoveForwardWhite(){
		int[] board = new int[] 
				{4,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 4,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(0, 56));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void rookMoveLeftBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,10,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 10,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(33, 32));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void rookMoveRightBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,10,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,10,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(33, 39));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void rookMoveRightWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,4,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,4,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(22, 23));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void rookMoveLeftWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,4,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 4,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(22, 16));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}

}
