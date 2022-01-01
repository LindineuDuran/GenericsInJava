package br.com.llduran.generics_in_java.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class User
{
	private Long id;
	private String nome;
	private Integer idade;
	private String sexo;
}
