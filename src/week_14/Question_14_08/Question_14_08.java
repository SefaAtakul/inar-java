package week_14.Question_14_08;

public class Question_14_08 {
    public static void main(String[] args) {
        NewStack stack = new NewStack();

        try {
            System.out.println("Top method :" + stack.top());

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println("Size :" + stack.size());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
