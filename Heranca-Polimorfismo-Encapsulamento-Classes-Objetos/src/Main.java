// Classe principal Main, ponto de entrada do programa
public class Main {
 public static void main(String[] args) {

  // Criação de um objeto da classe Ninja (objeto figurante)
  Ninja figurante = new Ninja();
  System.out.println();

  // Definindo o nome usando o método setNome (encapsulamento)
  figurante.setNome("Figurante");

  // Obtendo o nome usando o método getNome (encapsulamento)
  figurante.getNome();
  System.out.println("Meu nome é: " + figurante.getNome());

  // Chamando o método ataqueBase (polimorfismo no próximo exemplo)
  figurante.ataqueBase();

  // Criação de um objeto da classe Uchiha (herança)
  Uchiha sasuke = new Uchiha();

  // Definindo o nome usando o método setNome da classe pai Ninja
  sasuke.setNome("Sasuke");

  // Chamando o método ataqueBase que foi sobrescrito (polimorfismo)
  sasuke.ataqueBase();

  // Chamando o método específico da classe Uchiha
  sasuke.sharinga();

  // Obtendo e exibindo o nome de Sasuke
  System.out.println("Meu nome é: " + sasuke.getNome());

 }
}
