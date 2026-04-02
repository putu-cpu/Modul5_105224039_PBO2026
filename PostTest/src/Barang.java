public class Barang {
    private String idBarang; 
    private String namaBarang; 
    private int stok; 
    private double hargaSatuan; 
    private String kategori; 

    public Barang (String idBarang, String namaBarang) {
        this.idBarang = idBarang; 
        this.namaBarang = namaBarang; 
        this.stok = 0;
        this.hargaSatuan = 0; 
        this.kategori = ""; 
    }

    public String getIdBarang () {
        return idBarang; 
    }

    public void setIdBarang (String idBarang) {
        this.idBarang  = idBarang; 
    }

    public String getNamaBarang () {
        return namaBarang; 
    }

    public void setNamaBarang (String namaBarang) {
        this.namaBarang = namaBarang; 
    }

    public int getStok () {
        return stok; 
    }

    public void setStok (int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak bisa negatif");
        }else{
            this.stok = stok; 
        }
    }

    public double getHargaSatuan () {
        return hargaSatuan; 
    }

    public void setHargaSatuan (double hargaSatuan) {
        if (hargaSatuan <= 0) {
            System.out.println("Harga harus lebih dari 0 ");
        }else{
            this.hargaSatuan = hargaSatuan;
        }
    }

    public String getKategori () {
        return kategori;
    }

    public void setKategori (String kategori) {
        this.kategori = kategori; 
    }

    public void tambahStok (int jumlah) {
        if (jumlah > 0){
            stok += jumlah;
        }else{
            System.out.println("Jumlah harus lebih dari 0");
        }
    }

    public void kurangiStok (int jumlah){
        if (jumlah > 0 && jumlah <= stok) {
            stok -= jumlah; 
        }else{
            System.out.println("Stok tidak cukup / input salah");
        }
    }

    public void tampilkanDetailBarang () {
        System.out.println("=== Detail Barang ===");
        System.out.println("ID       :"  +idBarang);
        System.out.println("Nama     :"  +namaBarang);
        System.out.println("Kategori :"  +kategori);
        System.out.println("Stok     :"  +stok);
        System.out.println("Harga    :"  +hargaSatuan);
    }

}
