package tugasproyek_kasir;

public class Menu {
    String namaMenu;
    private double harga;

    void setHarga(double harga) {
        this.harga = harga;
    }

    double getHarga() {
        return harga;
    }

    void tampilkanMenu() {
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga: Rp" + harga);
    }
}