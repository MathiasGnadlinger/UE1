public class Main
{
    public static void main(String[] args) {
        System.out.printf("*** Welcome ***\n");

        DatePrinter dt1 = new DatePrinter();
        Thread th1 = new Thread(dt1);

        CountPrinter cp1 = new CountPrinter();
        Thread th2 = new Thread(cp1);

        th1.start();
        th2.start();

    }


}
