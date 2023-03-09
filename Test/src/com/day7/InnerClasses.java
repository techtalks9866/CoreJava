package com.day7;

public class InnerClasses {

    public static int i = 20;
    // variables

    //5 variable 2 methods - 1 unit
    //2 variable 1 metho - 1 unit
     class Java_Inner_class{

        //code
        void test(){
            System.out.println("Java_Inner_class test method");
        }
    }

     static class StaticNestedClass{
        //code
        void test(){
            System.out.println("Java_STATIC_Inner_class test method");
        }
    }


    void test(){
        int i = 1;


        class LocalInnerClass{
            void test(){
                System.out.println("Java_Inner_class test method");
            }
        }

        LocalInnerClass localInnerClass = new  LocalInnerClass();
//        localInnerClass.test();


    }

    public static void main(String[] args) {
       InnerClasses innerClasses = new InnerClasses();
        innerClasses.test();
    }
}
