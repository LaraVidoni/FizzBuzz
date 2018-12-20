package rules;

public  class RegleFizzBuzz implements Regle{
	public RegleFizzBuzz() {}
	
	@Override
	public boolean estVerifieePar(Integer nombre) {
		return 0 == nombre % (3 * 5);
	}

	@Override
	public  String valeurAAfficherSiRegleVerifiee(Integer nombre) {
		if (estVerifieePar(nombre))
			return "fizzbuzz";
		
		return null;

	}
	
}
