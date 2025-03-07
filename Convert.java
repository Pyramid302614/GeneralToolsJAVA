
// status: untested

public class Convert {

    /**
     * Will only take the first character of each item.
     <br>
     * Ex:
     * stringArray = { "I", "am", "him" }
     <br>
     * output: { 'I', 'a', 'h' }
     */
    public char[] toCharArray(String[] stringArray) {
        
        char[] result = new char[stringArray.length];
        for(int i = 0; i < stringArray.length; i++) {
            result[i] = stringArray[i].charAt(0);
        }

        return result;
        
    }

}