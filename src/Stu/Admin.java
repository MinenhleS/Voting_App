package Stu;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Admin {

    public static void main(String[] args)  {

         Student student = new Student("Siya", "Ngwenya", "205285840");
        String checkStudent = student.studentNumber;

        String fileName = "/home/coder/IdeaProjects/Voting_App/src/Stu/data.txt";

        try (Stream<String> stream = Files.lines( Paths.get(fileName))) {
            //stream.forEach(System.out::println);
            boolean output = stream.anyMatch(s -> s.contains(checkStudent));
            //System.out.println(output);

            if(output== true){
                System.out.println("Allowed to vote");

            }
            else{
                System.out.println("Not allowed to vote");
            }

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

}
