
public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro("VolksWagen", "Nivus", 2023);
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("Chevrolet", "Onix", 2020);
        Carro carro4 = new Carro();
        Carro carro5 = new Carro("Fiat", "Mobi", 2021);
        System.out.println("--------------------------------------------");
        Carro.imprimirTotal();


    }

}

// não tem como acessar modelo pelo imprimirTotal(), pois ele não é estático, desse modo, não tem como referencia-lo.

//por que um método static não consegue acessar um atributo de
//instância?
//Porque um método static pertence à classe, não a uma instância específica.
//Já um atributo de instância só existe quando um objeto é criado. Como o método static não tem referência a nenhum objeto
// (this), ele não sabe qual instância deveria acessar — por isso não pode usar atributos de instância diretamente.