class participant extends Thread {
	// Instanciar variables
	double i = 0;
	int numerocarril;
	pista atletisme;
	String nomParticipant;
	int esgotament;
	int estimulant;
	
	// Constructor
	public participant(String str, pista pisto, int esgot, int estimu) {
		this.nomParticipant = str;
		this.atletisme = pisto;
		this.esgotament = esgot;
		this.estimulant = estimu;
	}
	// Methods
	private double control(double metresrecorreguts){
		
		double augment = (double) (Math.random() * 2);
		if (augment>1.5)
			incrementarEsgotament();		
		return augment;
		//prioritat actual?
		
	}
	private void incrementarEsgotament(){
		if (this.getPriority()>0 && this.esgotament<5){
			System.out.println("en la pista  el corredor "+ this.nomParticipant +" ha fet una esprintada que passarà factura");
			this.esgotament++;
			this.setPriority(this.getPriority() - this.esgotament);
		}
	}
	private void incrementarEstimulant(int increment){
		if (increment==2 && this.getPriority()<9 || increment==1 && this.getPriority()<10){
			this.setPriority(this.getPriority() + increment);
		}
		
	}
	public void run() {
		int numerocarril = atletisme.getCarril(this.getName());
		if(numerocarril != -1){
			System.out.println(this.nomParticipant + "<< Esta Corrent en numero carril: " +  numerocarril);
			while (!atletisme.dispar){};
			while (i < atletisme.getLongitud()) {

				i += this.control(i);
				System.out.println(i + " " + this.nomParticipant);
								try {
					this.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.incrementarEsgotament();
			int posicio = atletisme.trencarCinta();
			if (posicio == 1){	
				System.out.println("en la pista ... el corredor " + this.nomParticipant + " ha arribat el primer classificant-se així per a la final. (al primer de la pista al acabar)");		
		
				incrementarEstimulant(2);
			}else if(posicio == 2){			
				System.out.println("en la pista ... el corredor " + this.nomParticipant + " ha quedat en segona posició classificant-se així per a la final (al arribar el segon)");
				incrementarEstimulant(1);
			}
			else{				
				System.out.println("en la pista ... el corredor " + this.nomParticipant + " ha acabat la cursa");
			}
		}else{
			System.out.println("Tu no Corres!");
		}
	}

}
