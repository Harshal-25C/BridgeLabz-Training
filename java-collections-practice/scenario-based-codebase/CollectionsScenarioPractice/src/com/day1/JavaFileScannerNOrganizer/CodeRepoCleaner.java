package com.day1.JavaFileScannerNOrganizer;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    private static final Pattern BAD_METHOD_PATTERN = Pattern.compile("void [A-Z][a-zA-Z0-9]*\\(");

    private static final Pattern UNUSED_IMPORT_PATTERN = Pattern.compile("import .*;");

    public Map<FileType, List<File>> scanRepo(String rootDir) throws IOException {

        Map<FileType, List<File>> result = new EnumMap<>(FileType.class);
        for(FileType type : FileType.values()) {
            result.put(type, new ArrayList<>());
        }

        List<Path> javaFiles = Files.walk(Paths.get(rootDir)).filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        for(Path path : javaFiles) {
            File file = path.toFile();
            String content = Files.readString(path);

            boolean hasBadMethod = BAD_METHOD_PATTERN.matcher(content).find();

            boolean hasUnusedImport = UNUSED_IMPORT_PATTERN.matcher(content).find();

            if(hasBadMethod && hasUnusedImport)
                result.get(FileType.ERROR).add(file);
            else if(hasBadMethod || hasUnusedImport)
                result.get(FileType.WARNING).add(file);
            else
                result.get(FileType.VALID).add(file);
        }
        return result;
    }

    //Stream-based filtering
    public List<File> filterBySize(List<File> files, long minBytes) {
        return files.stream().filter(f -> f.length() > minBytes).toList();
    }
}
