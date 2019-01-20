import java.util.HashSet;
import java.util.Scanner;

public class KNoCharInString {

	public static void main(String[] args) {
		
		 Scanner reader = new Scanner(System.in);
		 System.out.println("ENter string: ");
		 String s = reader.nextLine();
		 System.out.println("ENter count: ");
		 int count = reader.nextInt();
		 int flag = 0;
		 char[] charArray = s.toCharArray();
		 HashSet<Character> set = new HashSet<Character>();
		 
		 for(int j=0; j< charArray.length ; j++){
			 
			 for(int i = 0; i< s.length(); i++){
				 				 
				 if(s.charAt(i) == charArray[j]){					 
					 flag++;
					 
				 }
				 
				 if(flag == count){	
					
					 set.add(s.charAt(i));
					 
					 break;
				 }
			 }
			 flag = 0;
		 }
		 System.out.println(set);
	}

}
