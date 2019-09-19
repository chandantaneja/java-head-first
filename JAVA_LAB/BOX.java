package JAVA_LAB;

/**
Created with <3 by:-
Chadnan Taneja
*/
class BOX {
    /**
     *Declaring The Variables
     */
    private double Width;
    private double Height;
    private double Depth;

    BOX(double width, double height, double depth){
        Width = width;
        Height = height;
        Depth = depth;
    }

    public double Volume() {
        return Width*Height*Depth;
    }
}

 class TestBox{
    public static void main(String[] args) {

        BOX box1 = new BOX(10,20,30);
        BOX box2 = new BOX(5,8,9);

        System.out.println("VOLUME 1 = " + box1.Volume());
        System.out.println("VOLUME 2 = " + box2.Volume());
    }
}
