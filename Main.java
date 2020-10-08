package sk.kosickaakademia.branislavnebus.pole;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 52, 74, 1, 28, 65, 7,189, 54, 12, 36, 74, 87, 69 } ;
        int dlzka = array.length;
        int sucet = 0;
        int aritPriemer = 0;

        for(int i = 0; i < dlzka; i++){
            sucet = sucet + array[i];
        }

        aritPriemer = sucet/dlzka;
        System.out.println("Aritmeticky priemer: " + aritPriemer);
    }
}
