package Familia38;

public class Preguiça extends Animal{
	
	// Atributos da classe
	
	private int dorme;

	// Construtor
	
	public Preguiça (String nome,String som,String corre,String sexo, float peso, int idade, int dorme)
	{
		super(nome,som,corre,sexo,peso,idade);
		this.dorme = dorme;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nSexo da(o) preguiça: "+getSexo()+"\nNome da(o) preguiça: "+getNome()+
		"\nEmite som ? "+getSom()+"\nPeso da(o) "+getNome()+": "+getPeso()+ " quilos"+"\nQuanto tempo a(o) "+getNome()+" dorme: "+dorme);
	}
}
