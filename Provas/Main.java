package main;

import modelos.Funcionario;

public class Main {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario(1, "Fabiano", "123", "2@2.com", "Tutoria", 100);
		Funcionario f2 = new Funcionario(2, "Karina", "123", "2@2.com", "Professora", 100);

		System.out.println("F1: " + f1.toString());

		System.out.println("Nome: " + f1.getNome());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("E-mail: " + f1.getEmail());
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Salário: " + f1.getSalario());

		System.out.println("F2:" + f2.toString());
	}

}
