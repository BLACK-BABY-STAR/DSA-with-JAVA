package Arrays;

public class Rainwatertrap{
    public static void main(String args[])
    {
        int g[] ={4,2,0,6,2,3,5};
        trap(g);
    }


    public static void trap(int h[])
    {
      int b=-1;
      int f=-1;
      int bin[]=new int[h.length];
      int fax[]=new int[h.length];
      for(int i=0;i<h.length;i++)
      {
       if(h[i]>f)
       f=h[i];
       fax[i]=f;
      }
      for(int i=h.length-1;i>=0;i--)
      {
       if(h[i]>b)
       b=h[i];
       bin[i]=b;
      }
      //trap water
      int trapwater=0;
      for(int i=0;i<h.length;i++)
      {
        int mini=Math.min(fax[i],bin[i]);
        trapwater+=mini-h[i];
    }
    
    System.out.println(trapwater);
} 
}