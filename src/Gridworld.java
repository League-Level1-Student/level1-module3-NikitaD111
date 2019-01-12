import info.gridworld.world.World;

public class Gridworld {
	World world = new World();
public static void main(String[] args) {
	new Gridworld().drawWorld();
}
public void drawWorld(){
	world.show();
}
}

