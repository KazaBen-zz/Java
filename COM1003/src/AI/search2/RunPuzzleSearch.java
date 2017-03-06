package AI.search2;
import sheffield.*;
import java.util.Arrays;

public class RunPuzzleSearch {

	public static void main(String[] args) {
		EasyWriter screen = new EasyWriter();
		int[] test1 = {1,0,3,4,2,6,7,5,8};
		int[] target = {1,2,3,4,5,6,7,8,0};
		int[] test2 = {1,2,3,4,0,6,7,5,8};
		int[] test3 = {4,1,3,7,2,5,0,8,6};
		PuzzleSearch searcher = new PuzzleSearch(test3, target);
		SearchState initState = (SearchState) new PuzzleState(test3);
		String resd = searcher.runSearch(initState, "a");
		screen.println(resd);
	}

}
