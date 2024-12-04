// Classe Ninja, representa um conceito geral de um ninja (classe base)
public class Ninja {
    // Atributo privado (encapsulamento)
    private String nome;

    // Método ataqueBase que pode ser sobrescrito (polimorfismo)
    public void ataqueBase(){
        System.out.println("Taquei uma kunai");
    }

    // Método getter para acessar o nome (encapsulamento)
    public String getNome(){
        return nome;
    }

    // Método setter para modificar o nome (encapsulamento)
    public void setNome(String nome){
        this.nome = nome;
    }
}