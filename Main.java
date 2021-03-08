import javax.swing.JFrame;

import view.MainScreen;

public class Main {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(550, 30);
		window.setTitle("Food Chain");
		var main = new MainScreen(window);
		main.init();
		window.pack();
		window.setVisible(true);
	}
}