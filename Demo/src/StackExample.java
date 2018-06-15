import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s=new Stack<String>();
		System.out.println(s.capacity());
		s.push("A");
		s.push("B");
		s.push("c");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("D"));
        System.out.println(s.search("B"));
	}

}
