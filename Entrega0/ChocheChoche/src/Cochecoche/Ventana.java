package Cochecoche;

import javax.swing.*;
import java.awt.*;


public class Ventana extends JFrame {
    
    JPanel buttP = new JPanel();
    JPanel mainP = new JPanel();

    public Ventana(Cochemove coche) {
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        buttP.setBackground(Color.GRAY);

        add(mainP, BorderLayout.CENTER);
        getContentPane().add(buttP, BorderLayout.SOUTH);

        JButton acelB = new JButton("Acel");
        JButton decelB = new JButton("Decel");
        JButton izqB = new JButton("Izq");
        JButton derB = new JButton("Der");
    
        buttP.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttP.add(acelB);
        buttP.add(decelB);
        buttP.add(izqB);
        buttP.add(derB);

        mainP.add(coche.cocheL);

        acelB.addActionListener(e -> coche.incrementVelocidad());

        decelB.addActionListener(e -> coche.desincrementVelocidad());

        izqB.addActionListener(e -> coche.incrementAngulo());

        derB.addActionListener(e -> coche.desincrementAngulo());
    }
}
