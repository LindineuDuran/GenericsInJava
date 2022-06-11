package br.com.llduran.generics_in_java_other_example;

// T agora dá um extends na classe Number
public class ComGenericsSoNumero<T extends Number>
{
	T numClasse;

	public ComGenericsSoNumero(T numClasse)
	{
		this.numClasse = numClasse;
	}

	public Double aoQuadrado()
	{
		return numClasse.intValue() * numClasse.doubleValue();
	}

	public boolean saoIguais(ComGenericsSoNumero<?> obj)
	{
		if (Math.abs(numClasse.doubleValue()) == Math.abs(obj.numClasse.doubleValue()))
		{
			return true;
		}

		return false;
	}
}
