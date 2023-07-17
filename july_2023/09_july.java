class Solution
{
     //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
       HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
       
       for(int i=0;i<size;i++){
           if(arr[i]>0)
           mp.put(arr[i],arr[i]);
       }
       
       int minPos=1;
       while(true){
           if(!mp.containsKey(minPos))
           return minPos;
           else
           minPos++;
       }
        
    }
    
}
