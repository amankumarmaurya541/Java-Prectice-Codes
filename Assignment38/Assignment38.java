package Assignment38;

public class Assignment38 {
    public static void main(String[] args) {
        System.out.println("==== All Season ====");
        for (Season s : Season.values()){
            System.out.println(s);
        }
        System.out.println("==== Ordinal ====");
        for (Season s: Season.values()){
            System.out.println(s.name() + " --> Ordinal: " + s.ordinal());
        }
        System.out.println("==== Store in variable ====");
        Season season = Season.SUMMER;
        System.out.println("My favourite season: " + season);

    }
}
enum Season{
    SUMMER,
    WINTER,
    MONSOON,
    SPRING;
}