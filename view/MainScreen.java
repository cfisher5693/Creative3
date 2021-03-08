package view;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AnimalEventListener;

public class MainScreen {
	private JFrame window;
	private ACanvas canvas;
	private JTextField nameField = new JTextField("Enter Animal Name");
	private JTextField speciesField = new JTextField("Enter Species Name");
	private JButton clearButton = new JButton("Clear");
	private JButton addButton = new JButton("Add");
	private String[] diets = new String[] {"Herbivore", "Omnivore", "Carnivore"};
	private JComboBox<String> dietList = new JComboBox<>(diets);
	
	public MainScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		JPanel southPanel = new JPanel();
		cp.add(BorderLayout.SOUTH, southPanel);
		southPanel.add(addButton);
		southPanel.add(nameField);
		southPanel.add(dietList);
		southPanel.add(speciesField);
		southPanel.add(clearButton);
		canvas = new ACanvas(this);
		cp.add(BorderLayout.CENTER, canvas);
		AnimalEventListener listener = new AnimalEventListener(this);
		addButton.addActionListener(listener);
		dietList.addActionListener(listener);
		clearButton.addActionListener(listener);
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getClearButton() {
		return clearButton;
	}

	public JComboBox<String> getDietList() {
		return dietList;
	}

	public ACanvas getCanvas() {
		return canvas;
	}

	public JFrame getWindow() {
		return window;
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getSpeciesField() {
		return speciesField;
	}
}
