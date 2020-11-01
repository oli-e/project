package olena.chorna;

public class Boss {

    private final Worker worker;

    public Boss(Worker worker) {
        this.worker = worker;
    }

    public Product doWork() {
        return worker.doWork();
    }
}
