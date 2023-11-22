 class hierarchical2{
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Child1 child1Obj = new Child1();
        Child2 child2Obj = new Child2();
        Child3 child3Obj = new Child3();

 
        parentObj.parentMethod();
        child1Obj.parentMethod();
        child1Obj.child1Method();
        child2Obj.parentMethod();
        child2Obj.child2Method();
        child3Obj.parentMethod();
        child3Obj.child3Method();
    }
}
class Parent {
    void parentMethod() {
        System.out.println("This is a method from the Parent class.");
    }
}

class Child1 extends Parent {
    void child1Method() {
        System.out.println("This is a method from Child1 class.");
    }
}
class Child2 extends Parent {
    void child2Method() {
        System.out.println("This is a method from Child2 class.");
    }
}


class Child3 extends Parent {
    void child3Method() {
        System.out.println("This is a method from Child3 class.");
    }
}

