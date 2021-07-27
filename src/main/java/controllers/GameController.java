package controllers;

import java.util.ArrayList;
import java.util.List;

import models.GameBoard;
import models.Player;

public class GameController {
	
	private GameBoard gameBoard;
	private List<Player> players;
	
	public GameController() {
		players = new ArrayList<Player>();
		gameBoard = new GameBoard();
	}
	
	public void setGameBoard(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void movePlayer(String token,int value) {
		Player updatedPlayer;
		for(Player player: players) {
			if (player.getToken().equals(token)) {
				player.setPosition(player.getPosition()+value);
			}
		}
	}
	
	
	
}
