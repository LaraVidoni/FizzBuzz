package iut.unilim.fr.fizzbuzz;

import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;

public class FizzBuzz {

	private RegleFizzBuzz regleFizzBuzz = new RegleFizzBuzz();
	private RegleBuzz regleBuzz = new RegleBuzz();
	private Regle regleFizz = new RegleFizz();
	
	public String donnerLaReponsePour(Integer nombre) {
		

		if (regleFizzBuzz.estVerifieePar(nombre))
			return regleFizzBuzz.valeurAAfficherSiRegleVerifiee(nombre);

		if (regleBuzz.estVerifieePar(nombre))
			return regleBuzz.valeurAAfficherSiRegleVerifiee(nombre);

		if (regleFizz.estVerifieePar(nombre))
			return regleFizz.valeurAAfficherSiRegleVerifiee(nombre);

		return String.valueOf(nombre);
	}

}