public interface InterfaceP{
    String p="pppp";
    String methodP();

}
interface InterfaceQ extends InterfaceP{
    String q="qqqq";
    String methodQ();
}
class InterfaceR implements InterfaceP,InterfaceQ{
    public String methodP(){
        return p+q;

    }
    public String methodQ(){
        return p+q;
    }
}