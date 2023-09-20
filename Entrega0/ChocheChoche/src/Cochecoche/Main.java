package Cochecoche;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Cochemove coche = new Cochemove();
		coche.setVelocidad(100);     
		coche.setDirection(0);
		Ventana ventana = new Ventana(coche);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Thread hiloMueve = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(ventana.isVisible()) {
					double alto = ventana.mainP.getHeight();
					double ancho = ventana.mainP.getWidth();

                    // Rebote Vertical
					if (coche.Y < 0 || coche.Y + 100 > alto) {    
						coche.direction = 180 - coche.direction;
						if (coche.direction < 0) coche.direction += 360;
						coche.cocheL.setRotacion(coche.direction);
						coche.Y = (coche.Y < 0) ? 0 : alto - 100; // Ajusta la posición en Y
						System.out.println("Angulo: " + coche.direction);
						System.out.println("Velocidad: " + coche.velocidad);
					}

					// Rebote Horizontal
					if (coche.X < 0 || coche.X + 100 > ancho) {
						if (coche.direction <= 180) {
							coche.direction = 360 - coche.direction;
						} else {
							coche.direction = coche.direction - 180;
						}
						coche.cocheL.setRotacion(coche.direction);
						coche.X = (coche.X < 0) ? 0 : ancho - 100; // Ajusta la posición en X
						System.out.println("Angulo: " + coche.direction);
						System.out.println("Velocidad: " + coche.velocidad);
					}


					coche.mueve(0.04);
					ventana.repaint();
					try {
	           			Thread.sleep(40);
	           		} catch (InterruptedException e) {
	           			System.out.println("Error");
	           		}
				}
				
			}
		});
		hiloMueve.start();
	}
}
