package adapter;

public class Main {

    public static void main(String[] args) {
        Keyboard keyboard = new KeyboardImpl(4);
        KeyboardUser keyboardUser = new KeyboardUserImpl("Oleg");
        keyboardUser.UseKeyboard(keyboard);


        ChinesKeyboard chinesKeyboard = new ChinesKeyboard("1");
        System.out.println("_________");

        KeyboardAdapter keyboardAdapter = new KeyboardAdapter(chinesKeyboard);

        keyboardUser.UseKeyboard(keyboardAdapter);
    }
}
