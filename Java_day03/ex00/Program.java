import java.util.*;
import java.io.*;

public class Program  implements Runnable{

    private int count;
    private String message;

    private static int cycleCount;
    private static final String USAGE = "usage:/njava Program --count=[int>0]";

    public static void main(String[] args) throws InterruptedException {

        if (!validate(args)) {
            System.out.println(USAGE);
            System.exit(-1);
        }

        Thread thread

    }
}