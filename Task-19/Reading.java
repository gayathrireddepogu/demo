package Task19;

import java.io.*;

public class Reading {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\pankaj\\Desktop\\test.txt";

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try (FileReader fr = new FileReader(file)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
