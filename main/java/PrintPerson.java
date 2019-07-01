import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrintPerson {

    public static ArrayList<String> printPersons(List<Person> roster, Predicate<Person> predicate) {
        ArrayList<String> arr = new ArrayList<>();

        class Tester implements CheckPerson{

            Predicate predicate;

            Tester(Predicate predicate){
                this.predicate = predicate;
            }

            @Override
            public boolean test(Person p) {
                return predicate.test(p);
            }

        }

        Tester tester = new Tester(predicate);

        roster.forEach(p -> {if(tester.test(p)) {arr.add(p.toString()); p.print();}} );
        return arr;
    }


}
