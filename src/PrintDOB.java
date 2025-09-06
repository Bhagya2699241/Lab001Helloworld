import java.time.LocalDate;
import java.time.Period;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PrintDOB {

    public static void main(String[] args) {
        String birthdate = "1999-06-02";
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
        LocalDate birthday = LocalDate.parse(birthdate);
        int age = Period.between(birthday,LocalDate.now()).getYears();
        System.out.println(" Bhagya's age is: " + age);
        //System.out.println(" Bhagya's Bdate is: " + birthdate);
        //System.out.println(" Bhagya's Bday is: " + birthday);
        //System.out.println(LocalDate.now());

    }
}
