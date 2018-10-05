package interfacee;

public class FigureWorker implements ColorFigure {

    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("draw figure");
    }
}
