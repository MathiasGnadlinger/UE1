/**
 * @author Mathias Gnadlinger
 * @version 1, 30.09.2021
 */
public class CountPrinter implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i <= 2000000; i++)
        {
            System.out.println(i);
        }
    }
}
