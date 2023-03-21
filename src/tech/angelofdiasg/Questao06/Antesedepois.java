package tech.angelofdiasg.Questao06;

public class Antesedepois {
//	Desenvolva um algoritmo em Java que receba 
//	via construtor um número inteiro e imprima o 
//	seu antecessor e seu sucessor.		
	
	int num;

public Antesedepois(int num) {
	this.num = num;
	
}

public void imprimeAntesEdepois() {
	int antes = this.num - 1;
	int depois = this.num + 1;
	System.out.println("O número informado é: " + this.num +
			". " + "O número antecessor é: " + antes + ". " +
			"O sucessor é: " + depois + ".");
	
}
	
	

}







