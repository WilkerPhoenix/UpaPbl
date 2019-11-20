package model;

public class Exame {

	public Exame(String nomeDoExame, Paciente paciente, Medico medico) {
		this.nomeDoExame = nomeDoExame;
		this.paciente = paciente;
		this.medico = medico;
	}

	private String nomeDoExame;
	private Paciente paciente;
	private Medico medico;

	public String getNomeDoExame() {
		return nomeDoExame;
	}

	public void setNomeDoExame(String nomeDoExame) {
		this.nomeDoExame = nomeDoExame;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
