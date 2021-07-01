package designpatterns.command.invoker;

import designpatterns.command.command.Command;

public interface Remote {
	void setCommand(int slot, Command onCommand, Command offCommand);
	void onButtonClicked(int slot);
	void offButtonClicked(int slot);
	void undo();
}
