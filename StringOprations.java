
String a;
String[] segments = a.split("/");

Stack<String> nameStack = new Stack<>();
StringBuilder path = new StringBuilder();
        for (String name : nameStack) {
            path.append("/");
            path.append(name);
        }
String str = path.toString();

char[] chAr = s.toCharArray();



public class Solution {
    public String solve(String A) {
        Queue<Character> queue = new LinkedList<>();
        StringBuilder buffer = new StringBuilder();
        int [] map = new int[26];
        for (int i=0; i<A.length(); i++) {
            char c = A.charAt(i);
            queue.add(c);
            map[c-'a'] += 1;
            char b = '#';
            while (!queue.isEmpty()) {
                if (map[queue.peek() - 'a'] == 1) {
                    b = queue.peek();
                    break;
                } else {
                    queue.poll();
                }
            }
            buffer.append(b);
        }

        return buffer.toString();
    }
}

