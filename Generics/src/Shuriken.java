public class Shuriken {

    // Atributo privado (encapsulamento)
    private int tamanho;

    // Construtor que inicializa o tamanho da shuriken
    public Shuriken(int tamanho){
        this.tamanho = tamanho;
    }

    // Método getter para acessar o tamanho da shuriken
    public int getTamanho(){
        return tamanho;
    }

    // Sobrescrita do método toString para uma exibição personalizada
    @Override
    public String toString(){
        return "Shuriken de tamanho: " + tamanho;
    }
}
