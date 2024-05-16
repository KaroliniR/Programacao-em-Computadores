package modelos;

public class Funcionario extends Pessoa {

	private String cargo;
	private float salario;

	// Questão 5 b)
	public Funcionario(int codigo, String nome, String cpf, String email, String cargo, float salario) {
		super(codigo, nome, cpf, email);
		this.cargo = cargo;
		this.salario = salario;
	}

	// Questão 5 c)
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ",\n salario=" + salario + ",\n codigo=" + codigo + ", nome=" + nome
				+ ",\n cpf=" + cpf + ",\n email=" + email + "]";
	}

}
