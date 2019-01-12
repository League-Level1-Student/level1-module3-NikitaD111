
public class Netflix {
public static void main(String[] args) {
	Movie Waluigi = new Movie("Waluigi", 5);
	Movie Waluigi2 = new Movie("Waluigi2", 4);
	Movie Waluigi3 = new Movie("Waluigi3", 3);
	Movie Waluigi4 = new Movie("Waluigi4", 2);
	Movie Waluigi5 = new Movie("Twilight", 1);
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(Waluigi);
	queue.addMovie(Waluigi2);
	queue.addMovie(Waluigi3);
	queue.addMovie(Waluigi4);
	queue.addMovie(Waluigi5);
	queue.sortMoviesByRating();
	queue.printMovies();
	System.out.println("The best movie is " + queue.getBestMovie());
	System.out.println("the second best movie is " + queue.getMovie(1));


	}
}
