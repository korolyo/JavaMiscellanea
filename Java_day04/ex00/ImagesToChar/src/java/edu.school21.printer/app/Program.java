package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

import java.io.*;

public class Program {

    public static void main(String[] args){

        if (args.length != 3) {
            System.out.println("Try again.\nWrong number of arguments");
            System.exit(-1);
        }

        char w = args[0].charAt(0);
        char b = args[1].charAt(0);
        String filename = new String(args[2]);

        int[][] array2D = Logic.BMPToArray(filename, w, b);

        for (int x = 0; x < array2D.length; x++) {
            for (int y = 0; y < array2D[x].length; y++) {
                System.out.println((char)array2D[y][x]);
            }
            System.out.println();
        }
    }
}