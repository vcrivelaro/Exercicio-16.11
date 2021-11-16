package Familia38;

public class Cavalo extends Animal{

	// Atributos da classe 
	
	private float altura;
	private String cor;
	
	// construtor 
	public Cavalo(String nome,String som,String corre,String sexo, float peso, int idade,float altura,String cor)
	{
		super(nome,som,corre,sexo,peso,idade);
		this.altura = altura;
		this.cor = cor;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nSexo da(o) cavalo: "+getSexo()+"\nNome da(o) cavalo: "+getNome()+
		"\nEmite som ? "+getSom()+"\nDeve correr? "+getCorre()+"\nPeso da(o) "+getNome()+": "+getPeso()+ " quilos"+
		"\nAltura da(o) cavalo: "+altura+"\nCor da(o) cavalo: " +cor);
	}

	//get and set
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
}
