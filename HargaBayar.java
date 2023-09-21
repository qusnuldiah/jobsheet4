import java.util.Scanner;

public class HargaBayar {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        int harga, jumlah, JmlHal;
        double dis, total, bayar, jmlDis;
        String merekBuku;

        System.out.println("Masukkan harga barang yang dibeli : ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();
        System.out.println("Masukkan jumlah diskon yang anda dapatkan : ");
        dis = input.nextDouble();
        System.out.println("Merek buku yang dibeli : ");
        merekBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku : ");
        JmlHal = input.nextInt();
        total = harga * jumlah;
        jmlDis = (total * (dis / 100));
        bayar = total - jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);

    }
}