import java.util.*;

class QueueUsingStack {
    Stack<Integer> stack1; // For enqueue
    Stack<Integer> stack2; // For dequeue
    
    public QueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // Enqueue: Push element to stack1
    public void enqueue(int x) {
        stack1.push(x);
        System.out.println(x + " enqueued to queue");
    }
    
    // Dequeue: Pop from stack2, if empty transfer all from stack1
    public int dequeue() {
        // If both stacks are empty, queue is empty
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        
        // Transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.pop();
    }
    
    // Peek: Check front element without removing
    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.peek();
    }
    
    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    
    // Get size of queue
    public int size() {
        return stack1.size() + stack2.size();
    }
}

class Day12 {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        
        // Enqueue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        System.out.println("\nQueue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());
        
        // Dequeue operations
        System.out.println("\nDequeue operations:");
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");
        
        System.out.println("\nQueue size after dequeue: " + queue.size());
        
        // More enqueue and dequeue
        queue.enqueue(60);
        queue.enqueue(70);
        
        System.out.println("\nDequeue after more enqueue:");
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");
        
        // Try to dequeue from empty queue
        System.out.println("\nTrying to dequeue from empty queue:");
        queue.dequeue();
    }
}
