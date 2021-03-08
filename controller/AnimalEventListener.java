package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MainScreen;

public class AnimalEventListener implements ActionListener{
	private MainScreen panel;

	public AnimalEventListener(MainScreen panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
	}
	
}
