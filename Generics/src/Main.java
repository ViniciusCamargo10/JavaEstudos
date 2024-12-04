// Classe principal que contém o método main
public class Main {
    // Método principal que é a porta de entrada do programa
    public static void main(String[] args) {

        // Cria uma instância de BolsaNinja para armazenar objetos de qualquer tipo (neste caso, objetos de Kunai, Shuriken e Pergaminho)
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        // Adiciona uma Kunai à bolsa ninja com o nome "Kunai Explosiva"
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));

        // Adiciona uma Shuriken à bolsa ninja com tamanho 2
        bolsaNinja.adicionarFerramenta(new Shuriken(2));

        // Adiciona um Pergaminho à bolsa ninja com conteúdo "jutsu proibido"
        bolsaNinja.adicionarFerramenta(new Pergaminho("jutsu proibido"));

        // Imprime uma mensagem indicando que os itens da bolsa ninja serão exibidos
        System.out.println("Itens da bolsa ninja: ");

        // Chama o método mostrarFerramenta para exibir todos os itens armazenados na bolsa ninja
        bolsaNinja.mostrarFerramenta();
    }
}
