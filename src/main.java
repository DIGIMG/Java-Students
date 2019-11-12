import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        double avverage;
        double sum=0;
        int unit;
        int t_dars;
        int t_std;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number of students : ");
        t_std = input.nextInt();
        System.out.print("Please Enter Number of Book : ");
        t_dars = input.nextInt();




        double[] number = new double[t_std];
        String[] name = new String[t_std];
        String[] family = new String[t_std];





        for (int i=0;i<t_std;i++)
        {

            System.out.print("Please Enter Your Name : ");
            name[i] = input.next();
            System.out.print("Please Enter Your Family : ");
            family[i] = input.next();

            for(int o=0;o<t_dars;o++)
            {
                System.out.print("Please Enter Number : "+ o+1);
                number[o] = input.nextInt();

            }
        }


    for(int p=0;p<t_std;p++)
    {
        System.out.print("Your name is : "+ name[p] );
        System.out.print("Your family is : "+ family[p] );

        for(int q=0;q<t_dars;q++)
        {

            sum =+ number[q];
        }
          avverage = sum / t_dars;
        System.out.print("Avverage is :"+avverage);
    }


    }

}