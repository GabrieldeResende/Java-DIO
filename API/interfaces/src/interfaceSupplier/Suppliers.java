package interfaceSupplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Suppliers {
	public static void main(String[] args) {
		Supplier<String> saudacao = () -> "Ola!!!";

		List<String> listaSaudacao = Stream.generate(saudacao).limit(5).collect(Collectors.toList());
		
		
		listaSaudacao.forEach(n -> System.out.println(n));
	}

}
