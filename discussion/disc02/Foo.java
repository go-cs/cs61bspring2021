public class Foo {
    public int x,y;

    public Foo(int x,int y) {
        this.x=x;
        this.y=y;
    }
    /**只交换了a,b。没交换foobar和baz*/
    public static void switcheroo (Foo a, Foo b) {
        Foo temp = a;
        a = b;
        b = temp;
    }
    /**实现a与b交换*/
    public static void fliperoo (Foo a,Foo b) {
        Foo temp = new Foo(a.x,a.y);//创建了一个新的Foo变量
        a.x=b.x;
        a.y=b.y;
        b.x=temp.x;
        b.y=temp.y;
    }
    /**a和b都变成了a，temp指向a，a的值已经变了，所以最后b指向的是已经变化后的a*/
    public static void swaperoo (Foo a,Foo b) {
        Foo temp = a;
        a.x = b.x;
        a.y = b.y;
        b.x = temp.x;
        b.y = temp.y;
    }

    public static void main(String[] args) {
        Foo foobar = new Foo(10,20);
        Foo baz = new Foo(30,40);
        switcheroo(foobar,baz);
        //foobar.x=30,foobar.y=40;baz.x=10,baz.y=20;
        System.out.print("switcheroo:"+foobar.x+" "+ foobar.y+" "+baz.x+" "+baz.y);
        fliperoo(foobar,baz);
        //foobar.x=10,foobar.y=20;baz.x=30,baz.y=40;
        System.out.print("fliperoo:"+foobar.x+" "+ foobar.y+" "+baz.x+" "+baz.y);
        swaperoo(foobar,baz);
        //foobar.x=30,foobar.y=40;baz.x=10,baz.y=20;
        System.out.print("swaperoo:"+foobar.x+" "+ foobar.y+" "+baz.x+" "+baz.y);
    }
}
