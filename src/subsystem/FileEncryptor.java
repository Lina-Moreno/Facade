package subsystem;

import java.util.Base64;

public class FileEncryptor {
    public String encrypt(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes());
    }

    public String decrypt(String text) {
        return new String(Base64.getDecoder().decode(text));
    }
}