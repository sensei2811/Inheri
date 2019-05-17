/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspln2;
import java.util.Scanner;


/**
 *
 * @author Wahyu Ari Nugroho
 */
public class TugasPLN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        anak a=new anak();
        Scanner input=new Scanner (System.in);
        System.out.println("Pembayaran PLN");
        System.out.println("Nama :");
        a.nama=input.nextLine();
        System.out.println("Alamat :");
        a.alamat=input.nextLine();
        System.out.println("Tipe Rumah :");
        a.tipe=input.nextLine();
        a.proses();
        // TODO code application logic here
    }
    
}
