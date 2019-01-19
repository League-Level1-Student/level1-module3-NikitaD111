import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	int x = 0;
	int y = 1;
	World world = new World();
	Bug bug = new Bug();
	Location location = new Location(x, y);
	Location location1 = new Location(x, y-1);
	Location location2 = new Location(x, y+1);
	Color color = new Color(000,119,170);
	Flower flower = new Flower();
public static void main(String[] args) {
	new Gridworld().drawWorld();
}
public void drawWorld(){
	world.show();
	world.add(location, bug);
	bug.setColor(color);
	bug.turn();
	bug.turn();
	world.add(location1, flower);
	world.add(location2, flower);
	for (int x = 0; x < 10; x++) {
		
		
		for (int j = 0; j < 10; j++) {
			Location location3 = new Location(x, j);
			world.add(location3, flower);
			
		}
	}
	
	
}
}





