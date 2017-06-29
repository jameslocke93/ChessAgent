package chessAgentV1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPawn {

	private ChessGame testGame = new ChessGame();
	
	@Test
	public void pawnFirstMoveDoubleWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(9, 25));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnFirstMoveSingleWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(9, 17));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnFirstMoveDoubleBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(49, 33));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnFirstMoveSingleBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(49, 41));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnSecondMoveSingleWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		testGame.moveCheck(9, 17);
		testGame.moveCheck(17, 25);
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnSecondMoveSingleBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		testGame.moveCheck(49, 41);
		testGame.moveCheck(41, 33);
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnSecondMoveDoubleWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		testGame.moveCheck(9, 17);
		assertFalse(testGame.moveCheck(17, 33));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnSecondMoveDoubleBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		testGame.moveCheck(49, 41);
		assertFalse(testGame.moveCheck(41, 25));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnIllegalMoveWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(9, 18));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnIllegalMoveBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertFalse(testGame.moveCheck(49, 42));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnLegalTakeRightWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 0,0,9,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,3,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(9, 18));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnLegalTakeLeftWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,3,0,0,0,0,0,0,
				 9,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 3,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(9, 16));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnLegalTakeRightBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,3,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,9,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(49, 42));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnLegalTakeLeftBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 3,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 9,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(49, 40));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnIllegalTakeLeftWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 3,0,0,0,0,0,0,9,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 3,0,0,0,0,0,0,9,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(8, 15));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnIllegalTakeRightWhite(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,3,
				 0,0,0,0,0,0,0,0,
				 9,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,3,
				 0,0,0,0,0,0,0,0,
				 9,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(15, 24));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnIllegalTakeLeftBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,3,
				 0,0,0,0,0,0,0,0,
				 9,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,3,
				 0,0,0,0,0,0,0,0,
				 9,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertFalse(testGame.moveCheck(48, 39));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void pawnIllegalTakeRightBlack(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 3,0,0,0,0,0,0,9,
				 0,0,0,0,0,0,0,0,};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 3,0,0,0,0,0,0,9,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertFalse(testGame.moveCheck(55, 48));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}

}
