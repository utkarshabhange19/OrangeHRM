import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class contactBetweenHAshcodeAndEqual {

	public static void main(String[] args) {
		Employ emp1 =new Employ(101, "suraj", "test");
		Employ emp2 =new Employ(101, "suraj", "test");
		Employ emp3 =new Employ(102, "amit", "dev");
		Employ emp4 =new Employ(103, "raje", "car");
		Employ emp5 =emp1;
	
	System.out.println(emp5.equals(emp1));
	System.out.println(emp1.hashCode());
	System.out.println(emp2.hashCode());
	System.out.println(emp3.hashCode());
	System.out.println(emp4.hashCode());
	
	System.out.println("print hashset----------->>>>>.");
	
	Set<Employ>empset=new HashSet<>();
	empset.add(emp1);
	/*empset.add(emp2);
	empset.add(emp3);
	empset.add(emp4);
	*/
	for(Employ emp:empset) {
		System.out.println(emp);
	}
	
	Map<Employ,Employ>empMap =new HashMap<>();
	empMap.put(emp1, emp1);
	empMap.put(emp2, emp2);
	empMap.put(emp3, emp3);
	empMap.put(emp4, emp4);
	
	for(Map.Entry<Employ, Employ>emp:empMap.entrySet()) {
	System.out.println("key--------"+emp.getKey()+"value--------"+emp.getValue());	
	}
	System.out.println(empMap.get(emp1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
