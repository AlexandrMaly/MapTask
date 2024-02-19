package utils;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerate {
    private static final AtomicInteger idCounter = new AtomicInteger(0);

    public static int generateUniqueId() {
        return idCounter.incrementAndGet();
    }

    public static void resetId() {
        idCounter.set(0);
    }
}
