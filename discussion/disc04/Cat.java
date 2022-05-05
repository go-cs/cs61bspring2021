public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow!";
    }

    @Override
    public void greet() {
        System.out.println("Cat " + name + " says: " + this.noise);
    }

    public void play(String expr) {
        System.out.println("Woo it is so much fun of being a cat" + expr);
    }

}
