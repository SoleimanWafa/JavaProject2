package JavaProject2;

public abstract class Task10 {


   



    abstract double getPercentage();
}




class A extends Task10{
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    double getPercentage() {
        return (subject1+subject2+subject3)/3.0;
    }
}

class B extends Task10{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        return (subject1+subject2+subject3+subject4)/4.0;
    }


    public static void main(String[] args) {
        A studentA= new A(85,95,80);
        System.out.println("Average grade for Student A "+studentA.getPercentage());

        B studentB= new B(76,81,84,86);
        System.out.println("Average grade for Student B "+studentB.getPercentage());

    }

}