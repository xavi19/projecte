
public class cursa {
	public static void main(String args[]) {
		
		pista Pista = new pista(40, 5);
		//pista Piste = new pista(40, 5);
		Jutge jutge = new Jutge(Pista);
		//Jutge jutga = new Jutge(Piste);
		
		Participant Corredor = new Participant("Jordi", Pista, 0, 0);
		Participant Corredor2 = new Participant("Juan", Pista, 0, 0);
		Participant Corredor3 = new Participant("Jalbert", Pista, 0, 0);	
		Participant Corredor4 = new Participant("Mario", Pista, 0, 0);	
	/*	
		
		Participant Corredor5 = new Participant("Maria", Piste, 0, 0);	
		Participant Corredor6 = new Participant("Luigi", Piste, 0, 0);	
		Participant Corredor7 = new Participant("Jhonny", Piste, 0, 0);	
		Participant Corredor8 = new Participant("Jardi", Piste, 0, 0);	
*/
		Corredor.start();
		Corredor2.start();
		Corredor3.start();
		Corredor4.start();
	/*	Corredor5.start();
		Corredor6.start();
		Corredor7.start();
		Corredor8.start();*/
		jutge.start();
		//jutga.start();

	}
}
