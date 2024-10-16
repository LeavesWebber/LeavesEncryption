package top.kiss1314.Encryption;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EncryptionView {
    private final Scanner scanner = new Scanner(System.in);

    public int getLanguageChoice() {
        System.out.println("1. 简体中文");
        System.out.println("2. English");
        System.out.print("输入你期望的语言序号 (1~2)\nEnter the number of your preferred language (1~2): ");
        return getIntInput(1, 2);
    }
    // 声明一个ResourceBundle
    private ResourceBundle messages;

    // 在构造函数中加载语言
    public EncryptionView(int languageChoice) {
        if (languageChoice == 1) {
            messages = ResourceBundle.getBundle("messages", Locale.SIMPLIFIED_CHINESE);
        } else {
            messages = ResourceBundle.getBundle("messages", Locale.ENGLISH);
        }
    }

    public void displayWelcome() {
        System.out.println("\n"+messages.getString("welcome"));
    }
    public void displayGoodbye() {
        System.out.println("\n"+messages.getString("goodbye"));
    }
    public int getEncryptionChoice() {
        System.out.println("1. "+messages.getString("caesar"));
        System.out.println("2. "+messages.getString("vigenere"));
        System.out.println("3. "+messages.getString("exit"));
        System.out.print(messages.getString("choose_algorithm"));
        return getIntInput(1, 3);
    }

    public int getOperationChoice() {
        System.out.println("\n"+"1. "+messages.getString("encrypt"));
        System.out.println("2. "+messages.getString("decrypt"));
        System.out.print(messages.getString("choose_operation"));
        return getIntInput(1, 2);
    }

    public String getText() {
        System.out.println("\n"+messages.getString("enter_text"));
        return scanner.nextLine();
    }
    private int getIntInput(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.print(messages.getString("invalid_input1") + min + "~" + max+messages.getString("invalid_input2"));
                }
            } catch (NumberFormatException e) {
                System.out.print(messages.getString("invalid_input3"));
            }
        }
    }
    public String getKey() {
        System.out.println(messages.getString("enter_key"));
        return scanner.nextLine();
    }

    public void displayResult(String result) {
        // ANSI escape codes for bold and reset
        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_RESET = "\u001B[0m";

        // ANSI escape codes for colors
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";

        // Example: making the result bold and green
        System.out.println("\n" + messages.getString("result") + "\n" + ANSI_RED + ANSI_GREEN + result + ANSI_RESET+"\n");
    }

}