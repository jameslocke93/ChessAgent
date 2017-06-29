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
	public boolean moveCheck(int position, int destination) {

		// Check if position and destination are within bounds and not empty
		if (position < 0 | position > board.length) {
			return false;
		}
		if (destination < 0 | position > board.length) {
			return false;
		}
		// Checks to see what piece is in the position
		switch (board[position]) {
		case WHITE_PAWN:
		case BLACK_PAWN:
			return movePawn(position, destination);
		case WHITE_ROOK:
		case BLACK_ROOK:
			return moveRook(position, destination);
		case WHITE_BISHOP:
		case BLACK_BISHOP:
			return moveBishop(position, destination);
		case WHITE_KNIGHT:
		case BLACK_KNIGHT:
			return moveKnight(position, destination);
		case WHITE_KING:
		case BLACK_KING:
			return moveKing(position, destination);
		case WHITE_QUEEN:
		case BLACK_QUEEN:
			return moveQueen(position, destination);
		default:
			break;
		}

		return false;
	}

	// Conduct the move
	private boolean move(int position, int destination) {
		board[destination] = board[position];
		board[position] = BLANK;

		return true;
	}

	// Each individual piece move function that is only accessed by public move
	private boolean movePawn(int position, int destination) {

		// Checks to see if the pawn belongs to the current player
		if (board[position] == WHITE_PAWN && currentPlayer != WHITE_PLAYER) {
			return false;
		} else if (board[position] == BLACK_PAWN && currentPlayer != BLACK_PLAYER) {
			return false;
		}

		int rowPosition = position % 8;

		if (currentPlayer == WHITE_PLAYER && board[destination] >= BLACK_PAWN) {
			// Legal take
			if (rowPosition == 0) {
				if (destination == position + 9) {
					return move(position, destination);
				}
			} else if (rowPosition == 7) {
				if (destination == position + 7) {
					return move(position, destination);
				}
			} else {
				if (destination == position + 7) {
					return move(position, destination);
				} else if (destination == position + 9) {
					return move(position, destination);
				}
			}
		} else if (currentPlayer == BLACK_PLAYER && board[destination] <= WHITE_QUEEN && board[destination] > BLANK) {
			// Legal take
			if (rowPosition == 0) {
				if (destination == position - 7) {
					return move(position, destination);
				}
			} else if (rowPosition == 7) {
				if (destination == position - 9) {
					return move(position, destination);
				}
			} else {
				if (destination == position - 7) {
					return move(position, destination);
				} else if (destination == position - 9) {
					return move(position, destination);
				}
			}
		}

		int firstMoveArrayPosition = 0;

		// Check to see if this is a double or single move
		if (position >= 8 && position <= 15) {
			firstMoveArrayPosition = position % 8;
			if (firstMoves[firstMoveArrayPosition]) {
				// Then white pawn double move is allowed
				if (board[destination] == BLANK) {
					if (destination == position + 8 || destination == position + 16) {
						// Change it so that its first move is now false
						firstMoves[firstMoveArrayPosition] = false;
						return move(position, destination);
					}
				}
			}
		} else if (position >= 48 && position <= 55) {
			firstMoveArrayPosition = (position % 8) + 8;
			if (firstMoves[firstMoveArrayPosition]) {
				// Then black pawn double move is allowed
				if (board[destination] == BLANK) {
					if (destination == position - 8 || destination == position - 16) {
						firstMoves[firstMoveArrayPosition] = false;
						return move(position, destination);
					}
				}
			}
		}

		if (board[position] == WHITE_PAWN) {
			// Then white pawn single move is allowed
			if (board[destination] == BLANK) {
				if (destination == position + 8) {
					return move(position, destination);
				}
			}
		} else {
			// Black pawn single move is allowed
			if (board[destination] == BLANK) {
				if (destination == position - 8) {
					return move(position, destination);
				}
			}
		}
		return false;
	}

	private boolean moveRook(int position, int destination) {

		// Checks to see if the pawn belongs to the current player
		if (board[position] == WHITE_ROOK && currentPlayer != WHITE_PLAYER) {
			return false;
		} else if (board[position] == BLACK_ROOK && currentPlayer != BLACK_PLAYER) {
			return false;
		}

		boolean blocked = false;
		// Check if the movement is forward/backwards
		if (position % 8 == destination % 8) {
			if (position < destination) {
				for (int i = position + 1; i < destination; i++) {
					if (i % 8 == position % 8) {
						if (board[i] != BLANK) {
							blocked = true;
						}
					}
				}
			} else {
				for (int i = position - 1; i > destination; i--) {
					if (i % 8 == position % 8) {
						if (board[i] != BLANK) {
							blocked = true;
						}
					}
				}
			}
		} else if (position >= 56) {
			if (destination < 56 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else if (position >= 48) {
			if (destination < 48 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else if (position >= 40) {
			if (destination < 40 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else if (position >= 32) {
			if (destination < 32 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						System.out.println(i);
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else if (position >= 24) {
			if (destination < 24 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else if (position >= 16) {
			if (destination < 16 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else if (position >= 8) {
			if (destination < 8 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		} else {
			if (destination < 0 + 8) {
				for (int i = position + 1; i < destination; i++) {
					if (board[i] != BLANK) {
						blocked = true;
					}
				}
			} else {
				return false;
			}
		}

		if (!blocked) {
			move(position, destination);
			return true;
		}

		return false;
	}

	private boolean moveBishop(int position, int destination) {
		return false;
	}

	private boolean moveKnight(int position, int destination) {
		return false;
	}

	private boolean moveKing(int position, int destination) {
		return false;
	}

	private boolean moveQueen(int position, int destination) {
		return false;
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

	public void setBoard(int[] board) {
		this.board = board;
	}

	public void setPlayer(int player) {
		currentPlayer = player;
	}
}
