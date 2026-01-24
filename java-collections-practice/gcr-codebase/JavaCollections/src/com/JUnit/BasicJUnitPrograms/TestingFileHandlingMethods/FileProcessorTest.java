package com.JUnit.BasicJUnitPrograms.TestingFileHandlingMethods;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileProcessorTest {

    private FileProcessor fileProcessor;
    private Path tempFile;

    @BeforeEach
    void setUp() throws IOException {
        fileProcessor = new FileProcessor();
        tempFile = Files.createTempFile("junit-test", ".txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    // Test writing and reading content
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "JUnit File Handling Test";

        fileProcessor.writeToFile(tempFile.toString(), content);
        String result = fileProcessor.readFromFile(tempFile.toString());

        assertEquals(content, result);
    }

    // Test if file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(tempFile.toString(), "Test Content");

        assertTrue(Files.exists(tempFile));
    }

    // Test handling of IOException for non-existing file
    @Test
    void testReadFromNonExistingFile() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("non_existing_file.txt");
        });
    }
}
