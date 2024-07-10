class Solution {
    public int minOperations(String[] logs) {
        int counter = 0;
       for(String i : logs){
       if(i.equals("../")) {
        if(counter <= 0)
        counter = 0;
        else
        counter--;
        }
       else if(i.equals("./")) continue;
       else
       counter++;
    }
    return counter;
}
}