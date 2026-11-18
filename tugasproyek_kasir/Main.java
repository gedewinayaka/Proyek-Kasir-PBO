package tugasproyek_kasir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat daftar menu
        Menu menu1 = new Menu();
        menu1.namaMenu = "Red Velvet";
        menu1.setHarga(18000);

        Menu menu2 = new Menu();
        menu2.namaMenu = "Kopi Susu";
        menu2.setHarga(15000);

        Menu menu3 = new Menu();
        menu3.namaMenu = "Matcha";
        menu3.setHarga(17000);

        // Menampilkan daftar menu
        System.out.println("=== SISTEM KASIR KAFE ===");
        System.out.println("1. Red Velvet - Rp18000");
        System.out.println("2. Kopi Susu - Rp15000");
        System.out.println("3. Matcha - Rp17000");
        System.out.print("Pilih menu: ");

        int pilihanMenu = input.nextInt();

        Menu menuDipilih;

        if (pilihanMenu == 1) {
            menuDipilih = menu1;
        } else if (pilihanMenu == 2) {
            menuDipilih = menu2;
        } else if (pilihanMenu == 3) {
            menuDipilih = menu3;
        } else {
            System.out.println("Pilihan menu tidak valid.");
            input.close();
            return;
        }

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        Pesanan pesanan1 = new Pesanan(menuDipilih, jumlah);

        pesanan1.tampilkanPesanan();

        double total = pesanan1.hitungSubtotal();

        // Pilihan pembayaran
        System.out.println("\nPilih Metode Pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. QRIS");
        System.out.print("Pilihan: ");

        int pilihan = input.nextInt();

        Pembayaran pembayaran;

        if (pilihan == 1) {
            pembayaran = new Tunai(total);
        } else if (pilihan == 2) {
            pembayaran = new QRIS(total);
        } else {
            System.out.println("Pilihan pembayaran tidak valid.");
            input.close();
            return;
        }

        pembayaran.prosesPembayaran();

        input.close();
    }
}