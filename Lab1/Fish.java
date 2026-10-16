public class Fish extends Animal {
    private int maxDepth;
    private int finCount;
    private String waterType;

    public Fish() {
    }

    public Fish(String name, int age, double weight, int maxDepth, int finCount, String waterType) {
        super(name, age, weight);
        this.maxDepth = maxDepth;
        this.finCount = finCount;
        this.waterType = waterType;
    }

    public void swim() {
        System.out.println(getName() + " плавает.");
    }

    public void reproduce() {
        System.out.println(getName() + " размножается.");
    }

    public void breatheUnderwater() {
        System.out.println(getName() + " дышит под водой жабрами.");
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
}
