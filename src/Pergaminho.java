public class Pergaminho {

    // Atributo privado (encapsulamento)
    private String conteudo;

    // Construtor da classe que recebe o conteúdo do pergaminho
    public Pergaminho(String conteudo){
        this.conteudo = conteudo;
    }

    // Método getter para acessar o conteúdo do pergaminho
    public String getConteudo(){
        return conteudo;
    }

    // Sobrescrita do método toString para exibir o conteúdo de forma personalizada
    @Override
    public String toString(){
        return "Pergaminho: " + conteudo;
    }
}
