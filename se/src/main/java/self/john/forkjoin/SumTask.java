package self.john.forkjoin;

import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Integer> {

    // work as the cache saving original data
    private final int[] data;

    // the range of this task
    private final int start;
    private final int end;

    public SumTask(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // end the recursive task
        if (end - start <= 1) {
            int result = 0;
            for (int i = start; i < end; i++) {
                result += data[i];
            }
            return result;
        }

        // separate the task
        int middle = (start + end) / 2;
        SumTask left = new SumTask(data, start, middle);
        SumTask right = new SumTask(data, middle, end);
        left.fork();
        right.fork();
        return left.join() + right.join();
    }
}
