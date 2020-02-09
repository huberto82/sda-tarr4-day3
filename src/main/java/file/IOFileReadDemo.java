package file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileReadDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\text.txt");
        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        List<String> lines = new ArrayList<>();
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
            lines.add(line);
        }
        reader.close();

        File outputFile = new File("C:\\temp\\copy.txt");
        outputFile.createNewFile();
        System.out.println(outputFile.canWrite());
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        PrintWriter printWriter = new PrintWriter(outputStreamWriter, true);
        for(String w: lines){
            printWriter.println(w);
        }
        printWriter.close();
    }
}
