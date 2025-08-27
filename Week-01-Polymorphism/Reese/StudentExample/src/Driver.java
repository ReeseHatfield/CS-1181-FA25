import java.util.*;

public class Driver {

    public static void main(String[] args) {


        // compile time   =  thing it actually is
        Student s1 = new GradStudent(3.3);
        Student s4 = new GradStudent(4.0);
        Student s2 = new GradStudent(3.1);
        Student s3 = new GradStudent(2.3);

        ArrayList<Student> allStudents = new ArrayList<>();
        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        allStudents.add(s4);

        Collections.sort(allStudents);

        System.out.println(allStudents);



        // s1.attendSeminar();

        // // type in list is a commuter
        // ArrayList<Commuter> allStudents = new ArrayList<>();

        // allStudents.add(new GradStudent(2.1));
        // allStudents.add(new Faculty());


        // allStudents.get(0).



        // allStudents.add(new UnderGradStudent(4.0));



        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);


        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }



}