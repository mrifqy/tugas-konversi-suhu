
package KonversiSuhu;
import java.util.Scanner;

/**
 *
 * @author muhammad rifqy
 */
public class Main {
    public static void main(String[] args) {
        double suhuInput;
        int pilih;
        
        Scanner input = new Scanner(System.in);
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu dalam Celcius\t: ");
        suhuInput = input.nextDouble();
        
        do {
            System.out.println("");
            System.out.println("Opsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            pilih = input.nextInt();
            System.out.println("");
            OperasiKonversi konversiCelcius = new OperasiKonversi(suhuInput); 
            
            if(pilih == 1){
                System.out.println("Suhu Dalam Celcius\t: " + suhuInput + "°C");
                System.out.println("Suhu dalam Fahrenheit\t: " + konversiCelcius.fahrenheit() + "°F" );
                System.out.println("Suhu dalam Reamur\t: " + konversiCelcius.reamur() + "°R" );
                System.out.println("Suhu dalam Kelvin\t: " + konversiCelcius.kelvin() + "K" );
                System.out.println("Kondisi air " + konversiCelcius.kondisiAir() );
            }else if(pilih == 2) {
                System.out.println("Input Data");
                System.out.println("----------");
                System.out.print("Suhu dalam Celcius\t: ");
                suhuInput = input.nextDouble();
            }else if (pilih != 3) {
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        } while (pilih!=3);
    }
}
