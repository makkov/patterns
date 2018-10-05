package adapter;

public class KeyboardImpl implements Keyboard {

    Integer buttonCount;

    public KeyboardImpl() {
    }

    public KeyboardImpl(Integer buttonCount) {
        this.buttonCount = buttonCount;
    }

    public Integer getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(Integer buttonCount) {
        this.buttonCount = buttonCount;
    }

    @Override
    public void tap(String code, Integer count) {
        System.out.println(code + " pressed " + count + " times");
    }
}
