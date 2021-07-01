package designpatterns.command.invoker;

import designpatterns.command.command.Command;
import designpatterns.command.command.NoCommand;

public class SimpleRemote implements Remote {

	private Command[] onCommands;
	private Command[] offCommands;

	public SimpleRemote() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	@Override
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	@Override
	public void onButtonClicked(int slot) {
		onCommands[slot].execute();
	}

	@Override
	public void offButtonClicked(int slot) {
		offCommands[slot].execute();
	}
}
