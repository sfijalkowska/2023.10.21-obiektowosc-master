public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;
    Car car;

    Client() {

    }

    int add(int pierwszaLiczba, int drugaLiczba) {
        System.out.println("Dostalem a = " + pierwszaLiczba);
        System.out.println("Dostalem tez b = " + drugaLiczba);
        System.out.println("Licze !!");
        int wynik = pierwszaLiczba+drugaLiczba;
        if(wynik == 42) {
            return 60;
        }
        System.out.println("Wyniczylem " + wynik);
        System.out.println("Teraz bede tten wynik zwracal !!!");
        return wynik;
    }

    double add(double pierwszaLiczba, double drugaLiczba) {
        return pierwszaLiczba + drugaLiczba;
    }

    String wymyslLiczbe(String cos) {
        return "186";
    }

    void wyswietlCosNaEkranie() {
        System.out.println("Cos wyswietlam !!");
        if(true) {
            return;
        }
        //
        //
        //
    }
}
