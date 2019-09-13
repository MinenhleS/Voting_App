package Stu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Runner {

    public static void main(String[] args)  {

        Student student = new Student("minenhle", "Ngwenya", "215285840");

        String fileName = "/home/coder/IdeaProjects/Voting_App/src/Stu/data.txt";
        boolean output = false;
        try (Stream<String> stream = Files.lines( Paths.get(fileName))) {
            //stream.forEach(System.out::println);
            String checkStudent = student.getStudentNumber();
            output = stream.anyMatch(s -> s.contains(checkStudent));
            System.out.println(output);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

}













//    Admin admin = new Admin();
//    Student student = new Student(admin);
//    StudentExtractor studentExtractor = new StudentExtractor();
//
//    Scanner input = new Scanner(System.in);
//        System.out.println("Enter Student Details: ");
//                String command= input.nextLine();
//
//                String[] stuDetail = command.trim().split("\\s");