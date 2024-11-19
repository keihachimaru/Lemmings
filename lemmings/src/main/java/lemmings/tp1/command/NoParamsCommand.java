package lemmings.tp1.command;

public abstract class NoParamsCommand extends Command{

	public NoParamsCommand(String name, String shortcut, String details, String help) {
		super(name, shortcut, details, help);
	}
	
	public Command parse(String[] input) {
		
		String command = input[0].toLowerCase();

		if (this.matchCommand(command) && input.length==1) {
			return this;
		}
		return null;
	}
}