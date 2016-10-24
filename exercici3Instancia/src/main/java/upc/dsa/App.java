package upc.dsa;

public class App 
{
    public static void main( String[] args ) {
        Command Co1 = Factory.getInstance().getCommand("Co1");
        Co1.execute();
        Command Co2 = Factory.getInstance().getCommand("Co2");
        Co2.execute();
        Command Co3 = Factory.getInstance().getCommand("Co3");
        Co3.execute();
    }
}
