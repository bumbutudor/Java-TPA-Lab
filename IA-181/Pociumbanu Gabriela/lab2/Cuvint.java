package lab2;

public class Cuvint {
    public  Cuvint() {
        cuv = null;
    }
    public  Cuvint(String cuv) {
        this.cuv =  cuv;
    }
    public  Cuvint(String cuv, int n) {
        this.cuv=  cuv.substring(0,n);
    }
    public void setCuvint() {
        cuv = null;
    }
    public void setCuvint(String cuv) {
        this.cuv=  cuv;
    }
    public void setCuvint(String cuv, int n) {
        this.cuv =  cuv.substring(0,n);
    }
    public String getCuvint() {
        return cuv;
    }
    public String toString() {
        String output = super.toString();
        output += "(cuv=\""+cuv+"\")";
        return output;
    }
    private String cuv;
}

