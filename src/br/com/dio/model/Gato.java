package br.com.dio.model;

import java.util.Objects;

public class Gato {
	private String nome;
	private String cor;
	private Integer idade;

	// metodo construtor vazio
	public Gato() {
		// ctrl + 3 para abrir janela com opcoes de metodos
		// ctrl + D apaga linha (construtor foi criado com super())
	}

	// metodo construtor com atributos da classe
	public Gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	// metodos getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	// metodos equals e hashcode
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	// metodo toString
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

	// para mover bloco de codigo, usar teclas Alt + seta (cima ou baixo)
	// para refazer a indentacao, usar teclas Ctrl + Shift + F
}
