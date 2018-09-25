package business;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Textbooks {
	private int ID;
	private String title;
	private String author;
	
	public Textbooks(int iD, String title, String author) {
		super();
		ID = iD;
		this.title = title;
		this.author = author;
	}

	public Textbooks(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//	@Override
//	public String toString() {
//		return ID + "\t" + title + "\t" + author;
//	}
	@Override
	public String toString() {
//		StringBuilder message = new StringBuilder();
//		message.append(ID);
//		message.append(pad(title, 10));
//		message.append(pad(author, 5));
		String message = ID + "\t" + pad(title, 60) + pad(author, 25);
		return message;
	}
	
	
	public static String pad(String s, int length) {
		if (s.length() < length) {
			StringBuilder sb = new StringBuilder(s);
			while (sb.length() < length) {
				sb.append(" ");
			}
			return sb.toString();
		} else {
			return s.substring(0, length);
		}
	}
	
}
