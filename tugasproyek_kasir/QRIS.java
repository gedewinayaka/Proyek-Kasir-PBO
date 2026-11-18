package tugasproyek_kasir;

public class QRIS extends Pembayaran {

    public QRIS(double totalBayar) {
        super(totalBayar);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui QRIS berhasil.");
        System.out.println("Total: Rp" + totalBayar);
    }
}