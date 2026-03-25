package aula;

import java.util.Scanner;

public class minhaloja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro meucarro = new carro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o modelo do seu carro ");
		meucarro.setModelo(sc.nextLine());
		
		System.out.println("Digite a marca do seu carro ");
		meucarro.setMarca(sc.nextLine());
		
		System.out.println("Seu carro é da marca " + meucarro.getMarca() + "e do modelo "
				+ meucarro.getModelo());
		sc.close();

	}

}
