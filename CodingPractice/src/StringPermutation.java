import java.util.HashSet;

public class StringPermutation {

	
	public static void PerformPermutation(String word){
		
		HashSet<String> hashSet = new HashSet<String>();
		for(int i=0; i<word.length() ; i++){
			int j = i;
			System.out.println("J ==================" + j);
			String temp = word;
			while(j< word.length()){
				
				temp = swap(temp, i, j);
				System.out.println("Word after swap = " + j +" : "+ temp);
				j++;
				hashSet.add(temp);
			}
			
		}
		
		for(String s: hashSet){
			System.out.println("String Array : "+s);
		}
		
	}
	
	public static String swap(String word, int c1, int c2){
		
		StringBuilder strBld = new StringBuilder(word);
		char temp = word.charAt(c1);
		//System.out.println("temp"+temp);
		strBld.setCharAt(c1, word.charAt(c2));
		//System.out.println("Swapped 1 : "+ strBld);
		strBld.setCharAt(c2, temp);
		//System.out.println("Swapped 2: "+ strBld);
		return strBld.toString();
		
	}
	public static void main(String[] args) {
		
		String word = "GOD";
		PerformPermutation(word);
		
	}
}
