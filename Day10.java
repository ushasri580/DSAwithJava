// sample linked list creation 
/*public class Day10 {
    static class DataPoint {
        int value;
        DataPoint next;

        DataPoint(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        DataPoint d1 = new DataPoint(10);
        DataPoint d2 = new DataPoint(20);
        DataPoint d3 = new DataPoint(30);

        d1.next = d2;
        d2.next = d3;

        DataPoint head = d1;
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}*/

class MyLinkedList {
    class ListNode
    {
        int value;
        ListNode next;
        public ListNode(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    ListNode head;
    int size;
    public MyLinkedList()
    {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
            if(index>=this.size)
                return -1;
            else
            {
                ListNode current =this.head;
                for(int itr=0;itr<index;itr++)
                {
                    current=current.next;
                }
                return current.value;
            }  
    }
    
    public void addAtHead(int val) {
        ListNode new_node=new ListNode(val);
        new_node.next = this.head;
        this.head = new_node;
        this.size++;
    }
    
    public void addAtTail(int val) {
        ListNode new_node = new ListNode(val);
        ListNode temp = this.head;
        if(temp==null)
        {
            this.head=new_node;
        }
        else
        {
            while(temp.next != null)
            {
                temp= temp.next;
            }
            temp.next=new_node;
            new_node.next=null;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index <= this.size) {
            if(index==0)
            {
                this.addAtHead(val);
            }
            else if(index==this.size)
            {
                this.addAtTail(val);
            }
            else
            {
                ListNode temp = this.head;
                for(int i=0;i<index-1;i++)
                {
                    temp=temp.next;
                }
                ListNode new_node=new ListNode(val);
                new_node.next=temp.next;
                temp.next=new_node;
                this.size++;
            }
            
        }
    }
    
    public void deleteAtIndex(int index) {
       if(index>=0 && index<size)
       {
          if(index ==0){
            ListNode next_node =this.head.next;
            this.head.next =null;
            this.head =next_node;
          }
          ListNode current =this.head;
          for(int itr = 0;itr<index-1;itr++)
          {
            current =current.next;
          }
          ListNode next_node =current.next;
          current.next = next_node.next;
          next_node.next=null;
          this.size --;

       }
    }
    public void display()
    {
        ListNode temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
}
class Day10
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();
        list.addAtTail(5);
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.addAtIndex(3,40);
        list.display();
        System.out.print(list.get(2));
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList* obj = new MyLinkedList();
 * int param_1 = obj->get(index);
 * obj->addAtHead(val);
 * obj->addAtTail(val);
 * obj->addAtIndex(index,val);
 * obj->deleteAtIndex(index);
 */