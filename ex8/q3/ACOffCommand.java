public class ACOffCommand implements Command {
    private Airconditioner ac;

    public ACOffCommand(Airconditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.off();
    }
}