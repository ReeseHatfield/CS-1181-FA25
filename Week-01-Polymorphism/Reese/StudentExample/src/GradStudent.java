public class GradStudent extends Student implements Commuter {
    

    public GradStudent(double curGPA){
        super(curGPA);
    }


    @Override
    public void goToClass() {
        System.out.println("Attends CS-7200");
    }


    public void attendSeminar(){
        System.out.println("attends graph theory seminar");
    }


    @Override
    public void driveToCampus() {
        System.out.println("vrooms");
    }


    @Override
    public void foo() {
        return;
    }

}
