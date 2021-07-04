https://practice.geeksforgeeks.org/problems/reverse-a-string/1#
// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[] crr = str.toCharArray();
        int len = str.length();
        int mid = len/2 -1;
        for(int i=0;i<=mid;i++){
            char temp = crr[len-i-1];
            crr[len-i-1]=crr[i];
            crr[i]=temp;
        }
        String ans = new String(crr);
        return ans;
    }
}