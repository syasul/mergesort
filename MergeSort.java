
package merge.sort;

import java.util.Arrays;

public class MergeSort {
    // menggabungkan dua sub-array L dan M menjadi arr
    void merge(int arr[], int p, int q, int r) {
        // Buat L ← A[p..q] dan M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++){
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++){
            M[j] = arr[q + 1 + j];
        }
        // Pertahankan indeks sub-array dan larik utama saat ini
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        // Sampai kita mencapai salah satu ujung L atau M, pilih yang lebih besar
         // elemen L dan M dan letakkan di posisi yang benar di A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        // Saat kita kehabisan elemen di L atau M,
         // ambil elemen yang tersisa dan masukkan A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }
    // Bagilah array menjadi dua subarray, urutkan dan gabungkan
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // m adalah titik di mana array dibagi menjadi dua subarray
            int m = (l + r) / 2;
            mergeSort(arr, l, m);


            mergeSort(arr, m + 1, r);
            //Menggabungkan subarray yang telah diurutkan
            merge(arr, l, m, r);
        }
    }
    // Cetak larik
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");

    }
    // Program pengemudi
    public static void main(String args[]) {
        int arr[] = { 9};
        System.out.println("Array sebelum disorting");
        System.out.print(Arrays.toString(arr));
        System.out.println("");
        MergeSort ob = new MergeSort();
        ob.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array sesudah disorting");
        printArray(arr);
    }
}

