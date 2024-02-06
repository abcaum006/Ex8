public class ACOnCommand implements Command {
    private Airconditioner ac;
    private int temp;

    public ACOnCommand(Airconditioner ac, int temp) {
        this.ac = ac;
        this.temp = temp;
    }

    @Override
    public void execute() {
        ac.on();
        ac.setTemp(temp);
    }
}