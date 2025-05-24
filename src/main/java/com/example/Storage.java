/*
* File: Storage.java
* Author: Bartha Levente
* Copyright: 2025, Bartha Levente
* Group: IN
* Date: 2025-05-24
* Github: https://github.com/barthaleventegabor/
* Licenc: MIT
*/
package com.example;

import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void writeFile(String line) {
        try {
            tryWriteFile(line);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void tryWriteFile(String line) throws IOException {
        FileWriter fw = new FileWriter("datas.txt", true);
        fw.write(line);
        fw.write("\n");
        fw.close();
    }
}