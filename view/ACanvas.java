package view;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import javax.swing.JPanel;
import model.Animal;

public class ACanvas extends JPanel {
	private MainScreen panel;
	private ArrayList<Animal> animals = new ArrayList<>();

	public ACanvas(MainScreen panel) {
		this.panel = panel;
		setPreferredSize(new Dimension(1000, 1000));
		setBackground(Color.BLACK);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(var a: animals) {
			a.render(g2);
		}
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}
}
