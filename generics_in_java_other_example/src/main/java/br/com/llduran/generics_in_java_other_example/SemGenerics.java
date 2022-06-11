package br.com.llduran.generics_in_java_other_example;

public class SemGenerics
{
	public Integer num;
	public Double num1;

	public SemGenerics(Integer num)
	{
		this.num = num;
	}
	public SemGenerics(Double num1)
	{
		this.num1 = num1;
	}

	public Integer aoQuadradoInt()
	{
		return num * num;
	}

	public Double aoQuadradoDouble()
	{
		return num1 * num1;
	}
}
