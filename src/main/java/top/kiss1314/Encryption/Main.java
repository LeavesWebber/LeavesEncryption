package top.kiss1314.Encryption;

import top.kiss1314.Encryption.controller.EncryptionController;
import top.kiss1314.Encryption.model.EncryptionModel;
import top.kiss1314.Encryption.view.EncryptionView;

public class Main {
    public static void main(String[] args) {

            EncryptionModel model = new EncryptionModel();
            EncryptionView view = new EncryptionView(1);
            EncryptionController controller = new EncryptionController(model, view);

            controller.processUserInput();

    }
}