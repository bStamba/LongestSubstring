import java.util.ArrayList;

public class Substring {

    //Given a string s, we want to find the longest substring without repeating characters.
    //The required output is the length of the substring, but we will add the substring as well.

    public int substringFinder(String s){
        ArrayList<String> aList = new ArrayList<>();
        String maxSubstring = "";
        int maxLength = 0;

        //If the list does not contain the character we are on, then we want to add it to the list,
        //increment our length counter, and modify our maxLength to be the current size of the list.
        for(int i = 0; i < s.length(); i++){
            if(!aList.contains(String.valueOf(s.charAt(i)))) {
                aList.add(String.valueOf(s.charAt(i)));
                if (maxLength < aList.size()) {
                    maxLength = aList.size();
                    maxSubstring = "";
                    for(int j = 0; j < aList.size(); j++){
                        maxSubstring = maxSubstring + aList.get(j);
                    }
                }
            }
            //If the list contains the value, then we want to check to see if the size of the list is bigger
            //than our current longest substring. If it is bigger, then set our longest substring equal to the
            //substring that is in our list. Then we need to clear our list and add the current element back to the list.
            else{
                aList.add(String.valueOf(s.charAt(i)));
                    while(!aList.get(0).equals(String.valueOf(s.charAt(i)))) {
                        aList.remove(0);
                    }
                    aList.remove(0);
            }
        }
        System.out.println("Our longest substring has a length of: " + maxLength);
        System.out.println("Our longest substring is: " + maxSubstring);
        System.out.println();
        return maxLength;
    }
}
