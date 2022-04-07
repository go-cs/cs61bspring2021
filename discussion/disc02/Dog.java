public class Dog {
    public String name;
    public int size;
    public Dog(String name,int size) {
        this.name = name;
        this.size = size;
    }
    public void bark(int c) {
        for (int i = 0; i < c; i++) {
            System.out.print("awwwwwwwwww");
        }

    }
}
