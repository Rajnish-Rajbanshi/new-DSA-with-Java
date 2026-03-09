import java.util.Scanner;
import java.util.Stack;

public class StackMenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the maximum size of the stack: ");
        int maxSize = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        boolean running = true;
        while (running) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Basic validation to ensure the input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                sc.next(); // Clear the invalid input
                continue;
            }

            int choice = sc.nextInt();

            switch (choice) {
                case 1: // PUSH
                    if (stack.size() < maxSize) {
                        System.out.print("Enter element to push: ");
                        int element = sc.nextInt();
                        stack.push(element);
                        System.out.println("✓ " + element + " pushed to stack.");
                    } else {
                        System.out.println("⚠ Stack Overflow! Cannot push.");
                    }
                    break;

                case 2: // POP
                    if (!stack.isEmpty()) {
                        System.out.println("↳ Popped element: " + stack.pop());
                    } else {
                        System.out.println("⚠ Stack Underflow! Nothing to pop.");
                    }
                    break;

                case 3: // PEEK
                    if (!stack.isEmpty()) {
                        System.out.println("👁 Top element: " + stack.peek());
                    } else {
                        System.out.println("⚠ Stack is empty.");
                    }
                    break;

                case 4: // DISPLAY
                    if (!stack.isEmpty()) {
                        // Reversing the display so the top is literally on top
                        System.out.println("Stack (Top to Bottom):");
                        for (int i = stack.size() - 1; i >= 0; i--) {
                            System.out.println("| " + stack.get(i) + " |");
                        }
                        System.out.println("-----");
                    } else {
                        System.out.println("⚠ Stack is empty.");
                    }
                    break;

                case 5: // EXIT
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}