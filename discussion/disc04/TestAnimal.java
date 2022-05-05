public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Pluto",10);
        Cat c = new Cat("Garfield", 6);
        Dog d = new Dog("Fido", 4);
        a.greet();//Animal Pluto says: Huh?
        c.greet();//Cat Garfield says: Meow!
        d.greet();//Dog Fido says: Woof!
        c.play();//error play()需要参数
        //Woo it is so much fun of being an animal!
        //c是A的子类，c可以用父类的方法play（）不需要参数，自己的play(expr)
        c.play(":)");//Woo it is so much fun of being a cat :)
        a = c;
        ((Cat) a).greet();//Cat Pluto says: Meow!
        ((Cat) a).play(":D");//Woo it is so much fun of being a cat :D
        a.play();//compile error Animal.play不需要参数
        //((Dog) a).play(12);//Woo it is so much fun being a dog!
        //a被转换成了class cat，cat 不能转换成dog
        //runtime error class cat cannot cast to class Dog
        a.greet();//Cat Pluto says: Meow!
        c = (Cat) a;//compile error
        //class a is Animal,class c is cat.
        //即使在运行时，a确实有动态类型 Cat，编译器也只能看到静态类型，因此它不相信这个赋值是有效的。
        //编译器只会看到我们试图将 Cat 变量设置为指向 Animal，而 Animal 不是 Cat！
        //修复这个错误的一种方法是将a强制转换为Cat, c = (Cat) a; 。
        // 这将是一个有效的强制转换，因为编译器同意静态类型 Animal 的变量可能存在一个 Cat，所以我们的请求是可行的。
        //在运行时，这一行会很好，因为我们说的是实话: a 确实是一个动态 Cat！
    }
}
