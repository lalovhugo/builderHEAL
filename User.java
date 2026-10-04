package builder;

public class User {
    private final String firstName; // Obligatorio
    private final String lastName;  // Obligatorio
    private final int age;          // Opcional
    private final String phone;     // Opcional
    private final String address;   // Opcional

    // Constructor nuevo para reemplazar a los demás constructores [Constructor privado]

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // ... Getters ...

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Clase Interna de Builder

    public static class Builder {
        // Mismos campos que User (con valores por defecto para los opcionales)
        private final String firstName; 
        private final String lastName;  
        private int age = 0;           
        private String phone = "";     
        private String address = "";   

        // 2. Constructor del Builder para Parámetros Obligatorios
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // 3. Métodos de Configuración (Method Chaining)
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 4. Método build()
        public User build() {
            return new User(this);
        }
    }

}

