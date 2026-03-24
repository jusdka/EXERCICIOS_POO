public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.marca = "BYD";
        carro1.modelo = "Dolphin";
        carro1.ano = 2024;
        carro1.exibir();
        carro1.idadeDoCarro();

        Carro carro2 = new Carro();
        carro2.marca = "VolksWagen";
        carro2.modelo = "Voyage";
        carro2.ano = 2011;
        carro2.exibir();

    }

}
