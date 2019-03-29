package cmd;

import java.nio.file.Path;
import java.nio.file.Paths;

class CommandContext {
    private Path path = Paths.get("").toAbsolutePath();
    private boolean working = true;

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public boolean isWorking(){
        return working;
    }

    public boolean setWorking(boolean working){
        return this.working = working;
    }
}
