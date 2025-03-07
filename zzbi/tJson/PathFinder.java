package zzbi.tJson;

public class PathFinder {

    /**
     * Returns an array of indexes to all properties with the name specified.
     */
    public getAll(String[] tJsonData, String targetPropertyName) {

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < tJsonData.length; i++) {

            String propertyName = getNameOfElement(tJsonData[i]);

            if(propertyName.equals(targetPropertyName)) {

                result.append(i + ".");

            }

        }

        return result.setCharAt(result.toString().length()-1,"").toString().split(".");

    }

    public getNameOfElement(String tJsonLine) {

        StringBuilder propertyName = new StringBuilder();
        for(int f = 0; f < tJsonData[i].length(); i++) {

            if(
                tJsonData[i].charAt(f) != '.' &&
                tJsonData[i].charAt(f) != '[' &&
                tJsonData[i].charAt(f) != ']' &&
                tJsonData[i].charAt(f) != ' '
            ) {

                if(tJsonData[i].charAt(f) == '(') {
                    break;
                } else {
                    propertyName.append(tJsonData[i].split("")[f]);
                }

            }                

        }

        return propertyName.toString();

    }

    public getValueOfElement(String tJsonLine) {
        
        StringBuilder propertyName = new StringBuilder();
        boolean startAppending = false;
        for(int f = 0; f < tJsonData[i].length(); i++) {


            if(startAppending) {
                propertyName.append(tJsonLine.split("")[f]);
            }

            if(tJsonLine.charAt(f) == ')') {
                break;
            }

            if(tJsonLine.charAt(f) == '(') {
                startAppending = true;
            }
            
            }                

        }

        return propertyName.toString();

    }