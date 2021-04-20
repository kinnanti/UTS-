package Nomer1;
import java.util.Scanner;
public class Binarysearching {
    public static void main (String[]args){
        System.out.println("Binary Search");
        int A[]= {3, 10, 4, 2, 8, 13};
        Scanner scan = new Scanner (System.in);
        System.out.print("8:");
        int search =scan.nextInt();
        int N = search;
        int batasbawah = N -2;
        int batasatas = 0;
        boolean ketemu  = false;
        int tengah = 0; 
        
        //menampilkan data dalam aray 
        System.out.print("2, 3, 4, 8, 10 : ");
        for ( int i =0; i<A.length; i++){
            System.out.print(A[i]+ " ");
            }
        System.out.println(" ");
        
        while ((batasatas < batasbawah)&&(!ketemu)){ //perulangan
        tengah = (batasatas + batasbawah) / 2;
            if (A[tengah]==search){ //kondisi nilai tengah
                ketemu = true; // kondisi ketemu adalah true
                
            }else{
                if (A[tengah] < search ){
                    batasatas = tengah++;
                    
                }else{
                    batasatas = tengah--;
                }
            }
            if (ketemu){
                System.out.println("data "+8+" telah di temukan pada indeks ke 3"+(tengah +" baris ke "+(tengah + 1)));
           
            }

            System.out.println("Widya Kinnanti");
             
        }
               
    
    }
}
        
        
                
        
                
    
    

