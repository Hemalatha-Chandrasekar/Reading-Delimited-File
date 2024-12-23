import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {
    public static void main(String[] args) {
        try {
            // Update file path as needed
            String location = "/Users/hema/Downloads/CourseData.csv";
            File file = new File(location);
            Scanner input = new Scanner(file);
            ArrayList<course> data = new ArrayList<>();

            // Read file line-by-line and split by delimiter
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] splitedLine = line.split(",");
                course cObj = new course();
                cObj.setCode(splitedLine[0]);
                cObj.setCourse_name(splitedLine[1]);
                cObj.setInstructor_name(splitedLine[2]);
                data.add(cObj);
            }

            // Display data
            for (course c : data) {
                System.out.println(c.getCode() + " | " + c.getCourse_name() + " | " + c.getInstructor_name());
                System.out.println("===============================");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        }
    }
}
