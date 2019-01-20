import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {

	public static List<String> getKeyFromValue(Map<String, Integer> hm, int value) {
		List<String> newList = new ArrayList<String>();
	    for (String o : hm.keySet()) {
	      if (hm.get(o).equals(value)) {
	    	  System.out.println(o);
	    	  newList.add(o);
	      }
	    }
	    return newList;
	  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "00:01:07,400-234-090"+"\n"+
   "00:05:01,701-080-080"+"\n"+
   "00:05:00,400-234-090";//+"\n"+"00:06:07,400-234-089";
		
		HashMap<String, Integer> call = new HashMap<>();
		HashMap<String, Integer> callMoney = new HashMap<>();
		
		String[] arr = s.split("\n");
		
		for(String i: arr){
			System.out.println("i " + i );
			System.out.println(i.substring(0,2));
			int hr = Integer.parseInt(i.substring(0,2));
			int min = Integer.parseInt(i.substring(3,5));
			int sec = Integer.parseInt(i.substring(6,8));
			int amount = 0;
			System.out.println("Hr : "+ hr+ " min : "+ min +" sec : "+sec);
			int totalTime = hr * 60 + min * 60 + sec;
			System.out.println("Total Time : "+ totalTime);
			String key = i.replace("-", "").substring(i.indexOf(",")+1);
			if(min < 5){
				amount = totalTime * 3;
			}else if(min >= 5 && sec >= 0){
				min = min +1;
				amount = min * 150;
			}
			if(call.get(key) != null && callMoney.get(key) != null){
				call.put(key, totalTime+call.get(key));
				
				System.out.println("amount :"+ amount);
				callMoney.put(key, amount+callMoney.get(key));
			}else{
				System.out.println("amount :"+ amount);
				call.put(key, totalTime);
				callMoney.put(key, amount);
			}
			
		}
		
		System.out.println(call);
		System.out.println(callMoney);
		
		 int maxValueInMap=(Collections.min(call.values())); 
		 int mValueInMap=(Collections.max(call.values())); 
		 
		 System.out.println("max" +mValueInMap);
			
		List<String>  lt=	Test1.getKeyFromValue(call, maxValueInMap);
		List<String>  lt1=	Test1.getKeyFromValue(call, mValueInMap);
		
		System.out.println("lt" +lt1);
		
		if(lt1.size() ==1){
			
			System.out.println(callMoney.get(lt.get(0)));
		}
		 if(lt1.size() >1){
			System.out.println("inside");
			String minimum = Collections.min(lt1);
			int sum = 0;
			for(Entry<String, Integer> v1 : callMoney.entrySet()){
				if(v1.getKey()!=minimum ){
					
					sum += v1.getValue();
				}
				
			}
			System.out.println(sum);
			System.out.println(callMoney.get(minimum));
		}
		
		
	}

}
