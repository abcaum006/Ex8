public class LiveResultDisplay implements Observer {
    @Override
    public void update(String result) {
        System.out.println("live result: " + result);
    }
}