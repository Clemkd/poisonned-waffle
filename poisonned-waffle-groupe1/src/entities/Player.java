package entities;
import interfaces.BoardInterface;
import interfaces.PlayerInterface;

public class Player implements PlayerInterface{

	private BoardInterface board;
	
	@Override
	public Cell play() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(BoardInterface board) {
		// TODO Auto-generated method stub
		this.board = board;
	}

}
