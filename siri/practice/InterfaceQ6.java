public interface InterfaceQ6 {

    void methodOneInterfaceQ6();
    void methodTwoInterfaceQ6();

}

public interface InterfaceQ6One {
    
    void methodOneInterfaceQ6One();
    void methodTwoInterfaceQ6One();
}

public interface InterfaceQ6Two {
    
    void methodOneInterfaceQ6Two();
    void methodTwoInterfaceQ6Two();
    
}

public interface InterfaceQ6New extends InterfaceQ6,InterfaceQ6One,InterfaceQ6Two {
    
    void methodInterfaceQ6New();
    
}

class ConcreateClass {
	private int i = 0;
	public void concclass() {}
}

class RequiredClass extends ConcreateClass implements InterfaceQ6New  {
	
    public void methodOneInterfaceQ6(){

    }
    public void methodTwoInterfaceQ6(){

    }
    public void methodOneInterfaceQ6One(){

    }
    public void methodTwoInterfaceQ6One(){

    }
    public void methodOneInterfaceQ6Two(){

    }
    public void methodTwoInterfaceQ6Two(){

    }
    public void methodInterfaceQ6New(){
        
    }
}