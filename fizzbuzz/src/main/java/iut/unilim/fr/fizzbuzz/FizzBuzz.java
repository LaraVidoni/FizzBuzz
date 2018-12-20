package iut.unilim.fr.fizzbuzz;

public class FizzBuzz {

	public String donnerLaReponsePour(Integer nombre) {
		RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
		RegleBuzz regleBuzz = new RegleBuzz();
		RegleFizz regleFizz = new RegleFizz();

		if (regleFizzBuzz.estVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee(nombre);

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee(nombre);

		if (regleFizz.estVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee(nombre);

		return String.valueOf(nombre);
	}

}