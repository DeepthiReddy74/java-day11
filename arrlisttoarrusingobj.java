class arrlisttoarrusingobj
{
    publis static void main(String args[])
    {
        Arraylist<Integer>a=new Arraylist<>();
        object b[]=a.toArray();
        System.out.println(Arrays.toString(b));
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        b[i]=a.ger(i);
        System.out.println(Arrays.toString(b));
        
    }
}