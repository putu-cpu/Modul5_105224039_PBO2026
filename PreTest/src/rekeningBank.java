import java.util.Scanner;

public class rekeningBank {
    private int saldo;
    private Scanner input;
    
    public void setor () {
        
        input = new Scanner(System.in);
        System.out.println("Masukkan saldo anda :");
        int jumlah = input.nextInt(); 
        saldo = saldo + jumlah ; 

        if (jumlah < 0 ) {
            System.out.println("tidak boleh min ");
        } else {
            System.out.println("Selamat anda berhasil ditambahkan");
        }


    }
}
