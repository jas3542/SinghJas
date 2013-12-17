
public class Test {
	public static void main(String[] args) {
		
		T_Thread1 t1 = new T_Thread1("Thread 1");
		T_Thread2 t2 = new T_Thread2("Thread 2");
		
		Thread r_T1 = new Thread(new R_Thread1("Runnable Thread_1"));
		Thread r_T2 = new Thread(new R_Thread2("Runnable Thread_2"));
		
		
		t1.start();
		t2.start();
	
		//treure les barres per ferlo funcionar:
		
		//r_T1.start();
		//r_T2.start();
		
	}
}
