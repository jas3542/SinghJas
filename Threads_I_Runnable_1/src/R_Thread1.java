
public class R_Thread1 implements Runnable {

	private String nom="";
	
	public R_Thread1(String nomm) {
		this.nom = nomm;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public void run() {
		for (int i =1; i<=10;i++){
			System.out.println(getNom() + " -> "+ i);
			try {
				Thread.sleep(1000); //<- 1s
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}

}
