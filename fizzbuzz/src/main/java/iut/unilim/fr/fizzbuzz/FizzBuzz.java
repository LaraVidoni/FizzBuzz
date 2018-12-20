package iut.unilim.fr.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		RegleBuzz regleBuzz = new RegleBuzz();
		
		if (regleFizzBuzz.estVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee(nombre);

		
		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee(nombre);

		if (isFizz(nombre))
			return "fizz";

		return String.valueOf(nombre);
	}


	
	private boolean isFizz(Integer nombre) {
		return 0 == nombre % 3;
	}

}