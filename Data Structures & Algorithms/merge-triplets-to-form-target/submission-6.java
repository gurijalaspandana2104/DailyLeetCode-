class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
      boolean f0 = false, f1 = false, f2 = false;
      
    for(int i=0;i< triplets.length;i++)
    {
        int[] t=triplets[i];
         boolean invalid=false;
    for(int j=0;j<t.length;j++)
    {
        
      if(target[j]<t[j])
      {
            invalid=true ;
            break;
             
      }  
    }
      if( invalid)
      {
      continue;
      }
     
     for(int j=0;j<t.length;j++ )
     { 
      if(t[j]==target[j])
      {
        if (j==0) f0=true;
        if (j==1) f1=true;
        if (j==2) f2=true;
      }
     }
    }
    return  f0&&f1&&f2; 
    }
     
    }
    


