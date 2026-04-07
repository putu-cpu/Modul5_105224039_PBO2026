public class App {
    public static void main(String[] args) throws Exception {
        
        // objek Kamar 
        KamarHotel kamar1 = new KamarHotel ("101", "Reguler", 2,100000);
        KamarHotel kamar2 = new KamarHotel ("102", "Premium", 3,150000);

        //tampil info awal 
        kamar1.tampilkanInfo();
        kamar2.tampilkanInfo();

        //pesan kamar 
        kamar1.pesanKamar(2);
        kamar2.pesanKamar(1);

        //jika kapasitas penuh 
        kamar2.pesanKamar(5);//penuhh

        //hitung pembayaran 
        double total = kamar1.hitungTotalBayar(2); 
        System.out.println("Total bayar kamar 1 : " + total);

        //info akhir 
        kamar1.tampilkanInfo();
        kamar2.tampilkanInfo();
    }
}
