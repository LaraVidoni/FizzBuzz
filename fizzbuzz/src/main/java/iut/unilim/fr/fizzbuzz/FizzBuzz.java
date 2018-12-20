package iut.unilim.fr.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;

public class FizzBuzz {

	List<Regle> regles = Arrays.asList(new RegleFizzBuzz(), new RegleFizz(), new RegleBuzz());

	public String donnerLaReponsePour(Integer nombre) {

		for (Regle regle : regles) {
			if (regle.estVerifieePar(nombre)) {
				return regle.valeurAAfficherSiRegleVerifiee(nombre);
			}
		}

		return String.valueOf(nombre);
	}

}