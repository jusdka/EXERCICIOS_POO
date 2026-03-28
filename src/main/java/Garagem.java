
public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro("VolksWagen", "Nivus", 2023);
        Carro carro2 = new Carro();
        Carro carro3 = new Carro("Chevrolet", "Onix", 2020);
        Carro carro4 = new Carro();
        Carro carro5 = new Carro("Fiat", "Mobi", 2021);
        System.out.println("--------------------------------------------");
        System.out.println("Total de carros criados: " + Carro.totalCarros);


    }

}

// usamos Carro.totalCarros - usamos o nome da classe porque como é um atributo estático, isso indica que ele pertence a classe,
// e não a um objeto em si.

//atributo static - pertence a classe, existe um única cópia na memória para todos.
//atributo de instância - pertence ao objeto criado, cada objeto tem sua própria cópia na memória.