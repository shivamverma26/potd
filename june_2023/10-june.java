// Driver Code 
class Solution {
    
    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        ArrayList<Integer> p=new ArrayList<Integer>(n);
        ArrayList<Integer> ne=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++){
          if(a[i]<0)
          ne.add(a[i]);
          
          else 
          p.add(a[i]);
        }
        for(int i=0;i<ne.size();i++)
        a[i]=ne.get(i);
        
        for(int i=ne.size();i<n;i++)
        a[i]=p.get(i-ne.size());
        
        
    }
}
