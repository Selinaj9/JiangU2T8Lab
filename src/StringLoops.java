public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP
      */
    public int countCharacters(String character, String searchString) {
        /* to be implemented */
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            String letter = searchString.substring(i,i + 1);
            if (letter.equalsIgnoreCase(character)) {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* to be implemented */
        String string = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            string += origString.substring(i,i + 1);
        }
        return string;
    }

    /* Returns a String with all instances of "searchChar" in "origString" replaced with
     "replaceChar"; matches should be case sensitive (i.e. no need to worry about
      lowercase vs. uppercase)

     - if searchChar = "a", origString = "canned beans and bananas", replaceChar = "*"
       this method returns "c*nned be*ns *nd b*n*n*s" (A not a match because of case)
     - if searchChar = "t", origString = "Ratatattat", replaceChar = "p"
       this method returns "Rapapappap"
     - if searchChar = "!", origString = "Nice! Day today!", replaceChar = "?"
       this method returns "Nice? Day today?"
     - if searchChar = "i", origString = "it’s the brain drain pain train",
       replaceChar = "I", this method returns "It’s the braIn draIn paIn traIn"
     - if searchChar = "i", origString = "it’s the brain drain pain train",
       replaceChar = " ", this method returns " t’s the bra n dra n pa n tra n"
     - if searchChar = "A", origString = "ABABABABABC", replaceChar = "D"
       this method returns "DBDBDBDBDBC"
     - if searchChar = "a", origString = "ABABABABABC", replaceChar = "D"
       this method returns "ABABABABABC" (no matches because of case)


      PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
        /* to be implemented */
        /* USE A FOR LOOP (you will write a second solution with a while loop next) */
        String ans = "";
        for (int i = 0; i < origStr.length(); i++) {
            String c = origStr.substring(i,i + 1);
            if (c.equals(searchChar)) {
                ans += replaceChar;
            } else {
                ans += c;
            }
        }
        return ans;
    }

    /* DOES THE EXACT SAME THING AS replaceCharacterV1, except using a while loop

      PRECONDITION: searchChar and replaceChar are single characters and are not equal
    */
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
        /* to be implemented */
        /* USE A WHILE LOOP and implement it similarly to this removeA example */
        String ans = origStr;
        int idx = ans.indexOf(searchChar);
        while (idx != -1) {
            ans = ans.substring(0,idx) + replaceChar + ans.substring(idx + 1);
            idx = ans.indexOf(searchChar);
        }
        return ans;
    }

    /* Returns the number of times "searchString" appears in "origString";
     matches should be case sensitive (i.e. no need to worry about lower vs. uppercase)

     Examples:
     - if searchString = "an" and origString = "canned beans and bananas",
       this method returns 5: canned beans and bananas
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns 3: Ratatattat (note the overlap!)
     - if searchString = "lower" and origString = "sunflower",
       this method returns 1: sunflower
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns 3: Hahahahaha (note the overlap!)
     - if searchString = "rain" and origString = "rain drain pain train",
       this method returns 3: rain drain pain train
     - if searchString = "was" and origString = "I was about to call you",
       this method returns 1: I was about to call you
     - if searchString = "but" and origString = "I was about to call you",
       this method returns 0: I was about to call you
     - searchString = "i", origString = "iiiit's supercalifragilisticexpialidociousi",
       this method returns 12: iiiit's supercalifragilisticexpialidociousi
    */
    public int countString(String searchString, String origString) {
        /* to be implemented */
        int ans = 0;
        int idx = origString.indexOf(searchString);
        while (idx != -1) {
            origString = origString.substring(idx + 1);
            idx = origString.indexOf(searchString);
            ans ++;
        }
        return ans;
    }

    /* Returns a String with all instances of "searchString" removed from "origString";
       matches should be case sensitive (i.e. no need to worry about lowercase vs. uppercase)

     - if searchString = "an" and origString = "canned beans and bananas",
       this method returns "cned bes d bas"
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns "Raat"
     - if searchString = "lower" and origString = "sunflower",
       this method returns "sunf"
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns "Hahahahaha" (no matches due to case)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns "it’s the b d pain t"
     - if searchString = "lol" and origString = "lolololol",
       this method returns "ool"
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns "I  about to call you, n’t I?"
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns "I was about to call you, wasn’t I?" (no matches)
     - if searchString = "AB" and origString = "ABABABABABC",
       this method returns "C"
     - if searchString = "AB" and origString = "AAAAABBBBBC",
       this method returns "C"
    */
    public String removeString(String searchString, String origString) {
        /* to be implemented */
        return origString.replace(searchString,"");
    }

    /* Prints all integers from fromNum through toNum, separated by
     a commas and a space, on a single line;
     there should NOT be a comma after the final number.
     If fromNum == toNum, print just the number and no comma.
     If fromNum > toNum, the numbers should be printed in descending order.
     After all numbers are printed, move the cursor to the next line.

     Examples:
     - if fromNum = 0 and toNum = 5, this method should print: 0, 1, 2, 3, 4, 5
     - if fromNum = -3 and toNum = 2, this method should print: -3, -2, -1, 0, 2
     - if fromNum = 8 and toNum = 1, this method should print: 8, 7, 6, 5, 4, 3, 2, 1
     - if fromNum = 4 and toNum = 4, this method should print: 4
     - if fromNum = 0 and toNum = 0, this method should print: 0
    */
    public void commaSeparated(int fromNum, int toNum) {
        /* to be implemented */
        for (int i = fromNum; i < toNum; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(toNum);
    }
}