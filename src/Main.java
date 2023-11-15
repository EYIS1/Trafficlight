import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scanner = new Scanner(System.in);

        Red red = new Red();
        Yellow yellow = new Yellow();
        Green green = new Green();

        int work = 1;
        while (work == 1)
        {
            red.run();
            red.join();
            yellow.run();
            yellow.join();
            green.run();
            green.join();
            yellow.run();
            yellow.join();
        }
    }
}

class Green extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Зелений світлофор");
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Yellow extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Жовтий світлофор");
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Red extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Червоний світлофор");
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}