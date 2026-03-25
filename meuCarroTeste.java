package aula;

public class meucarroteste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carro carro01 = new carro();
		carro carro02 = new carro();
		carro carro03 = new carro();
		
		carro01.setMarca("VW");
		carro01.setModelo("golf");
		carro01.setCor("preto");
		carro01.setPlaca("oxe2666");
		carro01.setCombustivel("flex");
		
		carro02.setMarca("toyota");
		carro02.setModelo("corolla");
		carro02.setCor("branco");
		carro02.setPlaca("xei2026");
		carro02.setCombustivel("flex");
		
		carro03.setMarca("VW");
		carro03.setModelo("virtus");
		carro03.setCor("branco");
		carro03.setPlaca("taok2026");
		carro03.setCombustivel("flex");
		
		System.out.println("carros do meu estoque: " +
							carro01.getModelo() + ", " +
							carro02.getModelo() + ", " +
							carro03.getModelo()
				);
		
	}

}