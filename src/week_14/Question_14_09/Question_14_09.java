package week_14.Question_14_09;

public class Question_14_09 {
    public static void main(String[] args) {

        NewMyQueue queue = new NewMyQueue();
        queue.push(0);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.isEmpty());
    }
}
