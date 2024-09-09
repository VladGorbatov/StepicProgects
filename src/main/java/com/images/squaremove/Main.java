package com.images.squaremove;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.getContentPane().setBackground(Color.BLACK);
        MyComponent myComponent = new MyComponent();
        jFrame.add(myComponent);

        ActionListener imageUpdater = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myComponent.updatePosition();
                myComponent.repaint();
            }
        };

        Timer myTimer = new Timer(1, imageUpdater);
        myTimer.start();
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setTitle("StepicNextLevel");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        jFrame.setBounds(screenSize.width / 2 - 200, screenSize.height / 2 - 200, 400, 400);
        return jFrame;
    }

    static class MyComponent extends JComponent {
        private BufferedImage image;
        private int x = 500;
        private int y = 500;
        private int step = 10;

        public MyComponent() {
            try {
                image = ImageIO.read(new File("src/image_logo.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(image, x, y, this);
        }

        public void updatePosition() {
            if (x < 800 && y == 500) {
                x += step;
            } else if (x == 800 && y < 800) {
                y += step;
            } else if (y == 800 && x > 500) {
                x -= step;
            } else if (x == 500 && y > 500) {
                y -= step;
            }
        }
    }
}
