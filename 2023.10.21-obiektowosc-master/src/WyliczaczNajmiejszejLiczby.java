public class WyliczaczNajmiejszejLiczby {

    void wyliczNajmniejszaLiczbeZTablicy(int[] tab) {
        int min = tab[0];
        for(int i = 1; i < tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }
        System.out.println("Najmniejsza liczba to: " + min);
    }
}
