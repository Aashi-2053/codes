package com.dsa.Heap;
import java.util.*;

class Heap1<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap1(){
        list=new ArrayList<>();
    }

    private void swap(int f,int s){
        T temp=list.get(f);
        list.set(f,list.get(s));
        list.set(s,temp);
    }
    private  int parent(int idx)
    {
        return (idx-1)/2;
    }
    private  int left(int idx)
    {
        return (idx*2+1);
    }
    private  int right(int idx)
    {
        return (idx*2+2);
    }

    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);
    }

    private void upheap(int idx){
        if(idx==0)return;

        int p=parent(idx);
        if(list.get(idx).compareTo(list.get(p))<0){
            swap(idx,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("Empty heap");
        }
        T temp=list.get(0);
        T last=list.remove((list.size())-1);
        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int idx){
        int min=idx;
        int left=left(idx);
        int right=right(idx);
        if(left<list.size() && list.get(min).compareTo(list.get(left))>0)
        {
            min=left;
        }
        if(right<list.size() && list.get(min).compareTo(list.get(right))>0)
        {
            min=right;
        }
        if(min!=idx){
            swap(min,idx);
            downheap(min);
        }
    }

    public ArrayList<T> heapsort() throws Exception{
        ArrayList<T> data=new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
class Main{
    public static void main(String[] args) throws Exception{
        Heap1<Integer> hp=new Heap1<>();
        hp.insert(34);
        hp.insert(45);
        hp.insert(22);
        hp.insert(89);
        hp.insert(76);
       // System.out.println(hp.remove());//min
        ArrayList list=hp.heapsort();
        System.out.println(list);

    }
}
