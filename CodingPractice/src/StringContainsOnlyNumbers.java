
public class StringContainsOnlyNumbers {

	public static void main(String[] args) {
		String str = "374 6 374 d3";
		System.out.println("String contains only numbers? "+StringContainsOnlyNumber(str));

	}
	//checking for only digits except space in the string
	public static boolean StringContainsOnlyNumber(String str){
		
		int count = 0;
		
		int countSpace = 0;
		for(int i=0; i< str.length() ; i++){
			
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57 && str.charAt(i) != 32){
				
				count++;
			}
			else if(str.charAt(i) == 32){
				
				countSpace++;
			}
		}
		
		
		if(count == str.length()-countSpace){
			
			return true;
		}
		else{
			
			return false;
		}
	}

}
