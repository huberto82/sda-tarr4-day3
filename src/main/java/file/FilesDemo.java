package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilesDemo {
    public static void main(String[] args) {
        Path path = Paths.get("c:\\text.txt");
        Scanner scanner = new Scanner(System.in);
        List<String> lines;
        try {
            lines = Files.readAllLines(path);
            List<String> words = new ArrayList<>();
            for (String line: lines) {
                System.out.println(line);
                List<String> lineWords = Arrays.asList(line.split(" "));
                words.addAll(lineWords);
            }
            String line = scanner.nextLine();
            if (words.contains(line)){
                System.out.println("ZNALAZLEM");
            } else {
                System.out.println("BRAK");
            }
            //lines.add(line);
            //Files.write(path, lines);
            //System.out.println("Plik zapisano");
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać pliku");
        }
    }
}
