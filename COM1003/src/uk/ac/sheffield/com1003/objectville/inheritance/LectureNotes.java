package uk.ac.sheffield.com1003.objectville.inheritance;

public class LectureNotes extends ReadingMatter {
	private int week;
	private int moduleCode;
	public LectureNotes(int numPages, int week, int moduleCode) {
		super(numPages);
		this.week = week;
		this.moduleCode = moduleCode;
	}
	
	public int getWeek(){
		return week;
	}
	public int getModuleCode(){
		return moduleCode;
	}
	public String toString(){
		String returner = "Module code: " + getModuleCode() + " num of pages: "+ getNumPages()+" Week: "+ week;
		return returner;
	}
}
