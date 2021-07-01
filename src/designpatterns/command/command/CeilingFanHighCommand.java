package designpatterns.command.command;

import designpatterns.command.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {

	private CeilingFan ceilingFan;

	private CeilingFanHighCommand() {

	}

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.high();

	}
	
}
