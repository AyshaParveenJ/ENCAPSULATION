class A{
    	public static int add(int a,int b) {
    	    
    	        return a-b;
    	}
}
class B{
    	public static int sub(int a,int b) {
    	    
    	        return a+b;
    	    }
}
class C{
    	public static int pro(int a,int b) {
    	    
    	        return a*b;
    	    }
}


public class Main
{
	public static void main(String[] args) {
		A ob=new A();
		int r1=ob.add(10,5);
		B obj=new B();
		int r2 =obj.sub(10,3);
		C obje=new C();
		int r3=obje.pro(10,5);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}

}
