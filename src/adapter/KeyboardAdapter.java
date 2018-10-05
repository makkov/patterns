package adapter;

public class KeyboardAdapter implements Keyboard {

    ChinesKeyboard chinesKeyboard;

    public KeyboardAdapter(ChinesKeyboard keyboard) {
        this.chinesKeyboard = keyboard;
    }

    public KeyboardAdapter() {
    }

    @Override
    public void tap(String code, Integer count) {
        for (int i = 0; i < count; i++) {
            chinesKeyboard.chines(code);
        }
    }


}
