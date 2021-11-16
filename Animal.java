package Familia38;

public class Animal {
	
	// declaração de atributos de classe
	
	private String nome;
	private String som;
	private String corre;
	private String sexo;
	private float peso;
	private int idade;
	
	// declarar o método construtor
	
	public Animal (String nome,String som,String corre,String sexo, float peso, int idade)
	{
		this.nome = nome;
		this.som = som;
		this.corre = corre;
		this.peso = peso;
		this.idade = idade;	
		this.sexo = sexo;
	}
	
	// get and set

	
	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
