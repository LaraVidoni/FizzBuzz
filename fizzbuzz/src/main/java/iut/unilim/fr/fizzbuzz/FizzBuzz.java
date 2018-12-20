package iut.unilim.fr.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;

public class FizzBuzz {

	private List<Regle> regles;

	public FizzBuzz() {
		this(FizzBuzzReglesFactory.build());
	}

	public FizzBuzz(List<Regle> regle) {
		this.regles = regle;
	}

	public String donnerLaReponsePour(Integer nombre) {

		for (Regle regle : regles) {
			if (regle.estVerifieePar(nombre)) {
				return regle.valeurAAfficherSiRegleVerifiee(nombre);
			}
		}

		return String.valueOf(nombre);
	}

}