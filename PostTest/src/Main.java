public class Main {
    public static void main(String[] args) {

        Barang barang = new Barang("A001", "Hp");

        barang.setKategori("Elektronik");
        barang.setHargaSatuan(-1000); // cara salah
        barang.kurangiStok(10); // stok masih 0 adalah ditolak


        barang.setHargaSatuan(7000000); //cara benar
        barang.tambahStok(20);
        barang.kurangiStok(5);

        barang.tampilkanDetailBarang();
    }
}