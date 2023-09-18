package Entrega0.ChocheChoche.src.Cochecoche;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class Ventana extends JFrame {

    private BufferedImage imagen;

    public Ventana(Coche coche) {
        setSize(1000, 750);
        setLocationRelativeTo(null);
        JPanel buttP = new JPanel();
        JPanel mainP = new JPanel();
        
        mainP.setLayout(null);
        buttP.setBackground(Color.GRAY);

        getContentPane().add(mainP, BorderLayout.NORTH);
        getContentPane().add(buttP, BorderLayout.SOUTH);

        JButton acelB = new JButton("Acel");
        JButton decelB = new JButton("Decel");
        JButton izqB = new JButton("Izq");
        JButton derB = new JButton("Der");
        
        URL coche_url = getClass().getResource("coche.png");
        ImageIcon coche_icon = new ImageIcon(coche_url);
        JLabel cocheL = new JLabel(coche_icon);
        
        mainP.add(cocheL);
        
        cocheL.setBounds(-3000, 1, 100, 100);
        
        buttP.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttP.add(acelB);
        buttP.add(decelB);
        buttP.add(izqB);
        buttP.add(derB);

        try {
            imagen = ImageIO.read(getClass().getResource("coche.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        acelB.addActionListener(e -> {coche.incrementVelocidad();});

        decelB.addActionListener(e -> {coche.desincrementVelocidad();});

        izqB.addActionListener(e -> coche.incrementAngulo());

        derB.addActionListener(e -> coche.desincrementAngulo());
    }
}
