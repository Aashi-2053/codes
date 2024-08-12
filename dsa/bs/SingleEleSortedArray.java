//540
public int singleNonDuplicate(int[] a) {
        
        int n=a.length;
       if(n==1)return a[0];
       if(a[0]!=a[1])return a[0];
       if(a[n-1] !=a[n-2])return a[n-1];

       int s=1,e=a.length-2;
       while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(a[mid]!=a[mid-1] && a[mid]!=a[mid+1])
            {return a[mid];
           }
          if((mid%2==1&&a[mid]==a[mid-1])||(a[mid]==a[mid+1] && mid%2==0))s=mid+1;
           else e=mid-1;

        }
        return -1;
    }
}
