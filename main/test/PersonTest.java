import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class PersonTest {
    Person person = new Person();
    List<Person> arrayList = new ArrayList<Person>();



    @Before
    public void before() {
        arrayList.add(new Person());
        arrayList.add(new Person());
        arrayList.add(new Person());
        arrayList.add(new Person());
        arrayList.add(new Person());

    }

    @Test
    public void getAge() {
        Integer actual = person.getAge();
        Integer expected = 31;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getName() {

        String actual = person.getName();
        String expected = "bob";

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void getGender() {

        Person.Sex actual = Person.Sex.MALE;
        Person.Sex expected = person.getGender();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getEmailAddress() {

        String actual = person.emailAddress;
        String expeceted = "rfrieger@gmail.com";

        Assert.assertEquals(expeceted,actual);

    }


    @Test
    public void printPersonsage() {
        Predicate<Person> predicate = person ->
            person.getAge() > 21;

        PrintPerson printPer = new PrintPerson();
        CheckPerson tester = printPer.new Tester(predicate);

        printPer.printPersons(arrayList, tester);

        Integer expeceted = 5;
        Integer actual =  printPer.printPersons(arrayList, tester).size();

        Assert.assertEquals(expeceted,actual);


    }

    @Test
    public void printPersonsname() {
        Predicate<Person> predicate = person ->
                person.getName().equals("bob");

        PrintPerson printPer = new PrintPerson();
        CheckPerson tester = printPer.new Tester(predicate);

        printPer.printPersons(arrayList, tester);

        Integer expeceted = 5;
        Integer actual =  printPer.printPersons(arrayList, tester).size();

        Assert.assertEquals(expeceted,actual);


    }


}