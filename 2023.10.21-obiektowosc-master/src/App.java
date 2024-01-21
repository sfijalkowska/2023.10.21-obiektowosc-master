import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client c1 = new Client();
        Client c2 = new Client();

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 50;
        c1.pesel = 123423;

        c2.name = "Zbyszek";
        c2.surname = "Malinowski";
        c2.age = 40;
        c2.pesel = 35434;

        System.out.println(c1.name);
        System.out.println(c1.surname);
        System.out.println(c1.age);
        System.out.println(c1.pesel);

        int[] tab = new int[10];
        System.out.println(tab.length);

        Client c3 = new Client();
        c3.name = "Wiesiek";
        c3.surname = "Kowalski";
        c3.age = 49;
        c3.pesel = 234234;

        System.out.println(c3.name);
        System.out.println(c3.surname);
        System.out.println(c3.age);
        System.out.println(c3.pesel);


        Client c4 = c3;

        System.out.println(c4.name);
        System.out.println(c4.surname);
        System.out.println(c4.age);
        System.out.println(c4.pesel);

        c3.name = "Bronislaw";

        System.out.println(c3.name);
        System.out.println(c4.name);



        int a = 5;
        int b = a;
        a = 13;

        Client c5 = new Client();

        System.out.println(c5.address);

        Client[] clients = new Client[10];
        System.out.println(clients[0]);
        System.out.println(clients[5]);

        c5.address = new Address();

        c5.address.street = "Ogrodowa";

        c5.address.blok = new Blok();

        c5.address.blok.iloscOkien = 66;

        int toCoMiPoliczylKlient = c5.add(17, 7);
        System.out.println(c5.add(74, 88));
        c5.wymyslLiczbe("amsdjhfgfkjhas");
        c5.wyswietlCosNaEkranie();

        c5.add(4,7);
        c5.add(4.7,5.5);

    }
}
