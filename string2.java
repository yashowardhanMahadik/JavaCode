public class Solution {
    public int solve(String A) {
        
        String vow = "aeiouAEIOU";
        int count = 0;
        int s = A.length();
        for(int i=0; i<A.length(); i++){
            if(vow.indexOf(A.charAt(i)) >= 0){
                count += s-i;
            }
        }
        return count % 10003;
    }
}
int num = 5542;
String number = String.valueOf(num);
for(int i = 0; i < number.length(); i++) {
    int j = Character.digit(number.charAt(i), 10);
    System.out.println("digit: " + j);
}
int number = Integer.parseInt(str);// String to integer

boolean numeric = true;
numeric = string.matches("-?\\d+(\\.\\d+)?"); //check if string is num or not

//integer to int 
