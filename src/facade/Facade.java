package facade;

import subsystem.MyFileReader;
import subsystem.MyFileWriter;
import subsystem.FileEncryptor;
import java.io.IOException;

public class Facade {
    private static Facade instance;
    private final MyFileReader reader; 
    private final MyFileWriter writer;
    private final FileEncryptor encryptor;
    
    private Facade() {
        this.reader = new MyFileReader();
        this.writer = new MyFileWriter();
        this.encryptor = new FileEncryptor();
    }

    public static Facade getInstance() {
        if (instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public void writeEncryptedFile(String filePath, String content) throws IOException {
        String encrypted = encryptor.encrypt(content);
        writer.write(filePath, encrypted);
    }

    public String readDecryptedFile(String filePath) throws IOException {
        String encrypted = reader.read(filePath);
        return encryptor.decrypt(encrypted);
    }
}