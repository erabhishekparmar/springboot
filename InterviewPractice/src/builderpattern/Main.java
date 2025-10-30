package builderpattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder()
                        .name("Abhishek")
                        .age(25)
                        .email("abhishek@gmail.com")
                        .build();

        user.display();
    }
}
