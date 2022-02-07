package Classes.BoxingMatch;

public class Main {
    public static void main(String[] args) {
        Fighter mike = new Fighter("Mike Tyson", 13, 90, 130, 10);
        Fighter mali = new Fighter("Mohammad Ali", 12, 80, 120, 22);
        Ring ring = new Ring(mike, mali, 80, 95);

        ring.run();
    }
}
