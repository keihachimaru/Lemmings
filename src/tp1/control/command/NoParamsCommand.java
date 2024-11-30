package tp1.control.command;

import tp1.exceptions.CommandParseException;
import tp1.view.Messages;

public abstract class NoParamsCommand extends Command{

	public NoParamsCommand(String name, String shortcut, String details, String help) {
		super(name, shortcut, details, help);
	}
	
	public Command parse(String[] commandWords) throws CommandParseException {
	 	if (commandWords.length < 1 || !matchCommand(commandWords[0]))
	 		return null;
	         
	 	if (commandWords.length == 1 && matchCommand(commandWords[0]))
	 		return this;
	     
	 	throw new CommandParseException(Messages.COMMAND_INCORRECT_PARAMETER_NUMBER);
	 }
}
