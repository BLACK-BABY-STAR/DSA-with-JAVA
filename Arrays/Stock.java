package Arrays;

public class Stock {
public static void main(String args[])
{
        int g[] ={7,1,5,3,6,4};
        prit(g[]);
}

public static void prit(int t[])
{
    int n=t.length;
    int profit=Integer.MIN_VALUE;
    int buy=t[0];int m;int sell;
    for(int i=1;i<n;i++)
    {
       sell=t[i];
       m=sell-buy;
       if(m>profit)
       profit=m;
       if(buy>sell)
       buy=sell;
    }
    System.out.println(profit);


}
}