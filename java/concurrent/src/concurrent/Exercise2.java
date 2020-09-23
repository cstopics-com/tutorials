package concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise2 {

	private ExecutorService executor = Executors.newSingleThreadExecutor();

	public Future<Integer> calculate(Integer input) {        
		return executor.submit(() -> {
			Thread.sleep(1000);
			return input * input;
		});
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Exercise2 exercise = new Exercise2();
		Future<Integer> future = exercise.calculate(10);
		 
		while(!future.isDone()) {
		    System.out.println("Calculating...");
		    Thread.sleep(300);
		}
		 
		Integer result = future.get();
		System.out.println(result);
	}
}
