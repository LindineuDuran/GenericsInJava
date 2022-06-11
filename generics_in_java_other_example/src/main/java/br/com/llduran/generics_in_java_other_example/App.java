package br.com.llduran.generics_in_java_other_example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner
{

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		exemploSemGenerics();

		exemploComGenerics();

		exemploComGenericsSoNumero();
	}

	private void exemploSemGenerics()
	{
		System.out.println("=== Exemplo Sem Generics ===");

		SemGenerics inteira = new SemGenerics(2);
		System.out.println(inteira.aoQuadradoInt());

		SemGenerics decimal = new SemGenerics(2.5);
		System.out.println(decimal.aoQuadradoDouble());
	}
	private void exemploComGenerics()
	{
		System.out.println("=== Exemplo Com Generics ===");

		ComGenerics<Integer> inteira = new ComGenerics(2);
		inteira.printar();

		ComGenerics<Double> decimal = new ComGenerics<>(2.5);
		decimal.printar();

		ComGenerics<String> texto = new ComGenerics<>("Sou uma String");
		texto.printar();
	}

	private void exemploComGenericsSoNumero()
	{
		System.out.println("=== Exemplo Com Generics Que Só Aceita Números ===");

		ComGenericsSoNumero<Integer> inteira = new ComGenericsSoNumero(5);

		ComGenericsSoNumero<Double> decimal = new ComGenericsSoNumero<>(5.7);

		System.out.println(inteira.aoQuadrado() + " | " + decimal.aoQuadrado());

		System.out.println(inteira.saoIguais(decimal));
	}
}
