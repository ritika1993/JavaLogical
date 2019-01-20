
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rv = new ReverseString();
		String str = "An apple is a fruit";
		
		System.out.println("Reverse : "+ rv.reverse(str));
		System.out.println("Recursive Reverse : "+ rv.reverseRecursively(str));
		
	}
	
	public StringBuilder reverse (String str){
		
		StringBuilder strbld = new StringBuilder();
		for(int i=str.length()-1; i>=0;i-- ){
			
			strbld.append(str.charAt(i));
		}
		
		return strbld;
	}
	
	public String reverseRecursively(String str){
		
		StringBuilder strbld = new StringBuilder();
		
		if(str.length() < 2){
			
			return str;
		}
		System.out.println(str.substring(1)+str.charAt(0));
		return reverseRecursively(str.substring(1))+str.charAt(0);
	}

}
