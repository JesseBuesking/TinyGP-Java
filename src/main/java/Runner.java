import definition.TinyGp;
import definition.TinyGpExtended;
import utils.Evaluator;
import utils.ParserXLSX;

import java.io.*;

public class Runner {

    public static void main(String[] args) {
        String fname = null;
        String log = null;

        if (args.length == 2) {
            fname = args[1];
            log = args[0];
        }

//      evolve(fname, log);
//      parse();
//      evaluateFunctions();
        evolveExtended(fname, log);
//      testEvaluate();
    }

    private static void evolve(String name, String log) {
        // passing some example files if arguments empty
        String fname = name != null ? name : "src/main/resources/values/tan_w_d_tan.dat";
        String logName = log != null ? log : "src/main/resources/output-functions/tan_w_d_tan.txt";
        long s = 402456;

        TinyGp gp = new TinyGp(fname, s, logName);
        gp.evolve();
    }
    private static void evolveExtended(String name, String log) {
        // passing some example files if arguments empty
        String fname = name != null ? name : "src/main/resources/values/val2_2.dat";
        String logName = log != null ? log : "src/main/resources/output-functions/val2_2_ext.txt";
        long s = 402456;

        TinyGpExtended gpe = new TinyGpExtended(fname, s, logName);
        gpe.evolve();

    }
    private static void parse() {
        ParserXLSX parserXLSX = new ParserXLSX();
        parserXLSX.parseAllExistingLogs();
    }

    private static void evaluateFunctions() {
        Evaluator ev = new Evaluator();
        String dirName = "src/main/resources/final-functions-not-simplified";
        String dirName2 = "src/main/resources/final-functions-simplified";
        File dir = new File(dirName);
        File[] directoryListing = dir.listFiles();
        if (directoryListing != null) {
            for (File child : directoryListing) {
                String optimized = null;
                try (BufferedReader br = new BufferedReader(new FileReader(child))) {
                    String func = null;
                    while ((func = br.readLine()) != null) {

                        optimized = ev.optimize(func);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (optimized != null) {
                    try {
                        Writer output;
                        output = new BufferedWriter(new FileWriter(dirName2
                                .concat("/")
                                .concat(child.getName()), true));

                        output.append(optimized);
                        output.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }
        }

    }

    private static void testEvaluate() {
        Evaluator ev = new Evaluator();
        String dirName = "src/main/resources/final-functions-not-simplified";
        String dirName2 = "src/main/resources/final-functions-simplified";
        File f1 = new File("src/main/resources/final-functions-not-simplified/sin_w_d_sin.txt");
        File f2 = new File("src/main/resources/final-functions-not-simplified/tan_w_d_tan.txt");


        String optimized = null;
        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String func = null;
            while ((func = br.readLine()) != null) {

                optimized = ev.optimize(func);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (optimized != null) {
            try {
                Writer output;
                output = new BufferedWriter(new FileWriter(dirName2
                        .concat("/")
                        .concat(f1.getName()), true));

                output.append(optimized);
                output.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }



    }
}



