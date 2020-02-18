//Extindeti capacitatile clasei de baza folosind mostenirea,
//astfel incat clasa Stack sa poata deduce timpul in minute
// a ultimei sesiuni de lucru cu stiva

class useTime{
    private int hour, minute, second;
    void setTime(){
        hour = (int) (((System.currentTimeMillis() / 1000) / 60) / 60) % 24 + 2;
        minute = (int) ((System.currentTimeMillis() / 1000) / 60) % 60;
        second = (int) (System.currentTimeMillis() / 1000) % 60;
    }
    void setTime(int h){
        hour = h;
        minute = (int) ((System.currentTimeMillis() / 1000) / 60) % 60;
        second = (int) (System.currentTimeMillis() / 1000) % 60;
    }
    void setTime(int h, int m){
        hour = h;
        minute = m;
        second = (int) (System.currentTimeMillis() / 1000) % 60;
    }
    void setTime(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }

    void getTime(){
        System.out.println(hour+":"+minute+":"+second);
    }
}

class Stack extends useTime {

    private void createStack(){
        /*
        codul pentru crearea stivei
         */
        setTime();
    }

    private void showStack(){
        /*
        codul pentru afisarea stivei
         */

        System.out.print("Obiectul a fost creat la: ");
        getTime();
    }

    public static void main(String[] args){
        Stack stiva = new Stack();
        Stack stiva1 = new Stack();
        Stack stiva2 = new Stack();
        Stack stiva3 = new Stack();

        stiva.createStack();
        stiva.showStack();

        stiva1.setTime(11);
        stiva1.showStack();

        stiva2.setTime(11, 22);
        stiva2.showStack();

        stiva3.setTime(10, 54, 9);
        stiva3.showStack();

    }
}
