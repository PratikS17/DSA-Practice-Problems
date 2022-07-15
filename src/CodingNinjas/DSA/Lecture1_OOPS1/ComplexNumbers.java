package codingNinjas.DSA.Lecture1_OOPS1;

public class ComplexNumbers {
    private int real;
    private int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers c){
        this.real = this.real + c.real;
        this.imaginary = this.imaginary + c.imaginary;
    }

    public void multiply(ComplexNumbers c){
        int newReal = (this.real * c.real) - (this.imaginary * c.imaginary);
        this.imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        this.real = newReal;
    }

    public void print(){
        System.out.println(this.real + " + i"+ this.imaginary);
    }
}
