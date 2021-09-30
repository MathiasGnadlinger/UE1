/**
 * @author Mathias Gnadlinger
 * @version 1, 30.09.2021
 */
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


/* Die JVM welchselt die Thread schnell, aber nicht schnell genug das es zwischen den 20 Ausgaben der Klassen wechselt
    deswegen werden die Zahlen und die Uhrzeiten geblockt ausgegeben und nicht durchmischt.
    Erst bei sehr vielen Ausgaben kommt die JVm dazu die Threads zu wechseln und die Ausgaben vermischen.
 */
