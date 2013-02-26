class Jutge extends Thread {
	// instanciar variables
	pista atletisme;
	// Constructor
	public Jutge(pista pisto) {
		this.atletisme = pisto;
	}
	public void run (){
		while (atletisme.contadorCarrils == atletisme.carril);
		atletisme.dispar = true;
		System.out.println("bang!");
	}
}