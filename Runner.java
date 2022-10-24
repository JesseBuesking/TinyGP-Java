import definition.TinyGp;

public class Runner {

    public static void main(String[] args) {
        String fname = "values/val3_3.dat";
        String logName = "output-functions/val3_3.txt";
        long s = 402456;

        if (args.length == 2) {
            s = Integer.valueOf(args[0]).intValue();
            fname = args[1];
        }
        if (args.length == 1) {
            fname = args[0];
        }

        TinyGp gp = new TinyGp(fname, s, logName);
        gp.evolve();

//  todo        delete dis

        fname = "values/val3_3.dat";
        logName = "output-functions/val3_3.txt";
        s = 402456;

        gp = new TinyGp(fname, s, logName);
        gp.evolve();


//  todo       up tooooo... here :)
    }

}
