import java.util.HashSet;

public class AnagramStrings {

	public static void main(String[] args) {
		String str1 = "ca t)b@bQ";
		String str2 = "tac*bb Q";
		char[] str1Array = str1.toLowerCase().toCharArray();
		char[] str2Array = str2.toLowerCase().toCharArray();
		
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();
		for(int i=0; i< str1Array.length; i++){
			
			if(str1Array[i] >= 97 && str1Array[i] <=122){
				
				set1.add(str1Array[i]);
			}
		}
for(int i=0; i< str2Array.length; i++){
			
			if(str2Array[i] >= 97 && str2Array[i] <=122){
				
				set2.add(str2Array[i]);
			}
		}
		System.out.println("set1: "+set1+" set2: "+ set2);
		if(set1.equals(set2)){
			System.out.println("anagram");
		}
	}

}
