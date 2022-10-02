package pl.edu.wszib.app.mypacket;

import pl.edu.wszib.app.MyClass;
import pl.edu.wszib.app.MyInterface;
import pl.edu.wszib.app.MyInterface2;

public class MyClass2 extends MyClass implements MyInterface, MyInterface2 {

//    public MyClass myClass;

    public void run(){
//        myClass.run4();
        field3 = "Field3 from extended";
        run3();
    }

    public void run2() {

    }
}