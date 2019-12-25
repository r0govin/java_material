package DsHash;
import java.util.Iterator ;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;



public class conHash {
public static void main (String arg[])
    {
	ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
	hm.put(1, "kiran");
	hm.put(2, "Hello");
	hm.put(3, "Come");
	
	for (Entry<Integer, String> entry : hm.entrySet()) {
		hm.put(4, "ram");
		System.out.println("Key : " + entry.getKey() + " Value : "
			+ entry.getValue());
	}
	}
}
