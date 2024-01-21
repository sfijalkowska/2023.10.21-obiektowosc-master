public class Square {
    int side;
    int circle;
    int field;

    Square() {
        System.out.println("Towrzy sie nowy kwadrat !!!");
    }

    Square(int side, int circle, int field) {
        this();
        this.side = side;
        this.circle = circle;
        this.field = field;
    }

    Square(int side) {
        this(side, side*4, side*side);
    }

    void wypiszNaEkranie() {
        System.out.println(this.side);
        System.out.println(this.circle);
        System.out.println(this.field);
    }
}
