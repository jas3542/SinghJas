
public class T_Thread1 extends Thread {

	
	public T_Thread1(String nom){
		super(nom);
	}
	
	public void run(){
		for (int i =1; i<=10;i++){
			System.out.println(this.getName() + " -> "+ i);
			try {
				
				this.sleep(1000); //<- 1s
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			//yield(); torna a posar el thread en preparat perque el so pugui administrarlo
		}
	}
}
