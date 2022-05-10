public class testPeople {
    public static void main(String[] args) {
        Person n = new Person("Neil", 12);
        Person a = new Grandma("Ada",60);
        Grandma v = new Grandma("Vidya", 80);
        //Grandma a1 = new Person("Alex", 70);//complie error ,person is not a grandma
        n.greet(a);//print Hello, Ada
        n.greet(v);//print Hello, Vidya
        v.greet(a);//print Hello, young whippersnapper
        v.greet((Grandma) a);//print How was bingo, Ada
        a.greet(n);//Hello, Niel...Hello, young whippersnapper...Grandma.Person
        a.greet(v);//会打印吗？Hello, young whippersnapper
         ((Grandma) a).greet(v);//How was bingo, Vidya
        //((Grandma) n).greet(v);//会打印吗？class Person cannot be cast to class Grandma
    }
}
