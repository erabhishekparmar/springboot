package builderpattern;

class User {
    private String name;
    private int age;
    private String email;

    // Private constructor
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // Static inner Builder class
    public static class Builder {
        private String name;
        private int age;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
    }
}
