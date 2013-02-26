
public class cursa {
	public static void main(String args[]) {
		
		pista Pista = new pista(40, 5);
		Jutge jutge = new Jutge(Pista);
		
		participant Corredor = new participant("Jordi", Pista, 0, 0);
		participant Corredor2 = new participant("Juan", Pista, 0, 0);
		participant Corredor3 = new participant("Jalbert", Pista, 0, 0);	
		participant Corredor4 = new participant("Mario", Pista, 0, 0);	

		Corredor.start();
		Corredor2.start();
		Corredor3.start();
		Corredor4.start();
		jutge.start();

	}
}
