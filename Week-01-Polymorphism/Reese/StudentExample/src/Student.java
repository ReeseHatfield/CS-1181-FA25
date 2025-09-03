public abstract class Student extends Object implements Comparable<Student>{

    private double gpa;



    public Student(double curGPA){
        this.gpa = curGPA;
    }

    public double getGPA(){
        return this.gpa;
    }
    
    public abstract void goToClass();

    @Override
    public String toString(){
        return "" + this.gpa;
    }


    public int compareTo(Student other){
        // other
        // this

        if(this.gpa > other.gpa) {
            return 1;
        }
        else if (this.gpa < other.gpa){
            return -1;
        }
        else {

            return 0;
        }

    }
}
