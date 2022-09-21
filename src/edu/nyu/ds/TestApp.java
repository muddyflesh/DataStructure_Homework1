package src.edu.nyu.ds;

public class TestApp {
    public static void main(String[] args) {
        Currency mars = new Mars(100.00);
        Currency saturn = new Saturn(100.00);
        Currency neptune = new Neptune(100.00);
        System.out.println("<--Exchange-->");
        mars.exchange(saturn, 25.00);
        neptune.exchange(saturn, 10.0);
        saturn.exchange(mars, 122.0);
        saturn.exchange(mars, 121.0);
    }
}
