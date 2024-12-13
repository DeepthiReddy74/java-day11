import java.util.*;
 class reversearraylisttwopointertec
 {
    public static void main(String args[])
    {
        int l=o;
        int r=a.size()-1;
        while(l<r)
        {
            int temp=a.get(1);
            a.set(l,a.get(r));
            a.set(r,temp);
            l++;
            r--;
        }
        System.out.println(a);
        }
    }
 