package tp1.logic.gameobjects;

import tp1.logic.Position;
import tp1.view.Messages;

public class ExitDoor extends GameObject {

	public ExitDoor(Position pos) {
		super(pos);
	}
	
	public void update () {
		
	}

	public String toString() {
		return Messages.EXIT_DOOR;
	}
	

	public boolean receiveInteraction(GameItem other) {
        return other.interactWith(this);
    }

    public boolean interactWith(Wall wall) {
        return true;
    };

    public boolean interactWith(ExitDoor door) {
        return true;
    };

    public boolean interactWith(MetalWall wall) {
        return true;
    }

    public boolean interactWith(Lemming lemming) {
        return true;
    }

    public boolean isSolid() {
        return false;
    }
	public boolean isAlive() {
        return true;
    }
	public boolean isExit() {
        return true;
    }
	public boolean isInPosition(Position pos) {
        return true;
    }
}