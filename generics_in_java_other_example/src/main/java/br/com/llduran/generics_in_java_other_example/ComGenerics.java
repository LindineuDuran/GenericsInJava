package br.com.llduran.generics_in_java_other_example;

public class ComGenerics<T>
{
	T obj;

	public ComGenerics(T obj)
	{
		this.obj = obj;
	}

	public void printar()
	{
		System.out.println(obj);
	}
}
