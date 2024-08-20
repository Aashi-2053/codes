//
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int id1=0,id2=0;
        if(name.length()>typed.length())return false;
       while(id1<name.length() && id2<typed.length())
       {
        if(name.charAt(id1)==typed.charAt(id2))
        {
            id1++;
            id2++;
            continue;
        }
        else if(id1>0 && name.charAt(id1-1)==typed.charAt(id2))
        {
            id2++;
          
        }
        else{
            return false;
        }
       }
      
       while(id2<typed.length())
       {
        if(name.charAt(name.length()-1)!=typed.charAt(id2))
        return false;
         id2++;
       }
        if(id1<name.length())
         return false;
       return true;
    }
}
