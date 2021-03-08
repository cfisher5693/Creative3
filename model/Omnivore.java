package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Omnivore extends Animal {
	private String diet;
	
	public Omnivore(String name, String species) {
		super(name, species, Color.YELLOW);
		diet = "Flora and Fauna";
	}

	@Override
	public String getDiet() {
		return diet;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(super.getColor());
	}
	
}
