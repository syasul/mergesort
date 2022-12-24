/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge.sort;

/**
 *
 * @author User
 */
public class MergeSort {
    
    public static void initializemergeSort(int n[], int l, int h){ 
        int rendah = l;
        int tinggi = h;
        if (rendah>=tinggi){
           return;
        }
        int tengah=(rendah+tinggi)/2;
        initializemergeSort(n,rendah,tengah);
        initializemergeSort(n,tengah+1,tinggi);
        int end_low=tengah;
        int awal_tinggi=tengah+1;
        while ((l<=end_low) && (awal_tinggi<=tinggi)){
           if (n[rendah]<n[awal_tinggi]){
              rendah++;
           }
           else{
              int Temp=n[awal_tinggi];
              for (int k=awal_tinggi-1;k>=rendah;k--)
              {
                 n[k+1]=n[k];
              }
              n[rendah]=Temp;
              rendah++;
              end_low++;
              awal_tinggi++;
           }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Merge Sorting");
        System.out.println();
 
        //Nomor yang akan di urutkan
        int n[] = {20,12,7,11,14,5,19,3};
        System.out.print("Sebelum di Urutkan = ");
        for(int i = 0; i < n.length; i++){
           System.out.print(n[i]+" ");
        }
        System.out.println();
        initializemergeSort(n,0,n.length-1);
        System.out.println();   
        System.out.print("Setelah di Urutkan = ");
        for(int i = 0; i < n.length; i++){
           System.out.print(n[i]+" ");
        }
        System.out.println("");
    }
}
