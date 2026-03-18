package aula;

public class meuCarroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carro carro01 = new carro();
		carro carro02 = new carro();
		carro carro03 = new carro();
		
		carro01.marca = "vw";
		carro01.modelo = "golf";
		carro01.cor = "preto";
		carro01.placa = "oxe2666";
		carro01.combustivel = "flex";
		
		carro02.marca = "toyota";
		carro02.modelo = "carolla";
		carro02.cor = "branco";
		carro02.placa = "xei2026";
		carro02.combustivel = "flex";
		
		carro03.marca = "vw";
		carro03.modelo = "virtus";
		carro03.cor = "branco";
		carro03.placa = "taok2026";
		carro03.combustivel = "flex";
		
		System.out.println("carros do meu estoque: " +
							carro01.modelo + ", " +
							carro02.modelo + ", " +
							carro03.modelo
				);
		
	}

}
