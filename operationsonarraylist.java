import java.util.*;
class operationsonarraylist
{
    public static void main(String args[])
    {
        Arraylist<Integer>a=new Arraylist<>();
        //adding the elements in arraylist
        a.add(0);
        a.add(57);
        a.add(875);
        System.out.println(a);
        //removing the elments in arraylist
        a.remove(2);
        System.out.println(a);
        a.clear();
        System.out.println(a);
        System.out.println(a.contains(57));//true
        System.out.println(a.contains(900));//false
        


    }
}