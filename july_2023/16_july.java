class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here
           Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            int x=q.remove();
            s.push(x);
        }
        while(!s.isEmpty()){
            int x= s.pop();
            q.add(x);
        }
        return q;
    }
}
