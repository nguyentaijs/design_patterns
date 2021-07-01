package designpatterns.command.command;

import designpatterns.command.receiver.CeilingFan;

public class CeilingFanMaxCommand implements Command {
	private CeilingFan ceilingFan;

	private CeilingFanMaxCommand() {

	}

	public CeilingFanMaxCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.max();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}
	
}
