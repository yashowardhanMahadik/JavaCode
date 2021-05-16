//Properties of modulo used here along with binary search time complexity
//ab mod n = [(a mod n)(b mod n)] mod n.
//(a + b) mod n = [(a mod n) + (b mod n)] mod n.s


public class Solution {
    public int pow(int x, int n, int d) {
     long ans=1;
     long x1=x;
     long n1=n;
   
    if(n1==0) return 1%d;

   int temp=x;
   while(n1>0){
       if(n1%2==0){
           x1=(x1*x1)%d;
           n1=n1/2;
       }
       else{
           ans=(ans*x1)%d;
           n1=n1-1;
       }
   }
  
   
   if(ans<0){
       ans =(ans+d) %d;
   }
    return (int)ans;
    }
}


