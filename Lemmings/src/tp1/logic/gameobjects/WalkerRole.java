package tp1.logic.gameobjects;

import java.util.List;

import tp1.logic.Position;

public class WalkerRole {
	private String name;
	
	public String action(Position pos, List<Wall> walls) {
		
		for	(int i = 0; i < walls.size(); i++) {
			if((pos.getRow() + 1) == walls.get(i).getRow() 
				&& pos.getCol() == walls.get(i).getCol()) {
				
			}
		}
	}
}
