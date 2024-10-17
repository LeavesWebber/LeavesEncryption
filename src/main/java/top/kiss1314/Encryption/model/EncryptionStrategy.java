package top.kiss1314.Encryption.model;

public interface EncryptionStrategy {
    String encrypt(String plainText, String key);
    String decrypt(String cipherText, String key);
}
