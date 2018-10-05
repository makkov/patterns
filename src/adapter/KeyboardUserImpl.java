package adapter;

public class KeyboardUserImpl implements KeyboardUser {

    String username;

    public KeyboardUserImpl() {
    }

    public KeyboardUserImpl(String username) {
        this.username = username;
    }

    @Override
    public void UseKeyboard(Keyboard keyboard) {
        keyboard.tap("Tab", 3);
        keyboard.tap("H", 8);
        keyboard.tap("SHIFT", 6);
//        System.out.println();
    }
}
