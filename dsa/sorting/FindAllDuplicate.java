//442
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
      
     
       
         int i = 0;
        while (i < arr.length) {
           
                int correct = arr[i]-1;
                if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } 
            
       else i++;
            

        }
         List<Integer> v = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
               v.add(arr[index]);
            }
        }

        

        return v;
    }

   public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
} 
