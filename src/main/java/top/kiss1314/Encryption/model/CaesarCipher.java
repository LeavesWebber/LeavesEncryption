package top.kiss1314.Encryption.model;
public class CaesarCipher implements EncryptionStrategy {
    @Override
    public String encrypt(String plainText, String key) {
        int shift;
        try {
            shift = Integer.parseInt(key);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Only INTEGER is valid in Caesar key.");
        }
        StringBuilder result = new StringBuilder();
        for (char character : plainText.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    @Override
    public String decrypt(String cipherText, String key) {
        int shift;
        try {
            shift = Integer.parseInt(key);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Only INTEGER is valid in Caesar key.");
        }
        return encrypt(cipherText, String.valueOf(26 - shift));
    }
}