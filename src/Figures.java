public class Figures implements Geometry{
    String name;
    String fillColor;
    String borderColor;
    public Figures(String name, String fillColor, String borderColor){
        this.name = name;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public void circlePerimetr(int r) {
        int p = (int) (2 * (Math.PI * r));
        System.out.println("Периметр " + name + " = " + p);
    }

    @Override
    public void circleArea(int r) {
        int s = (int) (Math.PI * (r * r));
        System.out.println("Площядь " + name + " = " + s);
    }

    @Override
    public void trianglePerimetr(int a, int b, int c) {
        int s = a + b + c;
        System.out.println("Площядь " + name + " = " + s);
    }

    @Override
    public void triangleArea(int a, int h) {
        int s = a * h / 2;
        System.out.println("Площядь " + name + " = " + s);
    }

    @Override
    public void rectanglePerimetr(int a, int b) {
        int s = a + b * 2;
        System.out.println("Площядь " + name + " = " + s);
    }

    @Override
    public void rectangleArea(int a, int x) {
        int s = a * x;
        System.out.println("Площядь " + name + " = " + s);
    }
}
