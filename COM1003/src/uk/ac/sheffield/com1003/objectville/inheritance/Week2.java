package uk.ac.sheffield.com1003.objectville.inheritance;

public class Week2 {

	public static void main(String[] args) {
		ReadingMatter matter = new ReadingMatter(200);
		Newspaper newspaper = new Newspaper(20,"Headline");
		LectureNotes notes = new LectureNotes(15,2,1003);
		matter.printInfo();
		newspaper.printInfo();
		System.out.println(notes);
	}

}
