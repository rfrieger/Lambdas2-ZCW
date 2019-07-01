import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class PersonTest {
    Person person = new Person();
    List<Person> arrayList = new ArrayList<Person>();
    LocalDate localDate;



    @Before
    public void before() {
        arrayList.add(new Person("steve", LocalDate.of(2017, 3, 01), Person.Sex.MALE, "gaggg@aol.com"  ));
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

        printPer.printPersons(arrayList, predicate);

        Integer expeceted = 4;
        Integer actual =  printPer.printPersons(arrayList, predicate).size();

        Assert.assertEquals(expeceted,actual);


    }

    @Test
    public void printPersonsname() {
        Predicate<Person> predicate = person ->
                person.getName().equals("bob");

        PrintPerson printPer = new PrintPerson();

        printPer.printPersons(arrayList, predicate);

        Integer expeceted = 4;
        Integer actual =  printPer.printPersons(arrayList, predicate).size();

        Assert.assertEquals(expeceted,actual);


    }

    @Test
    public void printPersonsemail() {
        Predicate<Person> predicate = person ->
                person.getEmailAddress().equals("rfrieger@gmail.com");

        PrintPerson printPer = new PrintPerson();

        printPer.printPersons(arrayList, predicate);

        Integer expeceted = 4;
        Integer actual =  printPer.printPersons(arrayList, predicate).size();

        Assert.assertEquals(expeceted,actual);


    }


}