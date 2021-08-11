// { Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t > 0){
        
        	int n = sc.nextInt();
        
            Node head = new Node(sc.nextInt());
            Node tail = head;
        
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   // } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        // approach
        // 1. if only one return as it is
        // 2. put head = null; initially
        // if 2 then second = first.next
        //     first.next = head;
        //     head = first;
        // 3. if more than 2 
        //     second = first.next;
        //     first.next = head;
        //     head = first;
        // till first.next!=null;
        // return head;
        Node first = head;
        head = null;
        Node second = null;
        // if(first.next==null){
        //     return first;
        // }
        //else{
            while(first!=null){
                second = first.next;
                first.next = head;
                head = first;
                first = second;
            }
            // first.next = head;
            // head = first;
             return head;
        //}
        
        
    }
}
