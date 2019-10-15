/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaci;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author danilo
 */
public class Domaci {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JButton b2;
    private JLabel lab;
    private JLabel lab2;
    private JLabel lab3;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;

    public Domaci() {
        gui();
    }

    public void gui() {
        f = new JFrame("FMath");

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);

        p = new JPanel(new GridBagLayout());
        p.setBackground(Color.BLUE);

        lab = new JLabel("a: ");
        lab2 = new JLabel("b: ");
        lab3 = new JLabel("Result: ");
        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        tf1 = new JTextField(null, 15);
        tf2 = new JTextField(null, 15);
        tf3 = new JTextField(null, 15);

        tf3.setEditable(false);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c;
                try {
                    a = Integer.parseInt(tf1.getText());
                    b = Integer.parseInt(tf2.getText());
                    c = a + b;
                    tf3.setText(Integer.toString(c));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Greska.Unesite broj");
                }
            }
        });
         b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a, b, c;
                try {
                    a = Integer.parseInt(tf1.getText());
                    b = Integer.parseInt(tf2.getText());
                    c = a - b;
                    tf3.setText(Integer.toString(c));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Greska.Unesite broj");
                }
            }
        });

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(20, 5, 20, 5);

        c.gridx = 0;
        c.gridy = 0;
        p.add(lab, c);

        c.gridx = 1;
        c.gridy = 0;
        p.add(tf1, c);

        c.gridx = 0;
        c.gridy = 2;
        p.add(lab2, c);

        c.gridx = 1;
        c.gridy = 2;
        p.add(tf2, c);

        c.gridx = 0;
        c.gridy = 3;
        p.add(lab3, c);

        c.gridx = 1;
        c.gridy = 3;
        p.add(tf3, c);

        c.gridx = 0;
        c.gridy = 4;
        p.add(b1, c);

        c.gridx = 1;
        c.gridy = 4;
        p.add(b2, c);

        f.add(p);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        Domaci d = new Domaci();
    }

}
