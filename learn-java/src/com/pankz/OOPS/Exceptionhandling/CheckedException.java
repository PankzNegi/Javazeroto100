package com.pankz.OOPS.Exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        readFile("myFile.txt");

    }
    public static void readFile(String fileName)
    {
        try {
            FileReader reader=new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist");
        }
    }
}
