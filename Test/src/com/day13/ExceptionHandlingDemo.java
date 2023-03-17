package com.day13;

public class ExceptionHandlingDemo {

//    The error implies a problem that mostly arises due to the shortage of system resources.
//    OutOfMemoryError, LinkageError, AssertionError
//    On the other hand, the exceptions occur during runtime and compile time.
//        statement 1;
//        statement 2;
//        statement 3;
//        statement 4;
//        statement 5;//exception occurs
//        statement 6;
//        statement 7;
//        statement 8;
//        statement 9;
//        statement 10;
    public static void main(String[] args) {
        String s = null;
//        System.out.println(s.toString());
        System.out.println("I am after exception");
        new ExceptionHandlingDemo().test(s);

    }

    void test(String s){

        try{
            System.out.println(s.toString());
        } catch (NullPointerException e){
            System.out.println("I am from NullPointerException block"+e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Throwable e){

        } finally {
            System.out.println("I am finally block");
        }


        System.out.println("I am after exception");
        System.out.println("I am after exception1");
        System.out.println("I am after exception2");
        System.out.println("I am after exception3");

    }
}
