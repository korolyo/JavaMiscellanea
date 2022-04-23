package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Logic {

    public static int[][] BMPToArray(String BMPFilename, char w, char b) throws IOException {

        BufferedImage image = ImageIO.read(Logic.class.getResource("/resources/image.bmp"));

        int [][] array2D = new int[image.getWidth()][image.getHeight()];

        for (int yPixel = 0; yPixel < image.getWidth(); yPixel++) {
            for (int xPixel = 0; xPixel < image.getHeight(); xPixel++) {
                int color = image.getRGB(xPixel, yPixel);
                if (color == Color.BLACK.getRGB()) {
                    array2D[yPixel][xPixel] = b;
                }
                else {
                    array2D[yPixel][xPixel] = w;
                }
            }
        }
        return (array2D);
    }
}
