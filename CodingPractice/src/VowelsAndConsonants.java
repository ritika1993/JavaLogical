
public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ahgnm jdyrue vkj";
		PrintVowelsAndConsonants(str);
	}
 
	public static void PrintVowelsAndConsonants(String str){
		
		int vowels = 0;
		int consonants = 0;
		str = str.toLowerCase();
		for(int i = 0 ; i < str.length() ; i++){
			
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				
				vowels ++;
			}
			else if(str.charAt(i) != ' ' ){
				consonants ++;
			}
		}
		
		System.out.println("Vowels : "+ vowels + " Consonants : "+ consonants);
	}
}
