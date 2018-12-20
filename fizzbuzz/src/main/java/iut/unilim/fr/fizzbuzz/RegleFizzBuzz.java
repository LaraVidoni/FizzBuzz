package iut.unilim.fr.fizzbuzz;

public  class RegleFizzBuzz {
	public RegleFizzBuzz() {}
	
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "fizzbuzz";
		
		return null;

	}
	
}
