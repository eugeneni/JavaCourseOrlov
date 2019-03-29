package cmd;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CommandLine {

    private static Pattern SPLITTER = Pattern.compile("\\S");
    private CommandContext commandContext;
    private CommandFactory commandFactory;

    public static void main(String[] args) {
        CommandLine cmd = new CommandLine();
        cmd.run();
    }

    public CommandLine() {
        commandContext = new CommandContext();
        commandFactory = new CommandFactory();
    }

    public void run() {
        Scanner console = new Scanner(System.in);

        while (commandContext.isWorking()) {
            System.out.printf("$%s> ", commandContext.getPath());

            String line = console.nextLine();
            String[] command = SPLITTER.split(line);

            ConsoleCommand consoleCommand = commandFactory.createCommand(command);
            consoleCommand.execute(commandContext);
        }
    }
}
