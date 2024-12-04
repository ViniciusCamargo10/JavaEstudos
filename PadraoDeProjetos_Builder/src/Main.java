public class Main {
    public static void main(String[] args) {
        // Criando uma instância de User usando o UserBuilder
        User build = new User.UserBuilder()
                .firstName("Vinicius")
                .lastName("Camargo")
                .username("Ca4mqrg0")
                .email("viniciusc.2005@gmail.com")
                .build();  // Construir o objeto User com build()

        System.out.println(build);
    }
}
