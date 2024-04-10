class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] result = new int[deck.length];
        Arrays.fill(result,0);
        int i=0,j=0;
        boolean skip = false;
        while(i<deck.length){
            if(result[j] == 0){
                if(skip == false){
                result[j] = deck[i];
                i++;
            }
            skip = !skip;}
            j=(j+1)%(deck.length);
        }
        return result;
    }
}