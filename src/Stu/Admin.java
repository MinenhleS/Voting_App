package Stu;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Admin {

    public static void main(String[] args) {

         Student student = new Student("Siya", "Ngwenya", 215285840);

        Path path = Paths.get("data.txt");
        try (Stream<String> lines = Files.lines(path)) {
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
