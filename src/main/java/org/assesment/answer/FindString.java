package org.assesment.answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FindString {
    public static void main(String[] args) {
        FindString result = new FindString();
        result.checkFile();
    }

    public void checkFile() {
        InputStream file = getClass().getClassLoader().getResourceAsStream("coba.txt");

        if (file == null) {
            throw new IllegalArgumentException("file not found! coba.txt");
        } else {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {
                String checkLine;

                while ((checkLine = reader.readLine()) != null) {
                    String checkString = checkLine.replaceAll("[^a-zA-Z ]", "");
                    if (!checkString.trim().isEmpty()) {
                        System.out.println(checkString);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
