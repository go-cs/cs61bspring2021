public class Main {
    public static void main(String[] args) {
        System.out.println(Library.totalBooks);//直接输出0,1.将 totalBooks 变量更改为非静态，修改后错误，不能使用类调用实例变量
        //System.out.println(Book.lastBookTitle());//直接编译错误，Book.last是空，不能读取title
        //System.out.println(Book.getTitle);//直接编译错误，getTitle是实例方法，类不能调用。

        Book goneGirl = new Book("Gone Girl");
        Book fightClub = new Book("Fight Club");
        System.out.println(goneGirl.title);//可以直接执行输出Gone Girl
        System.out.println(Book.lastBookTitle());//Fight Club，2.将 lastBookTitle 方法更改为非静态，修改后错误，不能使用类调用实例方法
        System.out.println(fightClub.lastBookTitle());//Fight Club,不推荐实例成员访问静态方法，2.将 lastBookTitle 方法更改为非静态，修改后可以正常运行
        System.out.println(goneGirl.last.title);//Fight Club，4.将last变量更改为非静态变量，修改后编译错误，lastBookTitle是静态方法，不能使用实例变量


        Library libraryA = new Library(1);
        Library libraryB = new Library(2);
        libraryA.addBook(goneGirl);


        System.out.println(libraryA.index);//输出1，3.将 addBook 方法更改为 static,修改后编译错误，修改后addBook成了静态方法，不能再使用实例变量
        System.out.println(libraryA.totalBooks);//输出1，1.将 totalBooks 变量更改为非静态，修改后可以运行，因为libraryA就是实例成员


        libraryA.totalBooks = 0;
        libraryB.addBook(fightClub);
        libraryB.addBook(goneGirl);


        System.out.println(libraryB.index);//输出2，5.将library变量更改为 static,可以正常运行，但不推荐。addBook是实例方法，library成了静态变量。
        System.out.println(Library.totalBooks);//输出2，1.将 totalBooks 变量更改为非静态，修改后错误，不能使用类调用实例变量
        System.out.println(goneGirl.library.books[0].title);//Fight Club，






    }
}
