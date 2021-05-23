//approach
// go row wise and block each column, diag1 and diag2
// place at available slot, then change row
// when the count == no of rows return the result arrayList<ArrayList<Integer>>


public class Solution {
    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
    int aa;
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        
        if(a<=0)
            return result;
        int[] col = new int[a];
        int[] diag1 = new int[2*a-1];
        int[] diag2 = new int[2*a-1];
        this.aa = a;
        Arrays.fill(col,-1);
        Arrays.fill(diag1,-1);
        Arrays.fill(diag2,-1);
        solveIt(col,diag1,diag2,0);
        
        return result;
        
    }
    public void solveIt(int[] column,int[] diag1,int[] diag2,int rowNo)
    {   
    //     if(rowNo==aa-1)
    // { ArrayList<String> cc = new ArrayList();
    //     cc.add("end");
    //         result.add(new ArrayList(cc));
    //     return;
    // }
     if(rowNo>=aa)
     {
         //System.out.print(rowNo+", ");
        return;
     }
    
        for(int col=0;col<aa;col++)
        {
            
            //int[] diag11,diag22,column2;
            int row = rowNo;
            //  System.out.println(row+":row round  "+col+":col");
            //  System.out.println("Column:  "+column[col]);
            //  System.out.print("[");
            //  for(int i=0;i<aa;i++)
            //     {
            //     System.out.print(column[i]+", ");
                
            //     }
            //     System.out.println("]");
             
            if(diag1[row+col]==1 || diag2[aa-1+row-col]==1 || column[col] >= 1)
            {
                continue;
            }
            else{
                // diag11 = diag1.clone();
                // diag11[row+col] =1;
                // diag22 = diag2.clone();
                // diag22[aa+row-col]=1;
                // column2 = column.clone();
                // column2[col]=1;
                // System.out.println(row+":row   "+col+":col");
                diag1[row+col]=1;  diag2[aa-1+row-col]=1;  column[col]=row+1;
            }
            // if(diag1[row+col]==1) { continue; }
            // else{diag1[row+col]=1;}
            // if(diag2[aa+row-col]==1){continue;}
            // else{diag2[aa+row-col]=1;}
            // if(column[col] == 1){ continue; }
            // else{diag1[row+col]=1;}
             
            if(rowNo>=aa-1)
            {
                //System.out.print(rowNo+"asdasdasdasdasdasd");
               ArrayList<String> cd = new ArrayList();
               
               
               for(int i=0;i<aa;i++)
               {
                   StringBuilder ff = new StringBuilder("");
               for(int j=0;j<aa;j++)
                {
                ff.append(".");
                
                }
                char gg = (char)('Q');
                ff.setCharAt(column[i]-1, gg);
                cd.add(ff.toString());
                }
                result.add(new ArrayList(cd));
                //continue;
                
            }
            //System.out.println("2_>      "+row+":row   "+col+":col");
            solveIt(column,diag1,diag2,row+1);
            //System.out.println(rowNo);
            diag1[row+col]=0;  diag2[aa-1+row-col]=0;  column[col]=0;
            
            
        }
    
    }
    
}