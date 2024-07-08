package Patterns;

public class Palindromic {
    public static void main(String args[])
    {
    for(int i=1;i<=5;i++){
            
        for(int k=1;k<=5-i;k++){
            System.out.print(" "+" ");
        }
        int t=i;
        for(int k=1;k<i;k++){
            System.out.print(t+" ");
            t--;
        }
        System.out.print("1"+" ");
        int y=2;
        for(int j=1;j<i;j++){
            System.out.print(y+" ");
            y++;
        }
        System.out.println(); 
    }
}
}