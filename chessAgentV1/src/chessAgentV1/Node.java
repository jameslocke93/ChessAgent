package chessAgentV1;

import java.util.ArrayList;

public class Node {
	private int timesVisisted, timesWon;
	private Node parent;
	private ArrayList<Node> children;
	private Move move;

	Node() {
		parent = null;
		children = new ArrayList<Node>();

		timesVisisted = 0;
		timesWon = 0;
	}

	Node(Node parent, Move move) {
		this.parent = parent;
		children = new ArrayList<Node>();
		timesVisisted = 0;
		timesWon = 0;
		this.move = move;
	}

	public boolean hasChildren() {
		if (children.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public double getRatio() {
		return (double) timesWon / timesVisisted;
	}

	public Move getMove() {
		return move;
	}

	public void setChild(Move move) {
		children.add(new Node(this, move));
	}

	public void incrimenetVisits() {
		timesVisisted++;
	}

	public void incrimentWon() {
		timesWon++;
	}

	public int getVisits() {
		return timesVisisted;
	}

	public int getWon() {
		return timesWon;
	}

	public Node getChild(int index) {
		if (children.size() >= index) {
			return children.get(index);
		} else {
			return null;
		}
	}

	public Node getParent() {
		if (parent != null) {
			return parent;
		} else {
			return null;
		}
	}

	public int numberOfChildren() {
		return children.size();
	}

}
