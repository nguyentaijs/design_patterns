package designpatterns.command.command;

import designpatterns.command.receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {

	private CeilingFan ceilingFan;

	private CeilingFanLowCommand() {

	}

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.low();

	}
	
}
