// Some basic code testing out a class (see Pokemon.java)

//To Do list

class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Pokemon pika = new Pokemon("Pikachu", "Lightning", "Ground", "Flying");

        System.out.println(pika.name);
        System.out.println(pika.type);
        System.out.println(pika.strong);
        System.out.println(pika.weak);
    }
}
