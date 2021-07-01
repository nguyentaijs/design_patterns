package designpatterns.command.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No function is assigned");
	}

	
}
