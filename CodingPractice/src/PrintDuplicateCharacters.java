import java.util.HashMap;
import java.util.Map;


public class PrintDuplicateCharacters {

	
	public static void PrintDuplicateCharacterOccurences(String str){
		
		char[] c = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i< c.length;i++){
			
			if(!map.containsKey(c[i])){
				map.put(c[i],1 );
			}else{
				map.put(c[i], map.get(c[i])+1);
			}
			
			
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			
			if(entry.getValue() >=2 && entry.getKey() != ' '){
				System.out.println(entry.getKey() + " : "+ entry.getValue());
			}
			
		}
	}
	public static void main(String[] args) {
		
		String str = "abc vvvf bb hgch";
		
		PrintDuplicateCharacterOccurences(str);
		
		
	}
}
