package iut.unilim.fr.fizzbuzz;

public  class RegleBuzz implements Regle {
	public RegleBuzz() {}
	
	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 5;
	}

	@Override
	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "buzz";
		
		return null;

	}
	
}
