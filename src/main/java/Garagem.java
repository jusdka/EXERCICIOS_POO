public class Garagem {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.marca = "BYD";
        carro1.modelo = "Dolphin";
        carro1.ano = 2024;
        System.out.println("Marca: " + carro1.marca + ", Modelo: " + carro1.modelo + ", Ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.marca = "VolksWagen";
        carro2.modelo = "Voyage";
        carro2.ano = 2011;
        System.out.println("Marca: " + carro2.marca + ", Modelo: " + carro2.modelo + ", Ano: " + carro2.ano);
    }

}
