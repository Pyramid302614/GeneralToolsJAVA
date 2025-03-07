package TXT.Functions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Convert {

    public String[] toStringArray(String fileLocation) throws IOException {

        FileReader fileReader = new FileReader(fileLocation);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;

        while((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }

        bufferedReader.close();
        return lines.toArray(new String[lines.size()]);

    }

}
