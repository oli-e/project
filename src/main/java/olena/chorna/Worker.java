package olena.chorna;

import java.util.UUID;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public Product doWork() {
        return new Product(UUID.randomUUID());
    }
}
