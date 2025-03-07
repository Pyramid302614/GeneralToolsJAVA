package zzbi.tJson;

public class PropertyPath {

    public makePath(String[] tJsonData, int indexOfProperty) {

        //your going to need to import this
        ArrayList<String> arrayResult = new ArrayList<>();
        arrayResult.add(zzbi.tJson.PathFinder.getNameOfElement(tJsonData[i]));

        previousPrefix = getPrefix(tJsonData[indexOfProperty])

        for(int i = indexOfProperty; i >= 0; i--) {
            
            if(zzbi.tJson.Read.getPrefix(tJsonData[indexOfProperty]).length() < previousPrefix.length()) {

                arrayResult.add(zzbi.tJson.PathFinder.getNameOfElement(tJsonData[i]));

            }

        }


        StringBuilder result = new StringBuilder();
        for(int i = 0; i < arrayResult.length; i++) {

            result.append(arrayResult[arrayResult.length-i]);
            result.append((i==arrayResult.length-1)?"":"/");

        }

        return result.toString();


    }

    private String getPrefix(String tJsonLine) {

        StringBuilder prefix = new StringBuilder();

        for(int i = 0; i < tJsonLine.length(); i++) {

            if(tJsonLine.charAt(i) == '[') {

                //prefix.append("["); changed in GeneralToolsJAVA V

            } else if(tJsonLine.charAt(i) == '.') {

                prefix.append(".");

            } else {

                break;

            }

        }

        return prefix.toString();

    }

}