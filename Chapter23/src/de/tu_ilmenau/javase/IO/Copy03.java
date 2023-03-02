package de.tu_ilmenau.javase.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy03 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("Chapter23/src/de/tu_ilmenau/javase/IO/Copy02.java");
            fw = new FileWriter("Copy02.java");

            char[] chars = new char[512 * 1024];
            int count = 0;
            while ((count = fr.read(chars)) != -1){
                fw.write(chars, 0, count);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
