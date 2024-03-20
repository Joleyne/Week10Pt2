import java.util.ArrayList;
import java.util.Iterator;

public class Classroom implements Iterable<Student>{
    private ArrayList<Student>myList = new ArrayList<>();

    public Classroom() {
    }
    public void addStudent(Student a){
        myList.add(a);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "myList=" + myList +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
        return myList.listIterator();
    }
}
