import definition.TinyGp;
import utils.ParserXLSX;

public class Runner {

    public static void main(String[] args) {
//        String fname = "src/main/resources/values/val6_4.dat";
//        String logName = "src/main/resources/output-functions/val6_4.txt";
//        long s = 402456;
//
//        if (args.length == 2) {
//            s = Integer.valueOf(args[0]).intValue();
//            fname = args[1];
//        }
//        if (args.length == 1) {
//            fname = args[0];
//        }
//
//        TinyGp gp = new TinyGp(fname, s, logName);
//        gp.evolve();

        ParserXLSX parserXLSX = new ParserXLSX();
        parserXLSX.parseAllExistingLogs();
    }

}
