package model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Herbivore extends Animal {
	private String diet;

	public Herbivore(String name, String species) {
		super(name, species, Color.GREEN);
		diet = "Flora";
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
