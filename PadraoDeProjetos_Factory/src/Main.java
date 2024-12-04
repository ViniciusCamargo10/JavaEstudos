public class Main {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.newmoeda(País.BRASIL);
        System.out.println(moeda.getSimbolo());


    }
}