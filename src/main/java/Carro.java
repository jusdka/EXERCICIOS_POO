public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    public static final int ANO_PRIMEIRO_CARRO = 1886; //constante
    public static int totalCarros = 0; //atributo estático

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarros++;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){ //void pq ele não vai retornar nada
        this.marca = m;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String md){
        this.modelo = md;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int a){
        // validação
        if (a < ANO_PRIMEIRO_CARRO || a > 2026){
            System.out.println("404 ! Ano inválido");
        } else{
            this.ano = a;
        }
    }

    public static int getTotalCarros() {
        return totalCarros;
    }
    @Override
    public String toString() {
        return String.format("Marca: %-10s | Modelo: %-10s | Ano: %d", marca, modelo, ano);
    }

}
