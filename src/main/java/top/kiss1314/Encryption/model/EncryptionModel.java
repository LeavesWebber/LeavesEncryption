package top.kiss1314.Encryption.model;

public class EncryptionModel {
    private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String plainText, String key) {
        return strategy.encrypt(plainText, key);
    }

    public String decrypt(String cipherText, String key) {
        return strategy.decrypt(cipherText, key);
    }
}