package tipedata;
import java.util.Scanner;
public class latihan22_hitunganlingkaran {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double jari,luas,keliling;
        System.out.println("========= PERHITUNGAN LINGKARAN ========");
        System.out.print("Masukan Nilai Diameter Lingkaran : ");
        int diameter = input.nextInt();
        System.out.println("========= HASIL PERHITUNGAN LINGKARAN ========");
        if(diameter >= 0){
            jari = diameter / 2;
            luas = Math.PI * Math.pow(jari, 2);
            keliling = 2 * Math.PI * jari;
            
            System.out.println("Jari Jari Lingkaran : " + jari);
            System.out.println("Luas Lingkaran : " + luas);
            System.out.println("Keliling Lingkaran : " + keliling);
        }
    }
}
