
public class Show {
		// instance variables
		private String name;
		private String genre;
		private int length;
		private String network;
		
		// constructor
		public Show(String name, String genre, int length, String network) {
			super();
			this.name = name;
			this.genre = genre;
			this.length = length;
			this.network = network;
		}

		// getters and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public String getNetwork() {
			return network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}

		// toString
		@Override
		public String toString() {
			return "show: " + name + "\n"
				 + "genre: " + genre + "\n"
				 + "length: " + length + "\n"
				 + "network: " + network;
		}
		
}
