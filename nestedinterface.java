import java.util.*;
interface out{
    void outm();
    interface int{
        void inm();
    }
}
class main implements outin
{
    public void inm()
    {
        System.out.println("hello i am inner method");
    }
    public static void main(String args[])
    {
        main h=new main();
        h.inm();
    }
}