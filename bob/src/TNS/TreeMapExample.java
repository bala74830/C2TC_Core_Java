package TNS;
import java.util.*;  
class TreeMapExample
{  
 public static void main(String args[])
 {  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();  
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
      //map.put(null, "Xaviour");
     map.put(105, null);
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}
