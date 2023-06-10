# GFG POTD <br>

## 10_JUNE 2023 <br>
### Ques. Arranging the array
[Problem_Link](https://practice.geeksforgeeks.org/problems/arranging-the-array1131/1) <br>
### Approach <br>
The provided code follows a simple approach using two ArrayLists. It first traverses the input array and separates the<B> negative </B>numbers and <B>non-negative</B> numbers into two separate <B>ArrayLists</B>. Then, it populates the original array with the negative numbers followed by the non-negative numbers, maintaining the original order within each category.

#### Time Complexity:<br>
<B>O(n)</B> since we traverse the<B>n</B>sized array twice in the code.<br>
#### Space Complexity:<br>
<B>O(n)</B> since we only store a total of <B>n</B>numbers in the <B>p</B> and <B>ne</B> ArrayLists.

## Code (JAVA)<br>

    class Solution {
    public void Rearrange(int a[], int n)
    {
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

