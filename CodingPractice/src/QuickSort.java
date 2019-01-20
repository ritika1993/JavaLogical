
public class QuickSort {

	private int[] input;
	private int length;
	
	public void swap(int i, int j){
		
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
		
	}
	
	public void quickSort(int low, int high){
		
		int pivot = input[low + (high - low) /2];
		
		
	}
	public static void main(String[] args) {
		
	}
	
}
