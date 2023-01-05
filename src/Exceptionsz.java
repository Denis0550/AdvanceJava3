import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exceptionsz {

    public static String giveMeSomeValue(){
        String msg = null;
        return msg;
    }

    public static void main(String[] args){ //throws Exception {

        int x=0;
        //x  = 5 / 0;

        String str="hjgk"; // null; //giveMeSomeValue();
        System.out.println(str.length());

        //FileOutputStream fos = new FileOutputStream("myFILE.txt");
        //(IOException | FileNotFoundException)
        //===============================================


/*
        try {
             x = 5 / 0;
        } catch(Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Program Continues... x: " + x);
*/






/*
        try {
             x = 5/0;
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } catch(Exception e) {
            System.out.println("Exception is caught and handled!");
        }
        System.out.println("Program Continues... x: " + x);
*/





        int y=0;
        int[] arr;
        arr = new int[5];
        //System.out.println("Array value at index[9]: " + arr[9]);


/*
        try {
             y = arr[9];
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex(...)Exception caught!");
        } catch(Exception e) {
            System.out.println("Exception is caught and handled!");
        }
        System.out.println("Program Continues... y: " + y);
*/



    /*
        try {
             y = arr[9];
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex(...)Exception caught!");
        } catch(Exception e) {
            System.out.println("Exception is caught and handled!");
        }
        finally {//closing dbConn & InputIOfunctions
            y=1;
            System.out.println("FINALLY BLOCK changed value of y: " + y);
        }
        System.out.println("Program Continues... y: " + y);
*/





        /*int side1, side2, area=0;
        try {
            side1 = 9; side2 = 0;
            area = side1 * side2;
            if (area == 0) {
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e){
            System.out.println("A side cant be 0... " + e.getMessage());
        }
        System.out.println("Program Continues... Area: " + area);*/


//        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
//            System.out.println("A side cant be 0... " + e.getMessage());
//        }



        /*
        Carz carObj = new Carz();
        try {
            carObj.increaseSpeed();
        } catch (CarCrashedException e) {
            System.out.println("Exceptions message: " + e.getMessage());
        }*/


    }
}

class Carz {
     int speed=150;

    public void increaseSpeed() throws CarCrashedException {
        speed += 70;
        if (speed > 200) {
            throw new CarCrashedException(this);
        }
    }
}


class CarCrashedException extends Exception {
    public CarCrashedException(Carz carz) {
        super("Car was at " + carz.speed + "... has crashed!");
    }
}



