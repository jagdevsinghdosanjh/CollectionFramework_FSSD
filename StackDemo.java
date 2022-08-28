import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        System.out.println("Is Stack Empty:"+(stack.isEmpty()?"Yes":"No")+"\nAfter Addition Stack Elements are:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        }
}