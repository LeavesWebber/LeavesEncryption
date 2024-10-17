package top.kiss1314.Encryption.model;

public class EncryptionFactory {
    public static EncryptionStrategy getEncryption(String type) {
        if (type.equalsIgnoreCase("caesar")) {
            return new CaesarCipher();
        } else if (type.equalsIgnoreCase("vigenere")) {
            return new VigenereCipher();
        }
        throw new IllegalArgumentException("Unknown encryption type: " + type);
    }
}