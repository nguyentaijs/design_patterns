package designpatterns.command.Client;

import designpatterns.command.command.CeilingFanHighCommand;
import designpatterns.command.command.CeilingFanLowCommand;
import designpatterns.command.command.LightOffCommand;
import designpatterns.command.command.LightOnCommand;
import designpatterns.command.invoker.Remote;
import designpatterns.command.invoker.SimpleRemote;
import designpatterns.command.receiver.CeilingFan;
import designpatterns.command.receiver.Light;

public class SmartHome {

	public static void main(String[] args) {
		Light livingRoomLight = new Light("Living room");
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

		Light kitchenLight = new Light("Kitchen");
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

		CeilingFan ceilingFan = new CeilingFan();
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);

		Remote simpleRemote = new SimpleRemote();
		simpleRemote.setCommand(0, lightOnCommand, lightOffCommand);
		simpleRemote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		simpleRemote.setCommand(2, ceilingFanHighCommand, ceilingFanLowCommand);

		simpleRemote.onButtonClicked(0);
		simpleRemote.offButtonClicked(0);

		simpleRemote.onButtonClicked(1);
		simpleRemote.offButtonClicked(1);

		simpleRemote.onButtonClicked(2);
		simpleRemote.offButtonClicked(2);
		simpleRemote.offButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);
		simpleRemote.onButtonClicked(2);

		// Undo
		simpleRemote.undo();

		simpleRemote.onButtonClicked(1);
		simpleRemote.undo();
	}
	
}
