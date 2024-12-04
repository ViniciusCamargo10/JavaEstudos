public class User {

    private String firstName;
    private String lastName;
    private String username;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Construtor privado para forçar a criação de objetos via o UserBuilder
    private User(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;



    }

    // Classe estática interna para o Builder
    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public UserBuilder() {
        }

        // Métodos para definir os valores e retornar o próprio builder
        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        // Método para construir o objeto User
        public User build() {
            return new User(firstName, lastName, username, email);
        }
    }
}
