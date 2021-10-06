class Parent {
    public void Parentmethod(){
        System.out.println("This is Parent Class");

    }
}

class Child extends Parent{
    public void Childmethod(){
        System.out.println("This is Child Class");
    }
}

class Object{
    public static void main(String[] args) {
        Parent pobj = new Parent();
        Child cobj = new Child();
        pobj.Parentmethod();
        cobj.Childmethod();
        cobj.Parentmethod();
    }
}
