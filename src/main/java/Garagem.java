
public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro("VolksWagen", "Nivus", 2023);
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("Chevrolet", "Onix", 2020);
        Carro carro4 = new Carro();
        Carro carro5 = new Carro("Fiat", "Mobi", 2021);
        System.out.println("--------------------------------------------");
        Carro.imprimirTotal();

        //Carro.ANO_PRIMEIRO_CARRO = 1900;
        System.out.println("Ano primeiro carro: " + Carro.ANO_PRIMEIRO_CARRO);


    }

}

// se tentar alterar o valor para 1900 ele não vai deixar pois é uma variável final.

//FINAL: adicionar final em uma variável faz ela virar uma constante de leitura única, ou seja, seu valor não pode ser
// alterado.