package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileInputStream inputStream = new FileInputStream(file);
        int[] symbols = new int[256];

        while (inputStream.available()>0) {
            int i = inputStream.read();
            symbols[i]++;
        }
        inputStream.close();

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i]!=0)
                System.out.println((char)i + " " + symbols[i]);
        }
    }
}
