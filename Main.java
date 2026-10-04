package builder;

//    public class Main {
//        public static void main(String[] args) {
//            // Difícil de leer, ¿qué es cada parámetro?
//            User user = new User("Juan", "Pérez", 30, "+123456789", "Calle Falsa 123");
//        }
//    }

public class Main {
    public static void main(String[] args) {
        // Creación legible y flexible con Builder (todos los campos)
        User user1 = new User.Builder("Juan", "Pérez")
            .age(30)
            .phone("+123456789")
            .address("Calle Falsa 123")
            .build();
        
        System.out.println(user1);
        
        // Solo nombre, apellido y teléfono, aquí usamos el constructor con parametros obligatorios
        User user2 = new User.Builder("María", "Gómez")
            .phone("+987654321")
            .build();
            
        System.out.println(user2);
        
        // Todas las combinaciones son posibles
        User user3 = new User.Builder("Carlos", "López")
            .age(25)
            .address("Avenida Siempre Viva 742")
            .build();
            
        System.out.println(user3);
    }
}