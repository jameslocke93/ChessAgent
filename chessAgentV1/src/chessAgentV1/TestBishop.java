package chessAgentV1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBishop {

	private ChessGame testGame = new ChessGame();
	
	@Test
	public void bishopMoveWhitePlus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
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
				 0,5,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 41));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopMoveBlackPlus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,11,0,0,0,0,
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
				 0,11,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.BLACK_PLAYER);
		assertTrue(testGame.moveCheck(27, 41));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopMovePlus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
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
				 0,0,0,0,0,5,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 45));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopMoveMinus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,5,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 13));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopMoveMinus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,5,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 9));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopBlockedPlus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,5,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,5,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(27, 41));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopBlockedPlus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,5,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,5,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(27, 45));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopBlockedMinus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,5,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,5,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(27, 13));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopBlockedMinus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,5,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,5,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(27, 9));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopTakePlus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,5,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 41));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopTakePlus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,9,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,5,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 54));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopTakeMinus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,9,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,5,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 13));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopTakeMinus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,9,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,5,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,5,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(27, 9));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopIllegalPlus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 5,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 5,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(8, 15));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopIllegalMinus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 5,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 5,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(16, 7));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopIllegalPlus9(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,5,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,5,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(23, 32));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopIllegalMinus7(){
		int[] board = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,5,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,5,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(23, 16));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopZeroLegalMove(){
		int[] board = new int[] 
				{5,0,0,0,0,0,0,0,
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
				 0,0,5,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertTrue(testGame.moveCheck(0, 18));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}
	
	@Test
	public void bishopZeroIllegalMove(){
		int[] board = new int[] 
				{5,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0};
		
		int[] expectedBoard = new int[] 
				{5,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,
				 0,0,0,0,0,0,0,0,};
		testGame.setupBoard();
		testGame.setBoard(board);
		testGame.setPlayer(ChessGame.WHITE_PLAYER);
		assertFalse(testGame.moveCheck(0, 19));
		
		assertArrayEquals(expectedBoard, testGame.getBoard());
	}

}
