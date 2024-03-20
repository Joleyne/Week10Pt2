// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Student aNewStudent1 = new Student("Brett", 128887);
        Student aNewStudent2 = new Student("Miguel", 123456);
        Student aNewStudent3 = new Student("Joseph", 838451);
        Student aNewStudent4 = new Student("Andrew", 112340);
        Student aNewStudent5 = new Student("Amal", 101100);
        Student aNewStudent6 = new Student("Ayub", 999999);
        System.out.println(aNewStudent1);



        Classroom alc = new Classroom();
        alc.addStudent(aNewStudent1);
        alc.addStudent(aNewStudent2);
        alc.addStudent(aNewStudent3);
        alc.addStudent(aNewStudent4);


        Classroom halleck = new Classroom();
        halleck.addStudent(aNewStudent5);
        halleck.addStudent(aNewStudent6);
        
        for(Student a: alc){
            System.out.println(a);
        }
    }
}