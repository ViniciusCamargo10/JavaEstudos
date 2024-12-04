public class Main {
    public static void main(String[] args) {

        // Conjuntos de valores definidos, mais seguro e menos erros
        PeriodoEnum periodo = PeriodoEnum.MANHA;
        System.out.println(periodo); // Exibe o nome do enum
        System.out.println(periodo.getPeriodo()); // Exibe o valor associado ao enum

        // Usando o método values() para listar todos os valores do enum
        PeriodoEnum[] todosPeriodos = PeriodoEnum.values();

        for (PeriodoEnum valores : todosPeriodos) {
            System.out.println(valores); // Exibe o nome de cada enum (MANHA, TARDE, NOITE)
        }
    }
}
