import java.util.ArrayList;
import java.util.List;
public class RemoteControl {
    private List<Command> commands;

    public RemoteControl() {
        commands = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            commands.add(new NoCommand());
        }
    }

    public void setCommand(int slot, Command command) {
        commands.set(slot, command);
    }

    public void pressOnButton(int slot) {
        commands.get(slot).execute();
    }

    public void pressOffButton(int slot) {
        commands.get(slot).execute();
    }

    // Additional class for handling unavailable slots
    private class NoCommand implements Command {
        @Override
        public void execute() {
            System.out.println("On button No command is assigned to this slot");
            System.out.println("Off button No command is assigned to this slot");
        }
    }
}