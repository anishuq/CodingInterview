import java.util.Arrays;

class AnagramCheck {
    /**
     * Check to see if two words are anagrams or not.
     *
     * Examples:
     * Dormitory = Dirty room.
     * School master = The classroom.
     * Conversation = Voices rant on.
     *
     * If a character is used say twice in the subject,
     * it must also be used twice in the anagram.
     */
    String subject, anagram;

    AnagramCheck() {
        subject = "Dormitory".replaceAll("\\s","");
        anagram = "Dirty room".replaceAll("\\s","");;
    }

    public boolean isAnagram(){
        if(subject.length()!=anagram.length()) return false;
        else
        {
            char[] subChars = subject.toCharArray();
            char[] anagramChars = anagram.toCharArray();

            Arrays.sort(subChars);
            Arrays.sort(anagramChars);

            String subStr = new String(subChars);
            String anagramStr = new String(anagramChars);

            if(subStr.compareTo(anagramStr) == 0) return true;
            else return false;
        }
    }
}
