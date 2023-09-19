package Cochecoche;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Coche coche = new Coche();
		Ventana vent = new Ventana(coche);
		vent.setVisible(true);
		vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
