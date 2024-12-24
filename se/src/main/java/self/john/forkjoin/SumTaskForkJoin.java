package self.john.forkjoin;

public class SumTaskForkJoin {

    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5};
        SumTask task = new SumTask(data, 0, data.length);
        task.fork();
        Integer join = task.join();
        System.out.println("the sum task result:" + join);
    }
}
