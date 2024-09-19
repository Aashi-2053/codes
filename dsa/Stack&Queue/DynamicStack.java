package com.dsa.stack;

public class DynamicStack extends Custom_stack{
    public DynamicStack(){
        super();//call CustomStack()
    }
    public DynamicStack(int n){
        super();// call CustomStack(int n)
    }

    @Override
    public boolean push(int item) {
       if(this.isFull()){
           //double size
           int[] temp=new int[data.length*2];
           //copy all in new
           for (int i=0;i< data.length;i++){
               temp[i]=data[i];
           }
           data=temp;
       }
       return super.push(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack st=new DynamicStack(5);
        st.push(4);
        st.push(2);
        st.push(9);
        st.push(1);
        st.push(7);
        st.push(2);
        System.out.println(st.pop());
    }
}
