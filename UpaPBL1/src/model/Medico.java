package model;

public class Medico {

	private String nome;
	private int crm;
	
	
	/**
	 * Contrutor da classe Medico onde será inicializado os atributos
	 * nome e CRM
	 * @param nome
	 * @param crm
	 */
	public Medico(String nome, int crm) {
		this.nome = nome;
		this.crm = crm;

	}
	
	/**
	 * Retorna uma String com o nome do médico
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Modifica o nome do médico
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna um inteiro contendo o CRM do médico
	 * @return crm
	 */
	public int getCrm() {
		return crm;
	}
	

}
