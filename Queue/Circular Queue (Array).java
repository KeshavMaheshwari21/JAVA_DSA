import java.util.*;

public class QueueY
{
    static class Queue
    {
       static int arr[];
       static int size;
       static int rear = -1;
       static int front = -1;
       
       Queue(int n)
       {
           arr = new int[n];
           this.size = n;
       }
       
       public static boolean isEmpty()
       {
           return rear == -1 && front == -1;
       }
       
       public static boolean isFull()
       {
           return (rear+1)%size == front;
       }
       
       //Enqueue
       public static void add(int data)
       {
           if(isFull())
           {
               System.out.println("Queue is Full!!");
               return;
           }
           
           //If 1st Element
           if(front == -1)
           {
               front = 0;
           }
           rear = (rear+1)%size;
           arr[rear] = data;
       }
       
       //Dequeue
       public static int remove()
       {
           if(isEmpty())
           {
               System.out.println("The Queue is Empty!!");
               return -1;
           }
           
           int result = arr[front];
           
           //Condition for single Element
           if(rear == front)
           {
               rear = front = -1;
           }
           else
           {
               front = (front+1)%size;
           }
           return result;
       }
       
       //Peek
       public static int peek()
       {
           if(isEmpty())
           {
               System.out.println("The Queue is Empty!!");
               return -1;
           }
           
           return arr[front];
       }
    }
    
    public static void main(String args[])
    {
        Queue n = new Queue(5);
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        
        System.out.println(n.remove());
        n.add(6);
        System.out.println(n.remove());
        n.add(7);
        
        while(!n.isEmpty())
        {
            System.out.println(n.peek());
            n.remove();
        }
    }
}
