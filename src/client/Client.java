package client;

import facade.Facade;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        
        String filePath = "test.txt";
        String originalContent = "¡Hola, patrón Facade en Java!";

        Facade facade = Facade.getInstance();

        try {
            facade.writeEncryptedFile(filePath, originalContent);
            System.out.println("Archivo encriptado y guardado.");

            String decrypted = facade.readDecryptedFile(filePath);
            System.out.println("Contenido desencriptado: " + decrypted);
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}