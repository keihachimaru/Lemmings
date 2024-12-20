package tp1.control.command;

import tp1.exceptions.CommandExecuteException;
import tp1.exceptions.CommandParseException;
import tp1.logic.GameModel;
import tp1.view.GameView;
import tp1.view.Messages;

public abstract class Command {
	protected String name;
	protected String shortcut;
	protected String details;
	protected String help;
	
	public Command(String name, String shortcut, String details, String help) {
		this.name = name;
		this.shortcut = shortcut;
		this.details = details;
		this.help = help;
	}
	
	protected abstract boolean matchCommand(String type);
	
	 public abstract Command parse(String[] parameter) throws CommandParseException;
	
	 public abstract void execute(GameModel game, GameView view) throws CommandExecuteException;
	
	public String getName() {
		return name;
	}

	public String getShortcut() {
		return shortcut;
	}

	public String getDetails() {
		return details;
	}

	public String getHelp() {
		return help;
	}
}


