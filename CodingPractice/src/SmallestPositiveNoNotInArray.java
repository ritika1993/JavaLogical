import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//To find smallest positive no. not present in an array
class SmallestPositiveNoNotInArray {


	public static void main(String[] args) {

		int[] a = new int[] {-23,7, 2, -1, -2};

		// to shuffle the array and keep all positive in right side

		Arrays.sort(a);
		for(int i : a){
			System.out.print(i+",");
		} 


		int bigIndex = 0;
		// to find out the biggest element more than or equal to 1.
		for(int i=0; i<a.length ; i++){
			if(a[i]>=1){
				bigIndex = i;
				break;
			}
		}


		int res = 0;
		// to iterate the array from the index of biggest positive element 
		for(int i=bigIndex ; i<= a.length-1; i++){
			System.out.println("I"+i);
			//if first biggest element is not 1, then answer is 1
			if(a[bigIndex] !=1){
				res =1;
				break;
			}
			//if index of biggest element is not the last, then difference of 
			//this element and next element shouldn't be greater than 1
			//if yes, result should be one more than the biggest no
			else if(i != a.length-1 ){
				if(a[i+1] - a[i] > 1 ){

					res = a[i]+1;
					break;
				}
				//if biggest no is last no of array then biggestno + 1			
			}else if(i == a.length-1 ){

				res = a[i]+1;
				break;
			}


		}

		System.out.println(res);

	}
}


