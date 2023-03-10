package com.day10;

public class Usage {
    public static void main(String[] args) {

//        Company company = new Company("123","123","123");
        ObjectChaining4 objectChaining4 = new ObjectChaining4();
        objectChaining4.setObjectChaining4Data("I am object 4");

        ObjectChaining3 objectChaining3 = new ObjectChaining3();
        objectChaining3.setObjectChaining3Data("I am object 3");

//        ObjectChaining2 objectChaining2 = new ObjectChaining2();
//        objectChaining2.setObject2Data("I am object 2");
//        objectChaining2.setObj4(objectChaining4);


        ObjectChaining1 objectChaining1 = new ObjectChaining1();
        objectChaining1.setName("I am object1");
//        objectChaining1.setObj2(objectChaining2);
        objectChaining1.setObj3(objectChaining3);

        Usage usage = new Usage();
        usage.inserData4(objectChaining1, "I am object 4");

    }

    void test(ObjectChaining1 obj){
        System.out.println(obj.getObj2().getObj4().getObjectChaining4Data());
    }

    void inserData4(ObjectChaining1 obj, String val){
        ///

//        obj.getObj2().getObj4().setObjectChaining4Data("ghg");


        ObjectChaining2 objectChaining2 =  obj.getObj2();
        if (objectChaining2 != null) {
            ObjectChaining4 objectChaining4 =  objectChaining2.getObj4();
            if(objectChaining4 != null){
                objectChaining4.setObjectChaining4Data(val);
            }  else {
                System.out.println("Object 4 is null");
            }
        } else {
            System.out.println("object 2 null");
            new Exception("Object 2 is null");
        }
    }
}
