package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
	Map<Integer, String> map= new HashMap<Integer, String>();
	
	map.put(1234,"Amit");
	map.put(2345,  "Teju");
	map.put(5865, "Shubhada");
	map.put(null, "asdsfds");
	
	System.out.println(map.get(1234));
	System.out.println(map.get(null));
	Set<Integer> set=map.keySet();
	
	/*for (Object o:map.keySet())
	{
		System.out.println(map.get(o));
		
	}*/
	
	Iterator<Integer> it=set.iterator();
	while(it.hasNext())
	{
		System.out.println(map.get(it.next()));
		
	}
	}

}
