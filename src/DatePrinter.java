/**
 * @author Mathias Gnadlinger
 * @version 1, 30.09.2021
 */
import java.util.Date;

public class DatePrinter implements Runnable
{
    @Override
    public void run()
    {
        Date date = new Date();
        for (int i = 0; i <= 200000; i++)
        {
            System.out.println("Current Date is: " +date);
        }
    }
}
