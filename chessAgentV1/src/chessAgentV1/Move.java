package chessAgentV1;

public class Move {
	private int position;
	private int destination;

	Move(int position, int destination) {
		this.position = position;
		this.destination = destination;
	}

	public boolean compare(Move move) {
		if (this.position == move.position && this.destination == move.destination) {
			return true;
		}
		return false;
	}

	public int getPosition() {
		return position;
	}

	public int getDestination() {
		return destination;
	}
}
