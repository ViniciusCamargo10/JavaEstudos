public class MoedaFactory {
    public static Moeda newmoeda(País país){
        switch (país){
            case USA:
                return new Dolar();
            case BRASIL:
                return new Real();
            default: throw new IllegalArgumentException("Sem moeda desses paises");






        }
    }
}
