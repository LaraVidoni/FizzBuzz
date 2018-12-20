package iut.unilim.fr.fizzbuzz;

import java.util.Arrays;
import java.util.List;

import rules.Regle;
import rules.RegleBuzz;
import rules.RegleFizz;
import rules.RegleFizzBuzz;

public class FizzBuzzReglesFactory {

	public static List<Regle> build() {
		return Arrays.asList(new RegleFizzBuzz(), new RegleFizz(), new RegleBuzz());
	}

}
