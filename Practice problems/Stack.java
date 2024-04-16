
public class Stack {

    // store stack elements in array
    private int[] array;
    // total capacity of stack
    private int capacity;
    // top of the stack initally made empty;
    private int top;

    // creating a stack
    Stack(int size) {
        array = new int[size];
        capacity = size;
        // empty at top = -1
        top = -1;
    }

    // isEmpty
    public Boolean isEmpty() {
        return top == -1;
    }

    // isFull
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // push operation
    public void pushStack(int x) {
        if (isFull()) {
            System.out.println("Stackoverlfow, can't add ");
            // terminate
            System.exit(1);
        }
        System.out.println("inserting :" + x);
        array[++top] = x;
    }

    // pop operation
    public int popStack() {
        if (isEmpty()) {
            System.out.println("empty stack, can't pop");
            // terminate
            System.exit(1);
        }
        System.out.println("poping : ");
        return array[top--];
    }

    // print stack elements
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(array[i] + ", ");
            }
        }

    }

    public static void main(String[] args) {

        Stack stack = new Stack(5); // assume stack size is 5;
        System.out.println("before pushing: ");
        stack.displayStack();
        stack.pushStack(2);
        stack.pushStack(4);
        stack.pushStack(5);
        System.out.println("after pushing: ");
        stack.displayStack();
        stack.popStack();
        System.out.println("after 1 pop operation: ");
        stack.displayStack();
        System.out.println("poping 2times more");
    }
}