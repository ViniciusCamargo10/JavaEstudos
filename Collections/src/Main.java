import java.util.*; // Importa todas as classes do pacote java.util, que inclui List, Set, Map, etc.

public class Main {
    public static void main(String[] args) {
        // Lista de pessoas
        List<Pessoas> listaPessoas = new ArrayList<>(); // Cria uma nova lista para armazenar objetos da classe Pessoas
        listaPessoas.add(new Pessoas(1L, "Jota")); // Adiciona uma nova pessoa à lista com ID 1 e nome "Jota"

        // Obtendo a primeira pessoa da lista
        Pessoas a = listaPessoas.get(0); // Obtém a primeira pessoa da lista e a armazena na variável 'a'

        // Loop para imprimir os nomes das pessoas na lista
        for (Pessoas p : listaPessoas) { // Itera sobre cada objeto Pessoas na lista
            System.out.println(p.getNome()); // Imprime o nome da pessoa atual
        }

        // Conjunto de pessoas
        Set<Pessoas> conjuntoPessoas = new HashSet<>(); // Cria um novo conjunto para armazenar objetos da classe Pessoas sem duplicatas
        Pessoas jota1 = new Pessoas(1L, "Jota"); // Cria um novo objeto da classe Pessoas
        conjuntoPessoas.add(jota1); // Adiciona a pessoa 'jota1' ao conjunto

        System.out.println("---------------"); // Imprime uma linha para separar a saída

        // Tentativa de adicionar a mesma pessoa novamente ao conjunto
        boolean adicionou = conjuntoPessoas.add(jota1); // Tenta adicionar 'jota1' novamente ao conjunto
        if (!adicionou) { // Verifica se a adição foi bem-sucedida
            System.out.println("A pessoa já está no conjunto, não foi adicionada novamente."); // Mensagem se a pessoa já existir
        }

        // Mapa de pessoas
        Map<Long, Pessoas> mapa = new HashMap<>(); // Cria um novo mapa que relaciona IDs (Long) a objetos da classe Pessoas

        // Criando uma nova instância de Pessoas
        Pessoas jota2 = new Pessoas(1L, "Jota"); // Cria um novo objeto da classe Pessoas

        // Adicionando a pessoa ao mapa
        mapa.put(1L, jota2); // Associa o ID 1 ao objeto 'jota2' no mapa

        // Obtendo a pessoa do mapa
        Pessoas pessoaDoMapa = mapa.get(1L); // Obtém a pessoa associada ao ID 1 do mapa
        System.out.println("Pessoa do mapa: " + pessoaDoMapa.getNome()); // Imprime o nome da pessoa obtida do mapa
    }
}
