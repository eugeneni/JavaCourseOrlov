package cmd;

public class CommandFactory {

    public ConsoleCommand createCommand(String[] command){
        String commandName = command[0];

        switch (commandName){
            case "chdir":
                return  new ChangeDirCommand(command[1]);
            case "exit":
                return new ExitCommand();
        }
        return null;
    }
}
