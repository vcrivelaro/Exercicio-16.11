package Familia38;

public class TesteHeran�aAnimal {
	
	public static void main(String[] args) {
		
		//String nome,String som,String corre,String sexo, float peso, int idade,String raca, String personalidade
		
		Cachorro cachorro1 = new Cachorro ("Nasus","Sim, late","Sim","Masculino", (float) 20.5, 2, "vira - lata", "Carinhoso");
		cachorro1.imprimirInfo();
		
		System.out.println();
		System.out.println("************************************************");
		
		//(String nome,String som,String corre,String sexo, float peso, int idade,float altura,String cor)
		Cavalo cavalo1 = new Cavalo ("Hecarim","Sim, relincha","Sim","Masculino", (float) 67.9, 15, (float) 1.80,"Preto com manchas brancas");
		cavalo1.imprimirInfo();
		
		System.out.println();
		System.out.println("************************************************");
		
		
		//(String nome,String som,String corre,String sexo, float peso, int idade, int dorme)
		Pregui�a preguica1 = new Pregui�a ("Maruru","Sim, n�o fa�o id�ia","N�o","Feminino",30, 3, 12);
		preguica1.imprimirInfo();
	}

}
