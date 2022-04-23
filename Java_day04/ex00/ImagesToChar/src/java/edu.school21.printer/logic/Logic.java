package packet.newpacket;


in
import java.awt.image.*;
import java.awt.image.BufferedImage;

public class Logic {

    public static int[][] BMPToArray(String BMPFilename, char b, char w) throws IOException {
        BufferedImage image = ImageIO.read(getClass().getResource(BMPFilename));

        int [][] array2D = new int[image.getWidth()][image.getHeight()];

        for (int xPixel = 0; xPixel < image.getWidth(); xPixel++) {
            for (int yPixel = 0; yPixel < image.getHeight; yPixel++) {
                int color = image.getRGB(xPixel, yPixel);
                if (color == Color.BLACk.getRGB()) {
                    array2D[xPixel][yPixel] = b;
                }
                else {
                    array2D[xPixel][yPixel] = w;
                }
            }
        }
        return (array2D);
}