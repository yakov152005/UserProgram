public class Program {
	public static void main(String[] args) {
		User user1 = new User("Yakov", "Ben-Hemo");
		User user2 = new User("Daniel", "Gino");
		User user3 = new User("Rodi", "lish");
		User user4 = new User("Yosef", "Modi");
		User user5 = new User("Shaked", "Gt");
		user1.follow(user2);
		user1.follow(user3);
		user1.follow(user4);
		user4.follow(user1);
		user3.follow(user1);
		System.out.println(user1);
		System.out.println(user3);
		System.out.println(user4);
		System.out.println(user5);
		System.out.println();
		user1.removeFakeUsers();
		System.out.println();
		System.out.println(user1);
	}
}
