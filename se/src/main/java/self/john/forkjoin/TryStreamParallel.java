package self.john.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

/**
 * try to change the stream parallelism
 */
public class TryStreamParallel {

    public static void main(String[] args) {
        try(ForkJoinPool forkJoinPool = new ForkJoinPool(30)) {
            forkJoinPool.submit(() -> Stream.of(1,2,3,4,5,6,7,8,9).parallel().forEach(i -> System.out.println(Thread.currentThread().getName() + " -> " + i)));
            forkJoinPool.shutdown();
        }
    }
}
