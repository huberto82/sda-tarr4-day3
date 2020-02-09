package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ToUpperCaseApp {
    public static void main(String[] args) {
        //Napisz program, który dla pliku o nazwie wczytanej z klawiatury
        //zapisze jego zawartość wielkimi literami
        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get(scanner.nextLine());
        List<String> lines;
        try {
            lines = Files.readAllLines(path);
            List<String> result = new ArrayList<>();
            for (String line: lines){
                result.add(line.toUpperCase());
            }
            Files.write(path, result);
            System.out.println("Plik zapisano");
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać pliku. Błędna nazwa lub brak pliku!!!");
        }
    }
}
