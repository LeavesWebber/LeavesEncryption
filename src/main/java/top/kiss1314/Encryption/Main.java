package top.kiss1314.Encryption;

public class Main {
    public static void main(String[] args) {

            EncryptionModel model = new EncryptionModel();
            EncryptionView view = new EncryptionView(1);
            EncryptionController controller = new EncryptionController(model, view);

            controller.processUserInput();

    }
}