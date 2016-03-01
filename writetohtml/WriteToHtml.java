
package writetohtml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WriteToHtml {
        
    public static void main(String[] args) throws IOException, FileNotFoundException {
        
        Dictionary dict = new Dictionary();
        List<String> dictionary = dict.loadDict("src\\writetohtml\\file_dictionary.txt");
        
        File fileHtml = new File("src\\writetohtml\\test.html");
        File fileWithText = new File("src\\writetohtml\\file_with_text.txt");
        
        try (BufferedReader inText = new BufferedReader(new FileReader(fileWithText))){
            String readText;
            String correct;
            while((readText = inText.readLine()) != null){
                correct = readText;
                for(int n = 0; n < dictionary.size(); n++){
                    Pattern dictSelect = Pattern.compile("[^а-я]"+dictionary.get(n)+"[^а-я]");
                    Matcher textSelect = dictSelect.matcher(correct);
                    if(true==textSelect.find()){
                    correct = correct.replaceAll(dictionary.get(n), ("<b><i>"+ dictionary.get(n) + "</i></b>"));
                    }
                }
                System.out.println(correct);
                try (FileWriter outHtml = new FileWriter(fileHtml,true)) {
                    outHtml.write(correct);
                }
            }
        }
    }
}
