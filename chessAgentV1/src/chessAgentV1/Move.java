package chessAgentV1;

public class Move {
	public int position;
	public int destination;
	
	Move(int position, int destination){
		this.position = position;
		this.destination = destination;
	}
	
	public boolean compare(int position, int destination){
		if(this.position == position && this.destination == destination){
			return true;
		}
		return false;
	}
}