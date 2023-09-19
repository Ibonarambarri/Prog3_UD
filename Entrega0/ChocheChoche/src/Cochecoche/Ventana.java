package Cochecoche;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Ventana extends JFrame {

    public Ventana(Coche coche) {
        setSize(1000, 750);
        setLocationRelativeTo(null);
        JPanel buttP = new JPanel();
        JPanel mainP = new JPanel();
        
        //mainP.setLayout(null);
        buttP.setBackground(Color.GRAY);

        getContentPane().add(mainP, BorderLayout.NORTH);
        getContentPane().add(buttP, BorderLayout.SOUTH);

        JButton acelB = new JButton("Acel");
        JButton decelB = new JButton("Decel");
        JButton izqB = new JButton("Izq");
        JButton derB = new JButton("Der");
        
        URL coche_url = getClass().getResource("coche.png");
        ImageIcon coche_icon = new ImageIcon(coche_url);
        Image coche_reesc = coche_icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        coche_icon = new ImageIcon(coche_reesc);
        JLabel cocheL = new JLabel(coche_icon);
        
        mainP.add(cocheL);
        
        cocheL.setBounds(0, 0, 100, 100);
        
        buttP.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttP.add(acelB);
        buttP.add(decelB);
        buttP.add(izqB);
        buttP.add(derB);

        acelB.addActionListener(e -> coche.incrementVelocidad());

        decelB.addActionListener(e -> coche.desincrementVelocidad());

        izqB.addActionListener(e -> coche.incrementAngulo());

        derB.addActionListener(e -> coche.desincrementAngulo());
    }
}
