package thread.executor.test;
public class OldOrderServiceTestMain {
    public static void main(String[] args) {
        String orderNo = "Order#1234";  // 예시 주문 번호
        NewOrderService orderService = new NewOrderService();
        orderService.order(orderNo);
    }
}