import java.util.*;

public class QueueY
{
    static class Queue
    {
       static int arr[];
       static int size;
       static int rear = -1;
       
       Queue(int n)
       {
           arr = new int[n];
           this.size = n;
       }
       
       public static boolean isEmpty()
       {
           return rear == -1;
       }
       
       //Enqueue
       public static void add(int data)
       {
           if(rear == size-1)
           {
               System.out.println("Queue is Full!!");
               return;
           }
           
           rear++;
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
           
           int front = arr[0];
           for(int i = 0;i<rear;i++ )
           {
               arr[i] = arr[i+1];
           }
           rear--;
           return front;
       }
       
       //Peek
       public static int peek()
       {
           if(isEmpty())
           {
               System.out.println("The Queue is Empty!!");
               return -1;
           }
           
           return arr[0];
       }
    }
    
    public static void main(String args[])
    {
        Queue n = new Queue(5);
        n.add(1);
        n.add(2);
        n.add(3);
        
        while(!n.isEmpty())
        {
            System.out.println(n.peek());
            n.remove();
        }
    }
}
