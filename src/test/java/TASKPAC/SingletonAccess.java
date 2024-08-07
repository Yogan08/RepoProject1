package TASKPAC;

public class SingletonAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj =  Singleton.callsinglefn();
		System.out.println(System.identityHashCode(obj));
		Singleton obj1 = Singleton.callsinglefn();
		System.out.println(System.identityHashCode(obj1));
	}

}
