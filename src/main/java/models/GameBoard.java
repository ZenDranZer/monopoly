package models;

import java.util.ArrayList;
import java.util.List;

public class GameBoard {

	List<Square> squares;
	
	public GameBoard() {
		squares = new ArrayList<Square>();
	}

	public Square getSquareAtIndex(int index) {
		if(squares == null)
			return null;
		try {
			return squares.get(index);
		}catch(Exception e) {
			return null;
		}
	}
	
	public void addSquare(String name) {
		Square square = new Square(name);
		squares.add(square);
	}
	
}
