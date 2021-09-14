package nestedclasspractice;




class Father{
    int propertyvalue;
    Father (int propertyvalue){
        this.propertyvalue =  propertyvalue;
    }

int getpropertyvalue(){
     return this.getpropertyvalue();
    }
  
}
class child1 extends Father{
    int child1property;
    child1(int propertyvalue , int child1property){
super(propertyvalue);
this.child1property = child1property;
    }
int getchild1propertyvalue(){
    return this.getchild1propertyvalue();
}
int gettotalchild1property(){
    return this.getpropertyvalue()/2 + this.getchild1propertyvalue();
}

    }
    class child2 extends Father{
        int child2property;
        child2(int propertyvalue, int child2property){
            super(propertyvalue);
            this.child2property=child2property;
        }
        int getchild2propertyvalue(){
            return this.getchild2propertyvalue();
        }
        int gettotalchild2propertyvalue(){
            return this.getpropertyvalue()/2 + this.getchild2propertyvalue();
        }
    }

    class child3 extends Father{
        int child3property;
        child3(int propertyvalue, int child3property){
        super(propertyvalue);
        this.child3property= child3property;

    }
    int getchild3propertyvalue(){
        return this.getchild3propertyvalue();
    }
    int gettotalchild3propertyvalue(){
        return this.getpropertyvalue()/2+ getchild3propertyvalue();
    }


public class Hie2{
    public static void main(String[]args){
        Father obj1 = new Father(100);
        obj1.getpropertyvalue();
        child1 obj2 = new child1(100, 50);
        obj2.getchild1propertyvalue();
        obj2.gettotalchild1property();
        child2 obj3 = new child2 (100, 20);
        obj3.getchild2propertyvalue();
        obj3.gettotalchild2propertyvalue();
        child3 obj4 = new child3 (100, 10);
        obj4.getchild3propertyvalue();
        obj4.gettotalchild3propertyvalue();
       
        

      



    }
}
}


