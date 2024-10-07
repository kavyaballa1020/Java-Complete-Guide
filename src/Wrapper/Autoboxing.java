package Wrapper;

public class Autoboxing {

    public static void main(String[] args) {
        int i = 20;
        char ch = 'k';
        double d = 19.8;
        byte b = 20;
        long l = 123341;
        float f = 1.4F;
        boolean isTrue = true;
        short s = 12;

        // Autoboxing: primitive to wrapper class
        Integer in = i;
        Character cha = ch;
        Double doValue = d;
        Byte by = b;
        Long lo = l;
        Float fl = f;
        Boolean bo = isTrue;
        Short sh = s;

        // Printing the values of autoboxed wrapper objects
        System.out.println("Integer value: " + in);
        System.out.println("Character value: " + cha);
        System.out.println("Double value: " + doValue);
        System.out.println("Byte value: " + by);
        System.out.println("Long value: " + lo);
        System.out.println("Float value: " + fl);
        System.out.println("Boolean value: " + bo);
        System.out.println("Short value: " + sh);
    }

}
