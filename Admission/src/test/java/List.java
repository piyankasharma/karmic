import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("super");
		al.add("Great");
		al.add("best");
		System.out.println(al);
		al.addAll(al);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		
		

	}

}
