package com.day7;

public class Usage {
    public static void main(String[] args) {
        //Upcasting
        Bank abcBank = new ABCBank();

        ABCBank obj = (ABCBank) abcBank;

        Bank def = new DEFBank();

        if(def instanceof  ABCBank){
            ABCBank obj1 = (ABCBank)def;
        }





















//        abcBank.printName();
        //down casting
        ABCBank abcBank1 = (ABCBank) abcBank;

        Bank defBank = new DEFBank();
//        defBank.printName();
//        100 banks
        if(abcBank instanceof  ABCBank){
            ABCBank abcBank2 = (ABCBank) abcBank;
            System.out.println("successfully coverted");
        } else {
            System.out.println("I am not ABCBank object");
        }




    }

     void printBankName(Bank abcBank){
        abcBank.printName();
     }








}
