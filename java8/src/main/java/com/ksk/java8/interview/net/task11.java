public class Test {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }
}
____________________________________________________________

public class Main
{
	public static void main(String[] args) {
		print();
	}
	
	static void print() {
		String m = "Hello";
		System.out.println(m);
		bar(m);
		System.out.println(m);
	}
	
	static void bar(String m) {
		m += " World!";
	}
}
____________________________________________________________

public class InternExample{  
      public static void main(String args[]){  
         String s1=new String("hello");  
         String s2="hello";  
         String s3=s1.intern();
         System.out.println(s1==s2);
         System.out.println(s2==s3);
      }
} 

