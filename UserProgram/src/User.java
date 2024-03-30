public class User {
	//A
	private String firstName;
	private String lastName;
	private int age;
	private int imagesCount;
	private int videosCount;
	private User[] following;
	private User[] followers;
	public static final int VIP_VALIDATION_MIN = 3;

	public User(String firstName, String lastName, int age, int imagesCount, int videosCount){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.imagesCount = imagesCount;
		this.videosCount = videosCount;
	}
	public User (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.followers = new User[0];
		this.following = new User[0];
	}


	//B
	public boolean isValidName() {
		String res = "0123456789";
		boolean temp = true;
		if (firstName.contains(res) || lastName.contains(res)) {
			System.out.println("This name is invalid, numbers are not allowed");
			temp = false;
		}
		return temp;
	}

	//C
	public boolean isVip(User user){
		boolean isVip = false;
		if (this.imagesCount >= VIP_VALIDATION_MIN && this.videosCount >= VIP_VALIDATION_MIN && this.isValidName()){
			int countFollowers = 0;
			for (int i = 0; i < this.followers.length; i++) {
				if (this.followers[i].isValidName()){
					countFollowers++;
				}
			}
			if (countFollowers >= 10){
				isVip = true;
			}
		}
		return isVip;
	}

	//D
	public int countMutualConnections(){
		int count = 0;
		for (int i = 0; i < followers.length; i++) {
			for (int j = 0; j < following.length; j++) {
				if (this.followers[i] == this.following[j]){
					count++;
				}
			}
		}
		return count;
	}

	//E
	public void removeFakeUsers() {
		for (int i = 0; i < followers.length; i++) {
			if (this.isFakeUser(this.following[i])){
				this.unfollow(this.following[i]);
			}
		}
	}
	public boolean isFakeUser(User user){
		if (user.isValidName() && user.imagesCount == 0 && user.videosCount == 0 && user.countMutualConnections() == 0){
			return false;
		}
		return true;
	}

	public void follow (User other) {
		User[] temp = new User[this.following.length + 1];
		for (int i = 0; i < this.following.length; i++) {
			temp[i] = this.following[i];
		}
		temp[temp.length - 1] = other;
		this.following = temp;

		User[] temp2 = new User[other.followers.length + 1];
		for (int i = 0; i < other.followers.length; i++) {
			temp2[i] = other.followers[i];
		}
		temp2[temp2.length - 1] = this;
		other.followers = temp2;

	}
	public void unfollow (User user) {
		User[] temp = new User[this.following.length - 1];
		int j = 0;
		for (int i = 0; i < this.following.length; i++) {
			if (this.following[i] != user) {
				temp[j] = this.following[i];
				j++;
			}
		}
		this.following = temp;
		User[] temp2 = new User[user.followers.length - 1];
		j = 0;
		for (int i = 0; i < user.followers.length; i++) {
			if (user.followers[i] != this) {
				temp2[j] = user.followers[i];
				j++;
			}
		}
		this.followers = temp2;
	}


	public int getVideosCount() {
		return videosCount;
	}

	public int getImagesCount() {
		return imagesCount;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString(){
		return getClass().getSimpleName() + "---> Full name: " + firstName +" " + lastName +
				", Age: " + age +", Images: " + imagesCount + ", Videos: " + videosCount
				+ " follow: " + followers.length;
	}
}
