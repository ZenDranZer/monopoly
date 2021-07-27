package models;

public class Player {
	
	public Player(int cash, String token, int position) {
		super();
		this.cash = cash;
		this.token = token;
		this.position = position;
	}
	
	int cash;
	String token;
	int position;
	
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}

}
