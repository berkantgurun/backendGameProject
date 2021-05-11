package entities;

import abstracts.Entity;

public class Game implements Entity{
	int id ;
	String gameName;
	int unitPrice;
	double afterDiscountPrice;
	
	public Game() {
		
	}

	public Game(int id, String gameName, int unitPrice, double afterDiscountPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
		this.afterDiscountPrice = afterDiscountPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getAfterDiscountPrice() {
		return unitPrice-(unitPrice*50/100);
	}

	
	
}
