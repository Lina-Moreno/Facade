package subsystem;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter { 
    public void write(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) { 
            writer.write(content);
        }
    }
}