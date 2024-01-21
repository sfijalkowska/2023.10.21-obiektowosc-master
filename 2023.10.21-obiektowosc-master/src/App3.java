public class App3 {
    public static void main(String[] args) {
        Square kwadrat = new Square();
        kwadrat.side = 5;
        kwadrat.circle = 20;
        kwadrat.field = 25;

        System.out.println(kwadrat.side);
        System.out.println(kwadrat.circle);
        System.out.println(kwadrat.field);

        Square kwadrat2 = new Square(6,24,36);
        System.out.println(kwadrat2.side);
        System.out.println(kwadrat2.circle);
        System.out.println(kwadrat2.field);

        Square kwadrat3 = new Square(7);
        System.out.println(kwadrat3.side);
        System.out.println(kwadrat3.circle);
        System.out.println(kwadrat3.field);

        kwadrat.wypiszNaEkranie();
        kwadrat2.wypiszNaEkranie();
        kwadrat3.wypiszNaEkranie();

    }
}
