package RGR;

public class Main {
    public static void main(String[] args) {
        View v1 = new View();
        Model m1 = new Model();
        Window_Test t1 = new Window_Test();
        Controller c1 = new Controller(v1,t1, m1);
        c1.openWindow();
    }
}
