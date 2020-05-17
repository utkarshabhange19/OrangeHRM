package demo2;

public class test3 {

	static int count =0;
	
	test3(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		
		test3 s =new test3();
		test3 s1 =new test3();
		test3 s2 =new test3();
	}
}
