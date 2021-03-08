package model;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Animal {
	private String name;
	private String species;
	private Color color;

	public Animal(String name, String species, Color color) {
		this.name = name;
		this.species = species;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "[Animal added: " + name + ", " + species + ", diet: " + getDiet() + "]";
	}

	public abstract String getDiet();
	public abstract void render(Graphics2D g2);
}


