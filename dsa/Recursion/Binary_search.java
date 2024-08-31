

public class Binary_Search {
   
    public static void main(String[] args) {
        int[] a={1,5,22,33,63,74,85};
        System.out.println(binary_recur(a,74,0,a.length-1));
    }
    static int binary_recur(int [] a,int target,int s,int e)
    {
            if(s>e) return -1;
            int mid=(s+e)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]>target) return binary_recur(a,target,s,mid-1);
        return binary_recur(a,target,mid+1,e);

    }
}
