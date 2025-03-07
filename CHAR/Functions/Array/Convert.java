package CHAR.Functions.Array;

public class Convert {

        public String[] toStringArray(char[] charArray) {
        
        String[] result = new String[charArray.length];
        for(int i = 0; i < charArray.length; i++) {
            result[i] = Character.toString(charArray[i]);
        }

        return result;

    }
    
}
