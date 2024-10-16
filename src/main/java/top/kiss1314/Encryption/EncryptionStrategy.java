package top.kiss1314.Encryption;

public interface EncryptionStrategy {
    String encrypt(String plainText, String key);
    String decrypt(String cipherText, String key);
}
