package Cochecoche;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.net.URL;
import java.awt.*;

public class Cochelavel extends JLabel{
    protected int rotacion;
	public int getRotacion() {
		return rotacion;
	}
	public void setRotacion(int rotacion) {
		this.rotacion = rotacion;
		repaint();
	}
	
	public Cochelavel() {
        rotacion = 0;
        setBounds(0,0,100,100);
        URL cocheURL = getClass().getResource("coche.png");
        ImageIcon icono = new ImageIcon(cocheURL);
        Image imagenCoche = icono.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icono = new ImageIcon(imagenCoche);
        setIcon(icono);
    }
	@Override
	public void paintComponent(Graphics g) {
		Image img = ((ImageIcon)getIcon()).getImage();
		Graphics2D g2 = (Graphics2D) g;
		g2.rotate(Math.toRadians(rotacion+90),50,50);
		g2.drawImage(img,0,0,100,100, null);
	}
    
}
