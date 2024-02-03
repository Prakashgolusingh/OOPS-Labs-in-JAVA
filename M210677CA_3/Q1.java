/*Write a Java program which reverses a linked list. It takes input N and creates a link
list having N nodes (as per the given class definition) having character data. Create a
class ReverseMain, and define a method reverseList which takes the starting node as
the input parameter and returns the starting node in the reversed list.
Note: Don’t use array to hold the node objects
Class Node
{
char data;
Node next;
}
*/
import java.util.*;
public class Main 
{
    public static void main(String args[]) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of nodes : ");
        ReverseMain ll=new ReverseMain();
        int n=input.nextInt();
        input.nextLine();
        //System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the data in Node1: ");
            char data=input.next().charAt(0);
            //System.out.println();
            ll.add(data);
        }
        System.out.println("The reverseList is: ");
        ll.printt(ll.reverseList());
    }
}
class ReverseMain
{
    Node head;
    Node tail;
    class Node
    {
        char data;
        Node next;
        Node(char data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void add(char data)
    {
        Node newnode=new Node(data);
        if(head==null)
        head=tail=newnode;
        else
        {
            tail.next=newnode;
            tail=newnode;
        }
    }
    public Node reverseList()
    {
        if(head==null || head.next==null)
        return head;
        else
        {
            Node pre=null;
            Node cur=head;
            while(cur!=null)
            {
                Node nex=cur.next;
                cur.next=pre;
                pre=cur;
                cur=nex;
            }
            return pre;
        }
    }
    public void printt(Node head)
    {
        while(head.next!=null)
        {
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print(head.data);
    }
}
