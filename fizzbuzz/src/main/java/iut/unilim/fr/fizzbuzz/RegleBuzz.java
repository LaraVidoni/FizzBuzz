package iut.unilim.fr.fizzbuzz;

public  class RegleBuzz {
	public RegleBuzz() {}
	
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 5;
	}

	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "buzz";
		
		return null;

	}
	
}
