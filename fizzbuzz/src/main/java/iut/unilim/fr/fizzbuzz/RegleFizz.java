package iut.unilim.fr.fizzbuzz;

public  class RegleFizz {
	public RegleFizz() {}
	
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 3;
	}

	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "fizz";
		
		return null;

	}
	
}
