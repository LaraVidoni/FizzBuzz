package iut.unilim.fr.fizzbuzz;

public  class RegleFizzBuzz {
	public RegleFizzBuzz() {
		
	}
	
	public boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	public boolean isBuzz(Integer nombre) {
		return 0 == nombre % 5;
	}

	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "fizzbuzz";
		
		return null;

	}
	
}
