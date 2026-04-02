public class App {
    public static void main(String[] args) throws Exception {
       mahasiswa mhs = new mahasiswa (); 

       mhs.nama = "Haruka"; 
       //mhs.nim = "105224"; 

       System.out.println(mhs.nama);
       mhs.setNim("105224039" );
       System.out.println(mhs.getNim());
       System.out.println(mhs.nama);

        
    }
}
