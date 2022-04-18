public class Pokemon {
    public String name;
    public int level;//实例变量
    public static String trainer = "Ash";
    public static int partySize = 0;//默认值初始化，整个trainer和partySize都有相同的值

    public Pokemon(String name,int level) {
        this.name=name;
        this.level=level;
        this.partySize+=1;
    }

    public static void main(String[] args) {
        Pokemon p = new Pokemon("Pikachu",17);
        Pokemon j = new Pokemon("Jolteon",99);
        System.out.println("Party size: "+Pokemon.partySize);
        p.printStats();//Pikachu 17 Ash
        int level=18;
        Pokemon.change(p,level);
        p.printStats();//Pikachu 18 Team Rocket
        Pokemon.trainer="Ash";
        j.trainer="Brock";//可以用实例改变静态变量，但不推荐
        p.printStats();//Pikachu 18 Brock
    }

    public static void change(Pokemon poke, int level) {
        poke.level=level;
        level=50;
        poke=new Pokemon("Voltorb", 1);
        poke.trainer="Team Rocket";
    }

    public void printStats() {
        System.out.print(name+" "+level+" "+trainer);
    }
}
