package br.com.llduran.generics_in_java.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StringPrinterService
{
	String thingToPrint;

	public void print()
	{
		System.out.println(thingToPrint);
	}
}
