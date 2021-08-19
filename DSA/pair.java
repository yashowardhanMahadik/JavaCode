class Pair{
    int br;
    Node node;
    Pair(Node n, int h){
        node=n;
        br=h;
    }
}
class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    //int level =0;
    TreeMap<Integer,Integer> tmap ;
    ArrayList<Integer> alist;
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        tmap = new TreeMap<>();
        alist = new ArrayList<>();
        if(root==null){
            return null;
        }
        Queue<Pair> que = new LinkedList<>();
        Pair pr = new Pair(root,0);
        int br =0;
        que.add(pr);
        tmap.put(br,root.data);
        while(!que.isEmpty()){
            Pair pair = que.remove();
            Node temp = pair.node;
           int br2 = pair.br;
                tmap.put(br2,temp.data);
            if(temp.left!=null){
                que.add(new Pair(temp.left,br2-1));
            }
            if(temp.right!=null){
                que.add(new Pair(temp.right,br2+1));
            }
        }
        for(Map.Entry<Integer,Integer> e : tmap.entrySet()){
            alist.add(e.getValue());
        }
        return alist;
        
    }
}
