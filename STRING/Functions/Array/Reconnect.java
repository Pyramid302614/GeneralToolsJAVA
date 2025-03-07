package STRING.Functions.Array;

public class Reconnect {

    public String reconnect(String[] stringArray,String splitter) {
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < stringArray.length; i++) {
            result.append(stringArray[i]);
            if(i != stringArray.length-1) {
                result.append(splitter);
            }
        }
        return result.toString();

    }

}
