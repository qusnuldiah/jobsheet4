import java.util.Scanner;

public class Gaji24 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int JmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda :");
        JmlMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Anda :3");
        JmlTdkMasuk = input.nextInt();
        System.out.println("Masukkan Jumlah Gaji Anda :");
        gaji = input.nextInt();
        System.out.println("Masukkan Jumlah Potongan Gaji Anda :");
        potGaji = input.nextInt();
        TotGaji = (JmlMasuk * gaji) - (JmlTdkMasuk * potGaji);
        System.out.println("Gaji yang anda terima adalah : " + TotGaji);
    }
}