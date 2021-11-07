public class q19
{
    public static void main(String[] args)
    { int numb =123 ;
        int a= numb%10;
        int q=numb/10;
        int b=q%10;
        int c=q/10;

    System.out.println(a);
     System.out.println(b);
      System.out.println(c);

      int d=a*10;
      d=d+b;
      d=d*10;
      d=d+c;

    System.out.println(d);
    }
}