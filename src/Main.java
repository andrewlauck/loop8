import java.util.Scanner;



class CtoF
{
    public static void main(String[] args)
    {
        String trash = " ";
        double C = 10;
        double F;


        Scanner in = new Scanner(System.in);

        F = (C * 9/5) + 32
        System.out.println("Tempurature in celsius: ");
        if (in.hasNextDouble()) {
            C = in.nextDouble();
            in.nextLine();
        } else {
            trash = in.nextLine();
            System.out.println("Must enter a valid number");
        }
        System.out.println("Tempurature in fahrenheit: " + F);
    }
}