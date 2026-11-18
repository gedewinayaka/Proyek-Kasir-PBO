package tugasproyek_kasir;

public class Pesanan {
    private Menu menu;
    private int jumlah;

    public Pesanan(Menu menu, int jumlah) {
        this.menu = menu;
        this.jumlah = jumlah;
    }

    public double hitungSubtotal() {
        return menu.getHarga() * jumlah;
    }

    public void tampilkanPesanan() {
        System.out.println("Menu: " + menu.namaMenu);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Subtotal: Rp" + hitungSubtotal());
    }
}