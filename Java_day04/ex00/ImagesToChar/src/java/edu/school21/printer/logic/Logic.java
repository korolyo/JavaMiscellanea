package edu.school21.printer.logic;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.io.FileInputStream;
import javax.imageio.*;

public class Logic {

    public static int[][] BMPToArray(String BMPFilename, char b, char w) throws IOException {

        BufferedImage image = ImageIO.read(new FileInputStream(BMPFilename));

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
