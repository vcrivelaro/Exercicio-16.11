package Familia38;

public class Pregui�a extends Animal{
	
	// Atributos da classe
	
	private int dorme;

	// Construtor
	
	public Pregui�a (String nome,String som,String corre,String sexo, float peso, int idade, int dorme)
	{
		super(nome,som,corre,sexo,peso,idade);
		this.dorme = dorme;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nSexo da(o) pregui�a: "+getSexo()+"\nNome da(o) pregui�a: "+getNome()+
		"\nEmite som ? "+getSom()+"\nPeso da(o) "+getNome()+": "+getPeso()+ " quilos"+"\nQuanto tempo a(o) "+getNome()+" dorme: "+dorme);
	}
}
