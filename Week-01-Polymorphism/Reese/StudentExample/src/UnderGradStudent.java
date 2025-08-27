public class UnderGradStudent extends Student{

    public UnderGradStudent(double curGPA){
        super(curGPA);
    }


    @Override
    public void goToClass() {
        System.out.println("Attends CS-1181");
    }
    
}
