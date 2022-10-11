public class Main
{
    public static void main(String[] args)
    {
        for(int x=0; x <= 30; x++)
        {
            System.out.println(x);
        }

        for(int l = 0; l < 3; l++)
            System.out.println();

        for(int x=30; x >= 0; x--)
        {
            System.out.println(x);
        }

        for(int l = 0; l < 3; l++)
            System.out.println();

        for(int x=0; x <= 18; x+=3)
        {
            System.out.println(x);
        }

        for(int l = 0; l < 3; l++)
            System.out.println();

        for(int x=10; x >= 0; x-=2)
        {
            System.out.println(x);
        }




        //================================================
            for(int l = 0; l < 3; l++)
                System.out.println();

            for(int c=1 ;c<=5 ;c++)
            {
                for(int r = 1; r <= c;r++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        //================================================
            for(int l = 0; l < 3; l++)
                System.out.println();

            for(int c=5 ;c>=1 ;c--)
            {
                for (int r = 1; r <= c; r++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        //================================================
            for(int l = 0; l < 3; l++)
                System.out.println();

            for(int p=0; p<=4; p++)
            {
                System.out.print("\n*");
                for (int c = 0; c <= 3; c++)
                {
                    System.out.print("*");
                }
            }
        //===============================================
            for(int l = 0; l < 3; l++)
                System.out.println();

            for(int k=1 ;k<=20;k--)
            {
                for(int r = 1; r >= k; r++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }

    }
}