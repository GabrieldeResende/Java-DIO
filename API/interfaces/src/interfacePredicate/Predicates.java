package interfacePredicate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("java", "kotlin", "python", "javaScript", "ruby");
		
		Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
		
		palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

	}

}
