package modelos;

public class Pessoa {

	protected int codigo;
	protected String nome;
	protected String cpf;
	protected String email;

	public Pessoa(int codigo, String nome, String cpf, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
