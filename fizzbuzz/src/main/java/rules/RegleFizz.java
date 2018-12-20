package iut.unilim.fr.fizzbuzz;

public  class RegleFizz implements Regle {
	public RegleFizz() {}
	
	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % 3;
	}

	@Override
	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "fizz";
		
		return null;

	}
	
}
