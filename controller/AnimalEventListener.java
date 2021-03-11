package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Animal;
import model.Carnivore;
import model.Herbivore;
import model.Omnivore;
import view.MainScreen;

public class AnimalEventListener implements ActionListener{
	private MainScreen panel;

	public AnimalEventListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if(source == panel.getClearButton()) {
			ArrayList<Animal> animals = panel.getCanvas().getAnimals();
			animals.clear();
			panel.getCanvas().repaint();
		}
		if(source == panel.getAddButton()) {
			ArrayList<Animal> animals = panel.getCanvas().getAnimals();
			String diet = (String) panel.getDietList().getSelectedItem();
			if(diet == "Herbivore") {
				animals.add(new Herbivore(panel.getNameField().getText(), panel.getSpeciesField().getText()));
			}
			if(diet == "Omnivore") {
				animals.add(new Omnivore(panel.getNameField().getText(), panel.getSpeciesField().getText()));
			}
			if(diet == "Carnivore") {
				animals.add(new Carnivore(panel.getNameField().getText(), panel.getSpeciesField().getText()));
			}
			panel.getCanvas().repaint();
		}
	}
}
