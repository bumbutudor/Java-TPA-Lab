package lab4;

public class ComplexNumber {

    private double real;
    private double img;

    public ComplexNumber() {
        this.real = 0;
        this.img = 0;
    }

    // Metodele get si set
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    // Constructor
    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    // Adunarea a 2 nr complexe
    public ComplexNumber addComp(ComplexNumber num) {

        ComplexNumber num1 = new ComplexNumber(real + num.real, img + num.img);

        return num1;
    }

    // Scadarea a 2 nr complexe
    public ComplexNumber subtractComp(ComplexNumber num) {

        ComplexNumber num1 = new ComplexNumber(real - num.real, img - num.img);

        return num1;
    }

    // Inmultirea a 2 nr complexe
    public ComplexNumber multiplyComp(ComplexNumber num) {

        ComplexNumber num1 = new ComplexNumber(real*num.real-img*num.img,real*num.img+img*num.real);

        return num1;
    }

    // Compararea daca sunt egale
    boolean equals(ComplexNumber num) {

        ComplexNumber num1 = new ComplexNumber(real, img);
        if (num.real == num1.real && num.img == num1.img) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {

        if (img > 0) {
            return getReal() + " + " + Math.abs(getImg()) + "i";
        }
        if (img < 0) {
            return getReal() + " - " + Math.abs(getImg()) + "i";
        }
        if (real==0) {
            return getImg() + "i";
        }
        if (img==0) {
            return getReal() + "";
        }
        return null;
    }

}




