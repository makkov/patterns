package adapter;

public class ChinesKeyboard {

    String buttonCount;

    public ChinesKeyboard() {
    }

    public ChinesKeyboard(String buttonCount) {
        this.buttonCount = buttonCount;
    }

    public String getButtonCount() {
        return buttonCount;
    }

    public void setButtonCount(String buttonCount) {
        this.buttonCount = buttonCount;
    }

    void chines(String buttin) {
        System.out.println(buttin + "chines Pressed");
    }
}
