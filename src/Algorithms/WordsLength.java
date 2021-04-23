package Algorithms;

public class WordsLength {
    public static void main(String[] args) {
        String string = "I am learning Java with Oleg";
        StringBuilder word = new StringBuilder();
        String small = "";
        String large= "";
        String[] words = new String[100];
        int length = 0;
        string = string + " "; //extra space after string to get the last word

            for(int i = 0; i < string.length(); i++){
            //Split the string into words
            if(string.charAt(i) != ' '){
                word.append(string.charAt(i));
            }   else {
                words[length] = word.toString(); //Add word to array words
                length++;//Increment length
                word = new StringBuilder();//Make word an empty string
                }
        }
        //Initialize small and large with first word in the string
        small = large = words[0];

        //Determine smallest and largest word in the string
        for(int k = 0; k < length; k++){

            //If length of small is greater than any word present in the string
            //Store value of word into small
            if(small.length() > words[k].length())
                small = words[k];

            //If length of large is less than any word present in the string
            //Store value of word into large
            if(large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Shortest word: " + small);
        System.out.println("Longest word: " + large);
    }
}