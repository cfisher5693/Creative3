package view;

import java.util.ArrayList;
import java.awt.Color;
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
}
