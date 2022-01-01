package br.com.llduran.generics_in_java.service;

import br.com.llduran.generics_in_java.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserPrinterService
{
	User thingToPrint;

	public void print()
	{
		System.out.println(thingToPrint);
	}
}
