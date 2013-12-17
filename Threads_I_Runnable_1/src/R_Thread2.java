
public class R_Thread2 implements Runnable{

	private String nom="";
	
	public R_Thread2(String nomm){
		this.nom=nomm;
	}
	
	public void run() {
		int cont =65;
		for (int i = 0; cont <= 65; i++) {
			System.out.println(getNom() + " -->  "+ Character.toString((char)cont));	         
	        cont++;
			try {
	            Thread.sleep(450);  // milliseconds
	         } catch (InterruptedException ex) {}
	      }
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
