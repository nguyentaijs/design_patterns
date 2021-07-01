package designpatterns.command.command;

import designpatterns.command.receiver.Light;

public class LightOffCommand implements Command {

	private Light light;

	private LightOffCommand() {
	}

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
}
