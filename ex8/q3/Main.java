public class Main {
    public static void main(String[] args) {
        // Create Light and Airconditioner instances
        Light bedRoomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedRoomAC = new Airconditioner("Bed Room");
        Airconditioner anotherAC = new Airconditioner("Another Room");
        Light anotherLight = new Light("Another Room");

        // Create Command instances
        LightOnCommand bedRoomLightOn = new LightOnCommand(bedRoomLight);
        LightOffCommand bedRoomLightOff = new LightOffCommand(bedRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        ACOnCommand bedRoomACOn = new ACOnCommand(bedRoomAC, 25);
        ACOffCommand bedRoomACOff = new ACOffCommand(bedRoomAC);
        ACOnCommand anotherACOn = new ACOnCommand(anotherAC, 23);
        ACOffCommand anotherACOff = new ACOffCommand(anotherAC);
        LightOnCommand anotherLightOn = new LightOnCommand(anotherLight);
        LightOffCommand anotherLightOff = new LightOffCommand(anotherLight);

        // Create and configure the remote control
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, bedRoomLightOn);
        remoteControl.setCommand(1, kitchenLightOn);
        remoteControl.setCommand(2, bedRoomACOn);

        // Test the remote control
        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);

        System.out.println("--------------------------------");

        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);

        System.out.println("--------------------------------");

        remoteControl.pressOnButton(2);
        remoteControl.pressOffButton(2);

        System.out.println("--------------------------------");

        // Test an unavailable slot
        remoteControl.pressOnButton(3);
        remoteControl.pressOffButton(3);
        remoteControl.setCommand(3, anotherACOn);
    }
}