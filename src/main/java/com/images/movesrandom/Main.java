package com.images.movesrandom;

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
        BufferedImage image;
        private int x = 10;
        private int y = 10;
        private int stepx = 10;
        private int stepy = 10;

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
            x += stepx;
            y += stepy;

            if (x < 0 || x > getWidth() - image.getWidth()) {
                stepx *= -1;
                colorChange(image);
            }

            if (y < 0 || y > getHeight() - image.getHeight()) {
                stepy *= -1;
                colorChange(image);
            }
        }

        private static BufferedImage colorChange(BufferedImage image) {
            int width = image.getWidth();
            int height = image.getHeight();
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            for (int xx = 0; xx < width; xx++) {
                for (int yy = 0; yy < height; yy++) {
                    Color origColor = new Color(image.getRGB(xx, yy), true);
                    Color newColor = new Color(r, g, b, origColor.getAlpha());
                    image.setRGB(xx, yy, newColor.getRGB());
                }
            }
            return image;
        }
    }
}