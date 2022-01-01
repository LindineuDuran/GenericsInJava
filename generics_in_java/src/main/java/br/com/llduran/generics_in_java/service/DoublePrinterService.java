package br.com.llduran.generics_in_java.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoublePrinterService
{
	Double thingToPrint;

	public void print()
	{
		System.out.println(thingToPrint);
	}
}
