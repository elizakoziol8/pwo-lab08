package pwo.lab08.cli;

import pwo.lab08.engine.Engine;

public class Lab08Cli {

    public static final String APP_NAME = "Lab08 CLI Application ";

    public static void main(String[] args) {

        System.out.println(APP_NAME + Engine.getVersion());

        switch (args.length) {
            case 3:
                (new SeqToOutApp()).run(args);
                break;
            case 4:
                (new SeqToFileApp()).run(args);
                break;
            default:
                System.out.println("!Illegal arguments\n"
                        + "Legal usage: seqName from to [fileName]");
        }
    }
}
