package day27;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

    }

    /**
     * Task 1
     * A method that accepts a txt file, counts the amount of hello's in the file
     * and writes it to another file.
     */
    public static void countHellos() throws IOException {
        //Uses my files' paths from my PC
        File srcFile = new File("C:\\Users\\PC\\IdeaProjects\\Homeworks\\src\\day27\\hello.txt");
        File destFile = new File("C:\\Users\\PC\\IdeaProjects\\Homeworks\\src\\day27\\helloCount.txt");
        FileReader fr = new FileReader(srcFile);
        FileWriter fw = new FileWriter(destFile);
        BufferedReader reader = new BufferedReader(fr);
        String[] words;
        String line;
        String search = "hello";
        int count = 0;
        while ((line = reader.readLine()) != null) {
            words = line.split(" ");
            for (String word : words) {
                if (word.equals(search)) {
                    count++;
                }
            }
        }
        fr.close();
        BufferedWriter writer = new BufferedWriter(fw);
        writer.write("The count of hello's is " + count);
        writer.close();
    }
}