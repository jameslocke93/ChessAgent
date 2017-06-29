package chessAgentV1;

public class ChessGame {

	public static final int BLANK = 0;
	public static final int WHITE_PLAYER = 1;
	public static final int BLACK_PLAYER = 2;

	public static final int WHITE_PAWN = 3;
	public static final int WHITE_ROOK = 4;
	public static final int WHITE_BISHOP = 5;
	public static final int WHITE_KNIGHT = 6;
	public static final int WHITE_KING = 7;
	public static final int WHITE_QUEEN = 8;

	public static final int BLACK_PAWN = 9;
	public static final int BLACK_ROOK = 10;
	public static final int BLACK_BISHOP = 11;
	public static final int BLACK_KNIGHT = 12;
	public static final int BLACK_KING = 13;
	public static final int BLACK_QUEEN = 14;

	private int[] board;
	private boolean[] firstMoves;
	private int currentPlayer;

	public ChessGame() {
		board = new int[64];
		firstMoves = new boolean[22];
	}

	public void setupBoard() {

		currentPlayer = WHITE_PLAYER;

		// Used for the pawns, rooks and kings to see if it is the first move
		for (int i = 0; i < firstMoves.length; i++) {
			firstMoves[i] = true;
		}

		// Setup pieces on the board
		for (int i = 0; i < board.length; i++) {
			switch (i) {
			case 0:
			case 7:
				board[i] = WHITE_ROOK;
				break;
			case 1:
			case 6:
				board[i] = WHITE_KNIGHT;
				break;
			case 2:
			case 5:
				board[i] = WHITE_BISHOP;
				break;
			case 3:
				board[i] = WHITE_QUEEN;
				break;
			case 4:
				board[i] = WHITE_KING;
				break;
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				board[i] = WHITE_PAWN;
				break;
			case 48:
			case 49:
			case 50:
			case 51:
			case 52:
			case 53:
			case 54:
			case 55:
				board[i] = BLACK_PAWN;
				break;
			case 56:
			case 63:
				board[i] = BLACK_ROOK;
				break;
			case 57:
			case 62:
				board[i] = BLACK_KNIGHT;
				break;
			case 58:
			case 61:
				board[i] = BLACK_BISHOP;
				break;
			case 59:
				board[i] = BLACK_QUEEN;
				break;
			case 60:
				board[i] = BLACK_KING;
				break;
			default:
				board[i] = BLANK;
				break;
			}
		}
	}

	// The publicly accessible move function
	public void moveCheck(int position, int destination) {

		// Check if position and destination are within bounds and not empty
		if (position < 0 | position > board.length) {
			return;
		}
		if (destination < 0 | position > board.length) {
			return;
		}
		// Checks to see what piece is in the position
		switch (board[position]) {
		case WHITE_PAWN:
		case BLACK_PAWN:
			movePawn(position, destination);
			break;
		case WHITE_ROOK:
		case BLACK_ROOK:
			moveRook(position, destination);
			break;
		case WHITE_BISHOP:
		case BLACK_BISHOP:
			moveBishop(position, destination);
			break;
		case WHITE_KNIGHT:
		case BLACK_KNIGHT:
			moveKnight(position, destination);
			break;
		case WHITE_KING:
		case BLACK_KING:
			moveKing(position, destination);
			break;
		case WHITE_QUEEN:
		case BLACK_QUEEN:
			moveQueen(position, destination);
			break;
		default:
			break;
		}

	}

	// Conduct the move
	private void move(int position, int destination) {

	}

	// Each individual piece move function that is only accessed by public move
	private void movePawn(int position, int destination) {

		// Checks to see if the pawn belongs to the current player
		if (board[position] == WHITE_PAWN && currentPlayer != WHITE_PLAYER) {
			return;
		} else if (board[position] == BLACK_PAWN && currentPlayer != BLACK_PLAYER) {
			return;
		}

		int rowPosition = position % 8;
		
		
		
		int firstMoveArrayPosition = 0;
		
		// Check to see if this is a double or single move
		if (position >= 8 && position <= 15) {
			firstMoveArrayPosition = position % 8;
			if (firstMoves[firstMoveArrayPosition]) {
				// Then white pawn double move is allowed
				if (board[destination] >= BLACK_PAWN) {
					// Legal take
					if (rowPosition == 0) {
						if (destination == position + 9) {
							take(position, destination);
						} else if (rowPosition == 7) {
							if (destination == position + 7) {
								take(position, destination);
							}
						} else {
							if (destination == position + 7) {
								take(position, destination);
							} else if (destination == position + 9) {
								take(position, destination);
							}
						}
					}
				} else if (board[destination] == BLANK) {
					if (destination == position + 8 || destination == position + 16) {
						move(position, destination);
					}
				}
			}
		} else if (position >= 48 && position <= 55) {
			firstMoveArrayPosition = (position % 8) + 8;
			if (firstMoves[firstMoveArrayPosition]) {
				// Then black pawn double move is allowed
				if (board[destination] <= WHITE_QUEEN && board[destination] > BLANK) {
					// Legal take
					if(rowPosition == 0){
						if(destination == position - 7){
							take(position, destination);
						}
					} else if(rowPosition == 7){
						if(destination == position - 9){
							take(position, destination);
						}
					} else {
						if (destination == position - 7) {
							take(position, destination);
						} else if (destination == position - 9) {
							take(position, destination);
						}
					}
				} else if (board[destination] == BLANK) {
					if (destination == position - 8 || destination == position - 16) {
						move(position, destination);
					}
				}
			}
		}

		if (board[position] == WHITE_PAWN) {
			// Then white pawn single move is allowed
			if (board[destination] >= BLACK_PAWN) {
				// Legal Take
			} else if (board[destination] == BLANK) {
				if (destination == position + 8) {
					move(position, destination);
				}
			}
		} else {
			// Black pawn single move is allowed
			if (board[destination] <= WHITE_QUEEN && board[destination] > BLANK) {
				// Legal Take
			} else if (board[destination] == BLANK) {
				if (destination == position - 8) {
					move(position, destination);
				}
			}
		}

	}

	private void moveRook(int position, int destination) {

	}

	private void moveBishop(int position, int destination) {

	}

	private void moveKnight(int position, int destination) {

	}

	private void moveKing(int position, int destination) {

	}

	private void moveQueen(int position, int destination) {

	}

	// Checks for pieces being taken
	private void take(int position, int destination) {

	}

	// Checks to see if the castle movement is able to happen
	public void castle() {

	}

	public void enPassant() {

	}

	public void pawnPromote() {

	}

	public void check() {

	}

	public int[] getBoard() {
		return board;
	}
}
