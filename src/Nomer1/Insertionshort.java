
package Nomer1;
public class Insertionshort {
    public static void main(String[] args){
         int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=2; i<data.length; i++){
            int key = data[i];
            int j = i-2;
            while((j>=0)&&(data[j]>key)){
                data[j+2] = data[j];
                j--;
            }
            data[j+2] = key;
        }
        System.out.println("\nsorted by Widya:");
        System.out.println("=== Insertion Sort ===");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
    
    
        
    
    

