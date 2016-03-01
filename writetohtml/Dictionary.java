package writetohtml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    public List<String> loadDict(String fileName) throws FileNotFoundException, IOException{
        List<String> dict = new ArrayList<>();
            File fileDict = new File(fileName);
        try (BufferedReader inDict = new BufferedReader(new FileReader(fileDict))) {
            String s;
            while((s = inDict.readLine()) != null){
                dict.add(s);
            }
        }
        return dict;
    }
}
