public class Animal {
    // 3 собственных атрибута
    private String name;
    private int age;
    private double weight;

    // Пустой конструктор (на всякий случай, для студентов)
    public Animal() {
    }

    // Конструктор с параметрами
    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // 3 собственных метода (геттеры и сеттеры не считаются)
    public void eat() {
        System.out.println(name + " кушает.");
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }

    public void makeSound() {
        System.out.println(name + " издает звук.");
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
