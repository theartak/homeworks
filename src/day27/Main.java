package day27;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        getUsersFromFile();
    }

    /**
     * Extra method to print the content of a file.
     */
    public static void printFileContent(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
    }

    /**
     * Task 1
     * A method that accepts a txt file, counts the amount of hello's in the file
     * and writes it to another file.
     */
    public static void countHellos() throws IOException {
        File srcFile = new File("src/day27/hello.txt");
        File destFile = new File("src/day27/helloCount.txt");
        String[] words;
        String line;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(srcFile))) {
            while ((line = reader.readLine()) != null) {
                words = line.split(" ");
                for (String word : words) {
                    if (word.equalsIgnoreCase("hello")) {
                        count++;
                    }
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("FileNotFoundException");
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {
            writer.write("The count of hello's is " + count);
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
    }

    /**
     * Task 2
     * A method that creates a user.txt file with user info in it.
     */

    public static void saveUsers() throws IOException {
        User user = new User();
        user.setName("Artak");
        user.setSurname("Karapetyan");
        user.setAge(25);
        File file = new File("src/day27/user.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(user.toString());
        } catch (IOException ioe) {
            System.out.println("IOException");
        }
    }

    public static void getUsersFromFile() throws IOException {
        File file = new File("src/day27/user.txt");
        printFileContent(file);
    }
}