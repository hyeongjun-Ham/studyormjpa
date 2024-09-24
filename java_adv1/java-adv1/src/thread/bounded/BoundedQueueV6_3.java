package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static util.MyLogger.log;

public class BoundedQueueV6_3 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_3(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        // 자바 버전에 의해 TimeUnit 찾을 수 없음
//        try {
            // 대기 시간 설정 가능
//            boolean result = queue.offer(data, 1, TimeUnit.NANOSECONDS);
            boolean result = queue.offer(data);
            log("저장 시도 결과 = " + result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Override
    public String take() {
//        try {
            // 자바 버전에 의해 TimeUnit 찾을 수 없음
//            return queue.poll(2, TimeUnit.SECONDS);
            return queue.poll();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
