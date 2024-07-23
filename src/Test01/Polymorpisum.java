package Test01;
class Java{
    void Oops(){
        System.out.println("oops has 4 concept in it.");
    }
}
class Inheritence extends Java{
    @Override
    void Oops(){
        System.out.println("Inheritance: Inheriting one from another class.");
    }
}
class Abstarction extends Java{
    @Override
    void Oops() {
       System.out.println("Abstaction: Blue print.");
    }
}
class Encapsulation extends Java{

    void Oops(){
        System.out.println("Encapsulation: Attribute cannot access directly we need to use manipulate the data. ");
    }
}
class Interface extends Java{
    void Oops(){
        System.out.println("Interface: Intrface consist of abstarct methods.");
    }
}
public class Polymorpisum {
public static void main(String[]args){
    Inheritence i = new Inheritence();
    Abstarction a = new Abstarction();
    Encapsulation e = new Encapsulation();
    Interface I = new Interface();
    i.Oops();
    a.Oops();
    e.Oops();
    I.Oops();
}
}
