
public class T_Thread2 extends Thread{
	
	private String nom;
	
	public T_Thread2(String nomm) {
		super(nomm);
		
	}
	
	public void run(){
		int cont=65;
		for (int i =1; cont<=90;i++){
			System.out.println(this.getName() + " -->  "+ Character.toString((char)cont));
			cont++;
			
			try {
				this.sleep(450); //<- 1s 0.45
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
}
