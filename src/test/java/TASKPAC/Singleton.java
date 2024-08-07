package TASKPAC;

public class Singleton {

	private Singleton() {	
	}
	
	static Singleton sing =null;
	
	public static Singleton callsinglefn() {
		System.out.println(sing);
		if (sing==null) {
			 sing=new Singleton();
		}
		return sing;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
