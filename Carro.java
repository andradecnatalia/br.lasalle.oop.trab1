package br.lasalle.oop.trab1;

public class Carro {
	String modelo;
	String marca;
	String cor;
	int placa;
	boolean ligado;
	
	
	
	
	void movimentando()
	{
		if(ligado){
		 System.out.println("Se beber não dirija!");
		}
		 else
		 {
			 System.out.println("Precisa ligar o carro!");
		}
	   }
	void parado()
	{
		if(ligado){
		 System.out.println("Você ainda está em movimento!");
		}
		 else
		 {
			 System.out.println("Você esta parado!");
		}
	   }     
	void desligar()
	{
		ligada = false;

    }
	void ligar()
	{
		ligada = true;
	}
	void status()
	{
		System.out.println("Classe Carro");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Cor: " + cor);
		System.out.println("Placa: " + placa);
		System.out.println("Ligada: "+ ligada);
		
		
	}
		

}
