package com.kh.poly.chap01.ex.model.vo;

public class Desktop extends Electronics{
	private String graphicCard;
	
	public Desktop() {}

	public Desktop(boolean power, String brand, String sNum, String graphicCard) {
		super(power, brand, sNum);
		this.graphicCard = graphicCard;
	}
	
	public String getGraphicCard() {
		return graphicCard;
	}
	
	public void setGraphiCard(String grapicCard) {
		this.graphicCard = grapicCard;
	}

	@Override
	public String toString() {
		return "Desktop [" + super.toString() + ", graphicCard = " + graphicCard + "]";
	}
	
	
	
}
