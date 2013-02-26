class pista {
	
	//instanciar variables
	int llargada;
	int carril;   // Numero de carrils
	String[] llistaCorredors;
	int contadorCarrils = 0;
	//boolean carrilsPlens;
	boolean guanyador;
	boolean segon;
	volatile boolean dispar=false;
	//constructor
	pista(int longi, int caril){
		llargada = longi;
		carril = caril;
		this.llistaCorredors = new String [carril];
		//carrilsPlens = false;
		guanyador = true;
		segon = true;
	}
	//metodes
	synchronized int getCarril(String Nom){
		if (contadorCarrils < carril){
			llistaCorredors[contadorCarrils] = Nom;
			return contadorCarrils++;
			
		}
		else {
			System.out.println("Atencio carrils plens");
			return -1;
		}
	}
	int getLongitud() {
		return llargada;
	}
	synchronized int trencarCinta(){
		if (guanyador){
			guanyador = false;
			return 1;
		}
		else if (segon){
			segon = false;
			return 2;
		}
		else
			return 3;
	}

}
