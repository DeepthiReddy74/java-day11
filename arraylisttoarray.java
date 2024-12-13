class arraylisttoarray
{
    publis static void main(String args[])
    {
        Arraylist<Integer>a=new Arraylist<>();
        a.add(898);
        a.add(89);
        a.add(1);
        a.add(78);
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        b[i]=a.ger(i);
        System.out.println(Arrays.toString(b));
        
    }
}