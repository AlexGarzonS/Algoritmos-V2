package logica;

public class MergeSort {
	
	 public void mergeSort(int array[]) {
	        long timeIni;
	        long timeEnd;
	        long time;
	        
	        timeIni = System.nanoTime();
	        
	        int[] sortedArray = mergesort(array, 0, array.length - 1);
	        
	        timeEnd = System.nanoTime();
	        
	        time = timeEnd - timeIni;
	        
	        System.out.println(" Elementos ordenados Merge-Sort ");
	        for (int i = 0; i < sortedArray.length; i++) {
	            System.out.printf("%4d", sortedArray[i]);
	            if ((i + 1) % 10 == 0) {
	                System.out.println();
	            }
	        }
	        System.out.println("Tiempo de ejecución: " + time);
	    }

	    public int[] mergesort(int array[], int lo, int hi)
	    {
	        if (lo == hi) {
	            int[] ba = new int[1];
	            ba[0] = array[lo];
	            return ba;
	        }

	        int mid = (lo + hi) / 2;
	        int[] arr1 = mergesort(array, lo, mid);
	        int[] arr2 = mergesort(array, mid + 1, hi);
	        return merge(arr1, arr2);
	    }

	    public int[] merge(int[] arr1, int[] arr2) {
	        int i = 0, j = 0, k = 0;
	        int n = arr1.length;
	        int m = arr2.length;
	        int[] arr3 = new int[m + n];
	        while (i < n && j < m) {
	            if (arr1[i] < arr2[j]) {
	                arr3[k] = arr1[i];
	                i++;
	            } else {
	                arr3[k] = arr2[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n) {
	            arr3[k] = arr1[i];
	            i++;
	            k++;
	        }
	        while (j < m) {
	            arr3[k] = arr2[j];
	            j++;
	            k++;
	        }
	        return arr3;
	    }
}