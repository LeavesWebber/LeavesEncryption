package top.kiss1314.Encryption.controller;


import top.kiss1314.Encryption.model.EncryptionFactory;
import top.kiss1314.Encryption.model.EncryptionModel;
import top.kiss1314.Encryption.view.EncryptionView;

public class EncryptionController {
    private final EncryptionModel model;
    private EncryptionView view;

    public EncryptionController(EncryptionModel model, EncryptionView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        int languageChoice = view.getLanguageChoice();
        view = new EncryptionView(languageChoice);
        view.displayWelcome();
        while (true) {
            int encryptionChoice = view.getEncryptionChoice();
            String encryptionType = "";
            switch (encryptionChoice) {
                case 1:
                    encryptionType = "caesar";
                    break;
                case 2:
                    encryptionType = "vigenere";
                    break;
                case 3:
                    view.displayGoodbye();
                    System.exit(0);
                default:
                    throw new IllegalArgumentException("Invalid algorithm choice");
            }

            model.setStrategy(EncryptionFactory.getEncryption(encryptionType));

            int operationChoice = view.getOperationChoice();
            String text = view.getText();
            String key = view.getKey();
            String result;
            if (operationChoice == 1) {
                result = model.encrypt(text, key);
            } else {
                result = model.decrypt(text, key);
            }
            view.displayResult(result);
        }
    }
}