package ArrylistCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistcollection {
	
	public static void main(String[] args) {
		
		LinkedList<String>str=new LinkedList<String>();
		
		str.add("suraj");
		str.add("amit");
		str.add("raju");
		str.add("ramesh");
		
		System.out.println(str+"  "+str.size()+"   "+str.getFirst()+"  "+str.getLast());
		
		str.set(0, "dev");
		
		System.out.println(str.getFirst());
		
		str.removeFirst();
		
		System.out.println(str.get(0));
		
		Iterator<String>it=str.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}

}
