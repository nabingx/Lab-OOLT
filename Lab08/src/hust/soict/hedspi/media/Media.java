package Lab08.src.hust.soict.hedspi.media;

public abstract class Media {
	
	private String title;
	private String category;
	private float cost;
	private int id;
	
	public String getTitle() {
		return title;
	}

	/*public void setTitle(String title) {
		this.title = title;
	}*/

	public String getCategory() {
		return category;
	}

	/*public void setCategory(String category) {
		this.category = category;
	}*/

	public float getCost() {
		return cost;
	}

	/*public void setCost(float cost) {
		this.cost = cost;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	
	public Media(String title) {
		this.title = title;
	}
	
	public boolean subSearch(String title) { // method xử lí title có 1 token
		String str = title.toLowerCase();
		String[] arr2 = this.title.toLowerCase().split(" ");
		//String[] arr2 = super.getTitle().toLowerCase().split(" "); // đổi do title ở lớp cha (Media)
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i].equals(str)) return true;
		}
		return false;
	}
	
	public boolean search(String title) {
		String[] arr1 = title.toLowerCase().split(" ");
		boolean res = true;
		//int i = 0;
		//while(subSearch(arr1[i]) == true/* && i < arr1.length*/) {
		for(int i = 0; i < arr1.length; i++) {
			//if(subSearch(arr1[i]) == false) return false;
			//if(i < arr1.length - 1) i++;
			//break;
			res = subSearch(arr1[i]);
			if(res == false) return res;
		}
		
		return res;
	}
	
	@Override
	public boolean equals(Object o) {
		Media media = (Media) o;
		if (media == null) return false;
		if (this.id == media.getId()) return true;
		else return false;
	}
	
}
