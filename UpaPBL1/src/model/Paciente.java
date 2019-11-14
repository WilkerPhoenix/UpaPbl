package model;

public class Paciente {

	private String nome;
	private int matricula;
	private int prioridade;

	/**
	 * Contrutor da classe Paciente onde será inicializado os atributos nome e
	 * matrícula do paciente.
	 * 
	 * @param nome
	 * @param matricula
	 */
	public Paciente(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;

	}

	
	/**
	 * Retorna uma String contendo o nome do paciente.
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
		
	}
	/**
	 * Retorna um inteiro contendo a matrícula do paciente.
	 * @return matricula
	 */
	public int getMatricula() {
		return this.matricula;
	}

	/**
	 * Retorna um inteiro contendo a prioridade do paciente.
	 * É dividida em três tipos: alta, média e baixa.
	 * @return prioridade
	 */
	
	public int getPrioridade() {
		return prioridade;
	}

	


}
