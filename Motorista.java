package br.lasalle.oop.trab1;

public class Motorista {

	String nome;
	int idade;
  int cnh;
  boolean maosnovolante;           
			
    	
    	
    	void dirigindo()
    	{
    		if(maosnovolante){
    		 System.out.println("Tudo certo, boa viagem!");
    		}
    		 else
    		 {
    			 System.out.println("Ponha as mãos no volante");
    		}
    	   }

    	void status()
    	{
    		System.out.println("Classe Motorista");
    		System.out.println("Nome:" + nome);
    		System.out.println("Idade:"+ idade);
        System.out.println("Habilitação:"+ cnh)
    		System.out.println("Em movimento:"+ maosnovolante);
    		
    	}
}
