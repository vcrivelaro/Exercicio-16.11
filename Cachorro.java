package Familia38;

public class Cachorro extends Animal{
	
	private String raca;
	private String personalidade;
	
	public Cachorro (String nome,String som,String corre,String sexo, float peso, int idade,String raca, String personalidade)
	{
		super(nome,som,corre,sexo,peso,idade);
		this.raca = raca;
		this.personalidade = personalidade;
	}
	
	public void imprimirInfo() 
	{
		System.out.println("\nRaça da(o) cachorro: "+raca+"\nSexo da(o) cachorro: "+getSexo()+"\nNome da(o) cachorro: "+getNome()+
		"\nEmite som ? "+getSom()+"\nDeve correr? "+getCorre()+"\nPeso da(o) "+getNome()+": "+getPeso()+ " quilos"+
		"\nPersonalidade (Agressivo, calmo,carinho e etc): "+personalidade);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}
		
	
}
