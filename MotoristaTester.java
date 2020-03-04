package br.lasalle.oop.trab1;


public class MotoristaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motorista c1;
		c1 = new Motorista();
		c1.nome = "Marcia";
		c1.idade = 37;
		c1.cnh= 235869472
		c1.maosnovolante = true;
		
	
        
       Motorista c2;
       	c2= new Motorista();
		c2.nome = "Daniel";
		c2.idade = 39;
		c2.cnh= 105698844
		c2.maosnovolante = false;
		c2.status();
	}

}
