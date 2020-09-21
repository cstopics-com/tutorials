package concurrent;

public class Exercise1 {

	public static void main(String[] args) {
		CustomThreadFactory factory = new CustomThreadFactory("CustomThreadFactory");
		Task task = new Task();
		Thread thread;
		System.out.printf("Starting the Threads\n\n");
		for (int i = 1; i <= 20; i++)
		{
			thread = factory.newThread(task);
			thread.start();
		}
		System.out.printf("All Threads are created now\n\n");
		System.out.printf("Give me CustomThreadFactory stats:\n\n" + factory.getStats());
	}
}
