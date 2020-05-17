package ArrylistCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrylistconcept {
	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<String>();
		str.add("suraj");
		str.add("amit");
		str.add("raju");
		str.add("hima");

		for (String s : str) {
			System.out.println(s);
		}

		System.out.println("=============for loop============");
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
		}
		/*
		 * System.out.println("=============for while============"); int count=0;
		 * while(str.size()>0) { System.out.println(str.get(0)); count++; }
		 */
		System.out.println("=============for each lambda loop============");

		str.forEach(show -> {
			System.out.println(show);
		});

		System.out.println("=============for Iterator============");

		Iterator<String> it = str.iterator();
		while (it.hasNext()) {
			String show = it.next();
			System.out.println(show);
		}
		System.out.println("=============for Iterator============");
		
		it=str.iterator();
		it.forEachRemaining(show ->{
			System.out.println(show);
		});
		
		System.out.println("=============reverced list============");
		
		ListIterator<String>sir= str.listIterator(str.size());
		
		while(sir.hasPrevious()) {
			String show = sir.previous();
			System.out.println(show);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
