//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/?source=submission-ac
//1662
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a1=String.join("",word1);
        String a2=String.join("",word2);
        return a1.equals(a2);
    }
}
