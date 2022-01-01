package br.com.llduran.generics_in_java;

import br.com.llduran.generics_in_java.model.User;
import br.com.llduran.generics_in_java.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericsInJavaApplication implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(GenericsInJavaApplication.class, args);
	}

	@Override public void run(String... args) throws Exception
	{
		// Printing a Integer
		var integerPrinter = new IntegerPrinterService(23);
		integerPrinter.print();

		// Printing a Double
		var doublePrinter = new DoublePrinterService(30.5);
		doublePrinter.print();

		// Printing a String
		var stringPrinter = new StringPrinterService("Hello World");
		stringPrinter.print();

		// Printing a User
		var user = User.builder().id(1L).nome("José da Silva").idade(18).sexo("Masculino").build();
		var userPrinter = new UserPrinterService(user);
		userPrinter.print();

		// Printing a Integer using Generics
		PrinterServiceGeneric<Integer> printerInt = new PrinterServiceGeneric<Integer>(23);
		printerInt.print();

		// Printing a Double using Generics
		PrinterServiceGeneric<Double> printDouble = new PrinterServiceGeneric<Double>(30.5);
		printDouble.print();

		// Printing String using Generics
		PrinterServiceGeneric<String> printString = new PrinterServiceGeneric<String>("Hello World");
		printString.print();

		// Printing a User using Generics
		var userNovo = User.builder().id(1L).nome("Paula do Nascimento").idade(23).sexo("Feminino").build();
		PrinterServiceGeneric<User> printUser = new PrinterServiceGeneric<User>(userNovo);
		printUser.print();
	}
}
