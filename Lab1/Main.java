public class Main {
    public static void main(String[] args) {
        Shark myShark = new Shark("Белая акула", 10, 800.5, 300, 8, "Морская", 300, "Кархародон", true);

        System.out.println("=== Информация о животном ===");
        System.out.println("Имя: " + myShark.getName());
        System.out.println("Возраст: " + myShark.getAge() + " лет");
        System.out.println("Вес: " + myShark.getWeight() + " кг");
        System.out.println("Вид: " + myShark.getSpecies());
        System.out.println();

        System.out.println("=== Методы класса Animal ===");
        myShark.eat();
        myShark.sleep();
        myShark.makeSound();
        System.out.println();

        System.out.println("=== Методы класса Fish (Рыба) ===");
        myShark.swim();
        myShark.reproduce();
        myShark.breatheUnderwater();
        System.out.println();

        System.out.println("=== Методы класса Shark (Акула) ===");
        myShark.hunt();
        myShark.attack();
        myShark.smellBlood();
    }
}
