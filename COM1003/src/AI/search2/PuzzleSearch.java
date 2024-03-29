package AI.search2;

public class PuzzleSearch extends Search {
	private int puzzle[];
	private int target[];
	
	/** constructor take puzzle and target
	 * @param puzzle current puzzle;
	 * @param target target puzzle;
	 */
	public PuzzleSearch(int[] puzzle, int[] target){
		this.puzzle = puzzle;
		this.target = target;
	}
	
	// Accessors
	
	public int[] getPuzzle(){
		return puzzle;
	}
	public int[] getTarget(){
		return target;
	}
}
