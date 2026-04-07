public class KamarHotel {
    
    private String nomorKamar; 
    private String tipeKamar; 
    private int kapasitasMaksimal; 
    private double hargaPerMalam; 
    private boolean isTersedia; 

    public KamarHotel (String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaperMalam) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar  = tipeKamar; 
        this.kapasitasMaksimal = kapasitasMaksimal; 
        this.hargaPerMalam = hargaperMalam;
        this.isTersedia = true; 
    }

    //getter
    public String getNomorKamar() {return nomorKamar;}
    public String getTipeKamar () {return tipeKamar; }
    public int getKapasitasMaksimal () {return kapasitasMaksimal;}
    public double getHargaPerMalam() {return hargaPerMalam;}
    public boolean isTersedia () {return isTersedia;}

    //setter
    public void setTipeKamar (String tipeKamar){
        this.tipeKamar = tipeKamar; 
    }

    public void setHargaPerMalam (double hargaPerMalam){
        this.hargaPerMalam = hargaPerMalam; 
    }

    //method 
    public void pesanKamar (int jumlahTamu) {
        if (isTersedia) {
            if (jumlahTamu <= kapasitasMaksimal) {
                isTersedia = false; 
                System.out.println("Kamar telah dipesan");
            }else {
                System.out.println("tidak bisa, kapasitas penuh");
            }
            }else{
                System.out.println("Kamar sudah ada");
            }
        }

    //cara batalkan pesan 
    public void batalPesan () {
        isTersedia =true; 
        System.out.println("Kamar dibatalkan");
    }

    //hitung bayar sederhana
    public double hitungTotalBayar (int malam){
        return malam * hargaPerMalam ; 
    }

    //tampilan 
    public void tampilkanInfo () {
        System.out.println("Nomor Kamar : " + nomorKamar);
        System.out.println("Tipe Kamar : " + tipeKamar);
        System.out.println("Kapasitas : " + kapasitasMaksimal);
        System.out.println("Harga : " + hargaPerMalam);
        System.out.println("Status : " + (isTersedia ? "Tersedia " : "Terisi"));
        System.out.println("--------------------------");
    }
    }

