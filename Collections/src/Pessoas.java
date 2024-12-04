import java.util.Objects; // Importa a classe Objects para usar métodos utilitários como hash e equals

public class Pessoas {

    private long id; // Atributo para armazenar o ID da pessoa
    private String nome; // Atributo para armazenar o nome da pessoa

    // Construtor da classe Pessoas
    public Pessoas(long id, String nome) { // Corrigido para long ao invés de Long para o parâmetro id
        this.id = id; // Inicializa o atributo id
        this.nome = nome; // Inicializa o atributo nome
    }

    // Método para obter o ID
    public long getId() {
        return id; // Retorna o ID da pessoa
    }

    // Método para definir o ID
    public void setId(long id) {
        this.id = id; // Define um novo ID para a pessoa
    }

    // Método para obter o nome
    public String getNome() {
        return nome; // Retorna o nome da pessoa
    }

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome; // Define um novo nome para a pessoa
    }

    @Override
    // Método para comparar objetos da classe Pessoas
    public boolean equals(Object o) { // Corrigido o tipo de parâmetro para Object
        if (this == o) return true; // Verifica se as referências são iguais
        if (!(o instanceof Pessoas)) return false; // Verifica se o objeto é da mesma classe
        Pessoas pessoas = (Pessoas) o; // Faz o cast do objeto para Pessoas
        return id == pessoas.id && Objects.equals(nome, pessoas.nome); // Compara os atributos id e nome
    }

    @Override
    // Método para gerar um código hash para objetos da classe Pessoas
    public int hashCode() {
        return Objects.hash(id, nome); // Gera um código hash com base nos atributos id e nome
    }
}
