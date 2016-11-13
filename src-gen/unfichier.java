import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class unfichier {
	
	public static void main(String[] args) {
		new unfichier().run();
	}
	
	protected void doUn() {
		System.out.println("Executing command un (deux)");
	}
	protected void doTrois() {
		System.out.println("Executing command trois (test)");
	}
	
	protected void run() {
		boolean executeActions = true;
		String currentState = "test";
		String lastEvent = null;
		while (true) {
			if (currentState.equals("test")) {
				if (executeActions) {
					doTrois();
					doUn();
					executeActions = false;
				}
				System.out.println("Your are now in state 'test'. Possible events are [].");
				lastEvent = receiveEvent();
			}
			
		}
	}
	
	private String receiveEvent() {
		System.out.flush();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException ioe) {
			System.out.println("Problem reading input");
			return "";
		}
	}
}
