package zzbi.tJson;

import java.util.ArrayList;

public class Read {

    public String getProperty(String[] tJsonData, String propertyLocation) {

        String result = "Property Not Found.";

        String[] allIdenticals = zzbi.tJson.PathFinder.getAll(tJsonData,propertyLocation);

        for(int i = 0; i < allIdenticals.length; i++) {
            if(zzbi.tJson.PropertyPath.makePath(tJsonData,allIdenticals[i]).equals(propertyLocation)) {
                result = zzbi.tJson.PathFinder.getValueOfElement(tJsonData[allIdenticals[i]]);
                break;
            }
        }
    
        return result;

    }

    public String[] getAllPropertyValues(String[] tJsonData) {  

        ArrayList<String> results = ArrayList<>();

        for(int i = 0; i < tJsonData.length; i++) {

            results.add(zzbi.tJson.PathFinder.getNameOfElement(tJsonData[i]) + ": " + zzbi.tJson.PathFinder.getValueOfElement(tJsonData[i]));

        }
        
        String[] stringArrayResults = new String[results.toArray().length];
        for(int f = 0; f < results.toArray().length; f++) {

            stringArrayResults[f] = results.get(f);

        }

        return stringArrayResults;

    }
    

    /*private int getIndexOfParent(String[] tJsonData, String tJsonLine) {

        int result = -1;

        for(int i = new ANY.Functions.Array.IndexOf().indexOf(tJsonData,tJsonLine); i >= 0; i--) {

            if(getPrefix(tJsonLine).length() > getPrefix(tJsonData[i]).length()) {

                result = i;
                break;

            }

        }

        return result;

    }*/
}
