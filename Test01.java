/**
Created with <3 by:-
Chadnan Taneja
*/
public  class Test01 {

    int x,y,z;

    public Test01(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = this.x + this.y;
    }
    public Test01(){
        x = 5;
        y = 6;
        z = x + y;
    }
}

class Display{
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Test01 test011 = new Test01(6,5);
        System.out.println(test01.x + " " + test01.y + " " + test01.z);
        System.out.println(test011.x + " " + test011.y + " " + test011.z);
    }
}