import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.function.Predicate;


public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    Person() {
        this.name = "bob";
        this.birthday = LocalDate.of(1987, 10, 03);
        this.gender = Sex.MALE;
        this.emailAddress = "rfrieger@gmail.com";
    }

    public Integer getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }



    public void print() {
        System.out.println( "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", " + getAge() +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}');
    }





}


