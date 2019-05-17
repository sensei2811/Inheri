/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumebola;
import java.util.Scanner;
/**
 *
 * @author Wahyu Ari Nugroho
 */
public class VolumeBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        run B=new run(0);
        System.out.println("Menghitung Volume Bola");
        System.out.println("Masukan Jari-jari: ");
        B.r=input.nextDouble();
        B.getvb();
    }
    
}
