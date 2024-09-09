package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton1 = new JButton("Metal");
        JButton jButton2 = new JButton("Nimbus");
        JButton jButton3 = new JButton("CDE/Motif");
        JButton jButton4 = new JButton("Windows");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 16);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setFont(font);
            g2d.drawString("Hello World", 10, 60);
            Point2D p1 = new Point2D.Double(150, 150);
            Point2D p2 = new Point2D.Double(200, 200);
            Line2D l2 = new Line2D.Double(p1, p2);
            g2d.draw(l2);
            Ellipse2D e1 = new Ellipse2D.Float(200, 200, 40, 40);
            g2d.draw(e1);
            try {
                URL url = new URL("https://avatars.mds.yandex.net/i?id=acfa09c46ca903a3d75c4a753017cf44_l-4578143-images-thumbs&n=13");
                Image image = new ImageIcon(url).getImage();
                g2d.drawImage(image, 20, 0, null);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        jFrame.setBounds(screenSize.width / 2 - 200, screenSize.height / 2 - 200, 300, 300);
        return jFrame;
    }
}
