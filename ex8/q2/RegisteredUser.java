public class RegisteredUser implements Observer {
    @Override
    public void update(String result) {
        System.out.println("Received result notification: " + result);
    }
}