class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String i : operations){
            x+=(44-i.charAt(1));
        }
        return x;
    }
}