package designpatterns.command.command;

import designpatterns.command.receiver.Light;

public class LightOnCommand implements Command {

	private Light light;

	private LightOnCommand() {
	}

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}
	
}
