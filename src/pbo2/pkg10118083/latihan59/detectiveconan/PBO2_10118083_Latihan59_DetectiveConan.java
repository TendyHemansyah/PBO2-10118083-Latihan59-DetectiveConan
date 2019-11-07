/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan59.detectiveconan;
import java.util.Scanner;
/**
 *
 * @author         
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas : Detective Conan
 */
public class PBO2_10118083_Latihan59_DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Pemeran pemeran = new Pemeran();
        
        System.out.println("===Tokoh Dalam Detektif Konan===");
        System.out.println("---Berdasarkan Keahliannya---");
        pemeran.tampilDaftarKeahlian();
        pemeran.setKeahlian(scanner.nextInt());
        
        System.out.println("");
        
        pemeran.tampilKeahlian(pemeran.getKeahlian());
    }
    
}
