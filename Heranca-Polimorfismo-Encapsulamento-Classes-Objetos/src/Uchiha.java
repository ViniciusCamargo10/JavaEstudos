// Classe Uchiha herda de Ninja (herança)
public class Uchiha extends Ninja {

    // Método exclusivo da classe Uchiha
    public void sharinga(){
        System.out.println("Sou um uchiha e tenho um sharingan");
    }

    // Sobrescrita (override) do método ataqueBase (polimorfismo)
    @Override
    public void ataqueBase() {
        System.out.println("Taquei uma kunai de fogo");
    }
}