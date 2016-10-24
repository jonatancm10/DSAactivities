package edu.upd.eetac.dsa;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        Thread th1 = new MiEscribidor(1);
        Thread th2 = new MiEscribidor(2);
        Thread th3 = new MiEscribidor(3);
        Thread th4 = new MiEscribidor(4);
        Thread th5 = new MiEscribidor(5);
        Thread th6 = new MiEscribidor(6);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }
}

