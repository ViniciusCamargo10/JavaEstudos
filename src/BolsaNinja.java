import java.util.ArrayList; // Importa a classe ArrayList da biblioteca Java
import java.util.List; // Importa a interface List da biblioteca Java

// Classe genérica BolsaNinja que pode armazenar ferramentas de qualquer tipo
public class BolsaNinja<T> {

    // Atributo privado que armazenará a lista de ferramentas
    private List<T> ferramentas;

    // Construtor da classe, inicializa a lista de ferramentas como um ArrayList
    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    // Método para adicionar uma ferramenta à lista
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta); // Adiciona a ferramenta à lista
    }

    // Método para mostrar todas as ferramentas armazenadas na lista
    public void mostrarFerramenta(){
        // Itera sobre cada ferramenta na lista e a imprime
        for(T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}
