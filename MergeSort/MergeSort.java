
/*
 * Algorithm MergeSort
 */
import java.util.Arrays;

public class MergeSort {
	static int counter;
	public static int mergeSort(int[] ar){
		int right = ar.length-1;
		int[] k= new int[ar.length];
		int left = 0;
		counter=0;
		mergeSort(ar,k, left, right);
		return counter;
	}
	public static void mergeSort(int[] ar, int[] k,int left, int right){
		if(left>=right){
			return;
		}
		int middle = (right +left)/2;
		mergeSort(ar, k, left, middle);
		mergeSort(ar, k, middle+1, right);
		merge(ar,k,left, middle, middle+1,right);
	}
	public static void merge(int[] ar,int[] k, int left,int leftend,int right, int rightend){
		int leftIndex=left;
		int rightIndex=right;
		int index=left;
	
		while(leftIndex<=leftend && rightIndex<=rightend){
			if(ar[leftIndex]>=ar[rightIndex]){
				k[index] = ar[leftIndex];
				leftIndex++;
				counter++;
			}
			else if (ar[leftIndex]<ar[rightIndex]){
				k[index] = ar[rightIndex];
				rightIndex++;
				counter++;
			}
			index++;
		}
	
		System.arraycopy(ar, leftIndex, k, index, leftend-leftIndex+1);
		System.arraycopy(ar, rightIndex, k, index, rightend-rightIndex+1);
		System.arraycopy(k, left, ar, left, rightend-left+1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {2,1,3,1,2};
		int swaps=mergeSort(ar);
		System.out.println(Arrays.asList(ar));
		System.out.println("Swaps "+swaps);
	}

}
