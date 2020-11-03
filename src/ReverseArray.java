

public class ReverseArray {
    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        ReverseArray reverseArrayObj = new ReverseArray();
        reverseArrayObj.revArray(input);

        for(int i : input)
            System.out.println(i+",");

        AnagramCheck anagramCheckObj = new AnagramCheck();
        if(anagramCheckObj.isAnagram()) System.out.println("They are anagrams");
        else System.out.println("They are NOT anagrams");
    }

    /**
     * Reversing an array in-place
     */
    public int[] revArray(int[] input){
        int start = 0;
        int end = input.length - 1;

        while(start!=end){
            //simple swap
            int temp = input[end];
            input[end] = input[start];
            input[start] = temp;

            start++;
            end--;
        }
        return input;
    }


}
