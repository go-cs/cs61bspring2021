public class firstJavaProgram {
    public static void main(String[] args) {
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name,size);
        Dog yourDog = new Dog("Scruffy",1000);
        Dog[] dogList = new Dog[3];
        dogList[0] = myDog;
        dogList[1] = yourDog;
//      dogList[2].name = "Tom";
//      dogList[2].size = 5;
        dogList[2] = new Dog("Tom",5);
        //dogList[3] = new Dog("Cutie",8);
        int x;
        x = size - 5;
        if (x<15) {
            myDog.bark(8);
        }

    }
}
