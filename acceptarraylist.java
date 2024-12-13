import java.util.*;
class main
{
    public static void main()
    {
        Scanner sc new Scanner(System.in);
        int n= sc.nextInt();
        Arraylist<Integer> a=new Arraylist<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        a.add(89);
        System.out.println(a);
    }
}
//printing the elements in an arraylist
{
    for (int i =0;i<a.size();i++)
    System.out.println(a.get(i)+" ");
    
}