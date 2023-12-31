package DesignPattern.command.button;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        LampOnCommand lampOnCommand = new LampOnCommand(lamp);
        Alarm alarm = new Alarm();
        AlarmOnCommand alarmOnCommand = new AlarmOnCommand(alarm);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmOnCommand);
        button2.pressed();
        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
