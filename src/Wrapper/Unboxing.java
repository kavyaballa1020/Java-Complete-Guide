package Wrapper;

public class Unboxing {

    public static void main(String[] args) {
        // Wrapper class objects
        Integer in = 20;
        Character cha = 'k';
        Double doValue = 19.8;
        Byte by = 20;
        Long lo = 123341L;
        Float fl = 1.4F;
        Boolean bo = true;
        Short sh = 12;

        // Unboxing: wrapper class to primitive
        int i = in;
        char ch = cha;
        double d = doValue;
        byte b = by;
        long l = lo;
        float f = fl;
        boolean isTrue = bo;
        short s = sh;

        // Printing the unboxed primitive values
        System.out.println("int value: " + i);
        System.out.println("char value: " + ch);
        System.out.println("double value: " + d);
        System.out.println("byte value: " + b);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("boolean value: " + isTrue);
        System.out.println("short value: " + s);
    }

}
