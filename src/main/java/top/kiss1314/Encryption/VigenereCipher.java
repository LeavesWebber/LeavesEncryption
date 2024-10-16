package top.kiss1314.Encryption;

public class VigenereCipher implements EncryptionStrategy {
    public String encrypt(String plainText, String key) {
        if (key.chars().anyMatch(Character::isDigit)) {
            throw new IllegalArgumentException("Numbers are not allowed in Vigenère key.");
        }
        StringBuilder result = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < plainText.length(); i++) {
            char character = plainText.charAt(i);
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int shift = Character.toUpperCase(key.charAt(i % keyLength)) - 'A';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
    public String decrypt(String cipherText, String key) {
        if (key.chars().anyMatch(Character::isDigit)) {
            throw new IllegalArgumentException("Numbers are not allowed in Vigenère key.");
        }
        StringBuilder result = new StringBuilder();
        int keyLength = key.length();
        for (int i = 0; i < cipherText.length(); i++) {
            char character = cipherText.charAt(i);
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                int shift = Character.toUpperCase(key.charAt(i % keyLength)) - 'A';
                result.append((char) ((character - base - shift + 26) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
