public class Kunai {

    // Atributo privado (encapsulamento)
    private String nome;

    // Construtor que inicializa o nome da kunai
    public Kunai(String nome){
        this.nome = nome;
    }

    // Método getter para acessar o nome da kunai
    public String getNome(){
        return nome;
    }

    // Sobrescrita do método toString para uma exibição personalizada
    @Override
    public String toString(){
        return "Nome: " + nome;
    }
}
