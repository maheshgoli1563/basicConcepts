package variables;

public class Variables {
	
	int s=10;
	static int a=9;
	
	public static void main(String[] args) {
		variables1();
		Variables v=new Variables();
		System.out.println(v.s);
	}
	public static void variables1(){
		int c=23;
		System.out.println(a);
		System.out.println(c);
	}
}
