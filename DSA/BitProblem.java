class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int all = 0;
        for(int a : nums){
            all = all ^ a;
        }
        int left=0;
        int ct = 1;
        while(ct<10000000){
            if((ct&all) ==ct){
                break;
            }
            ct=ct*2;
        }
        int tz = 0;
        int to = 0;
        for(int a : nums){
            if((a & ct) ==ct){
                to = to ^ a;
            }
            else{
                tz = tz ^ a;
            }
        }
        if(to>tz){
            int temp = to;
            to = tz;
            tz = temp;
        }
        return new int[]{to,tz};
    }
}
