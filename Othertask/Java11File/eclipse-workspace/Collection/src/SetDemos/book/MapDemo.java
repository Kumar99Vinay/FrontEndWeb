package SetDemos.book;



import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> dict=new HashMap<String, String>();
		dict.put("Vinay","First division");
		dict.put("Bhisek","second division");
		dict.put("Rohan","third division");
		dict.put("kuldeep","fourth division");
		dict.put("Vivan","Fifth division");
		dict.put(null,null);
		dict.put(null,"sixth division");
		dict.put("sumit",null);
		dict.put("osama",null);
		System.out.println(dict);
		
		String meaning=dict.get("Rohan");
		if(meaning==null) {
			System.out.println("word not found");
		}else {
			System.out.println(meaning);
		}
		String mean=dict.remove("Bhisek");
		System.out.println(mean);
		System.out.println(dict);
		Set<String> keys=dict.keySet();
		System.out.println(keys);
		Collection<String> col=dict.values();
		System.out.println(col);
		
		Iterator<Entry<String,String>> itr=dict.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,String> entry=itr.next();
			System.out.println("==="+entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
	

	}

}
