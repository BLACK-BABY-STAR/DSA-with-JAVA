package Patterns;

public class Butterfly{
    public static void main(String args[])
    {
        for(int i=1;i<=4;i++){
            //up
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=4-i;k++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=4-i;k++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--)
        {//Down
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int k=1;k<=4-i;k++){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=4-i;k++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
} 