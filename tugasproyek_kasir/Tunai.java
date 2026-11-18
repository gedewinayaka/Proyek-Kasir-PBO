package tugasproyek_kasir;

public class Tunai extends Pembayaran {

    public Tunai(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran tunai berhasil.");
        System.out.println("Total: Rp" + totalBayar);
    }
}