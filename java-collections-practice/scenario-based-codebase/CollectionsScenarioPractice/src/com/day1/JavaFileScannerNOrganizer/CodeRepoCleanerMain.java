package com.day1.JavaFileScannerNOrganizer;
import java.io.*;
import java.util.*;

public class CodeRepoCleanerMain {

    public static void main(String[] args) throws Exception {

        CodeRepoCleaner cleaner = new CodeRepoCleaner();
        Map<FileType, List<File>> report = cleaner.scanRepo("src");

        report.forEach((type, files) -> {
            System.out.println("\n" + type + " FILES:");
            files.forEach(f -> System.out.println(f.getName()));
        });
    }
}
