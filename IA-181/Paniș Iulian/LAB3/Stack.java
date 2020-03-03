class useTime{
    private int hour, minute, second;
    void setTime(){
        hour = (int) (((System.currentTimeMillis() / 1000) / 60) / 60) % 24;
        minute = (int) ((System.currentTimeMillis() / 1000) / 60) % 60;
        second = (int) (System.currentTimeMillis() / 1000) % 60;
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

        stiva.createStack();
        stiva.showStack();

    }
}
