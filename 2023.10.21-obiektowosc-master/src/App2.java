public class App2 {
    public static void main(String[] args) {
        int[] tab = {2,3,5,3,23,6,654,342,324};
        int[] tab2 = {2345,234,23,12,54,12,342,23};
        int[] tab3 = {4896,561,564,56,6857,68451,84};
        int[] tab4 = {984,894,984,4,231,894,516,8,894};
        int[] tab5 = {984,51,84,532,89,516,89,561,89,561,849};

        WyliczaczNajmiejszejLiczby panWyliczacz = new WyliczaczNajmiejszejLiczby();
        panWyliczacz.wyliczNajmniejszaLiczbeZTablicy(tab);
        panWyliczacz.wyliczNajmniejszaLiczbeZTablicy(tab2);
        panWyliczacz.wyliczNajmniejszaLiczbeZTablicy(tab3);
        panWyliczacz.wyliczNajmniejszaLiczbeZTablicy(tab4);
        panWyliczacz.wyliczNajmniejszaLiczbeZTablicy(tab5);
    }
}
