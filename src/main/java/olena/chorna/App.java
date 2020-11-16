package olena.chorna;

public class App {
}
package olena.chorna;

        import olena.chorna.factory.Boss;
        import olena.chorna.factory.Product;
        import olena.chorna.factory.Worker;

public final class App {
    public static void main(String[] args){
        System.out.println("Olena to ja xd");

        Worker bob = new Worker("bob");
        Boss boss = new Boss(bob);

        Product p1 = bob.doWork();
        Product p2 = boss.doWork();

        System.out.println(p1);
        System.out.println(p2);




    }
}
