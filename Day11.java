import java.util.*;
/*class Day11{
    public static void main(String arg[])
    {
        Queue<Integer>que=new LinkedList<>();
        que.offer(10);
        que.offer(20);
        que.offer(30);
        que.offer(30);
        que.offer(40);
        que.offer(50);
        que.offer(60);
        que.poll( );
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que);
    }
}*/


/*class Day11{
    public static void main(String arg[])
    {
        Deque que=new Deque();
        que.offerFirst(10);
        que.offerFirst(20);
        que.offerFirst(30);
        que.offerFirst(30);
        que.offerFirst(40);
        que.offerFirst(50);
        que.offerFirst(60);
        que.poll( );
        que.pollLast();
        que.display();
        System.out.println(que.poll());
        System.out.println(que.pollLast());
    }
}
class Node
{
    int data;
    Node prev,next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Deque
{
    Node rear,front;
     
    void offerFirst(int data)
    {
        Node newnode = new Node(data);
        newnode.next=this.front;
        if(this.front==null)
        {
            this.front=this.rear =newnode;
        }
        else
        {
            front.prev = newnode;
            front = newnode;
        }
    }
    void offerLast(int data)
    {
        Node newnode = new Node(data);
        if(this.rear==null)
        {
            this.front=this.rear=newnode;
        }
        else{
            rear.next=newnode;
            newnode.prev=rear;
            rear =newnode;
        }
    }
     int poll() {
        if (front == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front != null)
            front.prev = null;
        else
            rear = null;
        return value;
    }
    int pollLast() {
        if (rear == null) {
            System.out.println("Deque is empty");
            return -1;
        }
        int value = rear.data;
        rear = rear.prev;
        if (rear != null)
            rear.next = null;
        else
            front = null;
        return value;
    }
     void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

//finding 3rd smallest element using priority queue
class Day11
{
    public static void main(String arg[])
    {
        int[] arr = {10,30,7,18,32,19,13,12,17,100};
        int k = 3;

        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for (int val : arr) {
            min_heap.add(val);
        }

        int thirdSmallest = -1;
        for (int i = 0; i < k && !min_heap.isEmpty(); i++) {
            thirdSmallest = min_heap.poll();
        }

        if (thirdSmallest != -1) {
            System.out.println(k + "rd smallest element is " + thirdSmallest);
        } else {
            System.out.println("Array has fewer than " + k + " elements.");
        }
    }
}

//find the smallest using negative maxvalue use and find min value
import java.util.*;
class Day11
{
    public static int kth_smallest(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int val:arr)
        {
            pq.add(-val);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        return -pq.remove();
    }
    public static void main(String []arg)
    {
        int arr[]={10,30,7,18,32,19,13,12,17,100};
        int k=3;
        System.out.println(kth_smallest(arr,k));
    }  
}



//find the smallest using postive minvalue use and find maxvalue
import java.util.*;
class Day11
{
    public static int kth_smallest(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(int val:arr)
        {
            pq.add(val);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        return pq.remove();
    }
    public static void main(String []arg)
    {
        int arr[]={10,30,7,18,32,19,13,12,17,100};
        int k=3;
        System.out.println(kth_smallest(arr,k));
    }  
}*/

//Implement queue using stack
class Queue
{
    Stack<Integer>main,aux;
    public Queue()
    {
        main=new Stack<Integer>();
        aux= new Stack<Integer>();
    }
    public boolean isEmpty()
    {
        return this.main.isEmpty()&& this.aux.isEmpty();
    }
    public void enqueue(int data)
    {
        this.main.push(data);
    }
    public int dequeue()
    {
        if(this.isEmpty())
        {
            return -1;
        }
        if(this.aux.isEmpty()){
                while(!this.main.isEmpty())
                {
                    this.aux.push(this.main.pop());
                }
        }
        return this.aux.pop();
    }
    public int peek()
    {
        if(this.main.isEmpty())
        {
            return -1;
        }
        while(!this.main.isEmpty())
        {
            this.aux.push(this.main.pop());
        }
        return this.aux.peek();
    }
}
class Day11{   
    public static void main(String arg[])
    {
       Queue Q =new Queue();
       Q.enqueue(10);
       Q.enqueue(20);
       Q.enqueue(30);
       System.out.println("Dequeue: " + Q.dequeue());
       System.out.println("Peek: " + Q.peek());
       System.out.println("Is Empty: " + Q.isEmpty());
    }
}


