
public class cursa {
	public static void main(String args[]) {
		
		pista Pista = new pista(40, 5);
		Jutge jutge = new Jutge(Pista);
		
		Participant Corredor = new Participant("Jordi", Pista, 0, 0);
		Participant Corredor2 = new Participant("Juan", Pista, 0, 0);
		Participant Corredor3 = new Participant("Jalbert", Pista, 0, 0);	
		Participant Corredor4 = new Participant("Mario", Pista, 0, 0);	
	/*	
*/
		Corredor.start();
		Corredor2.start();
		Corredor3.start();
		Corredor4.start();
		jutge.start();

	}
}
