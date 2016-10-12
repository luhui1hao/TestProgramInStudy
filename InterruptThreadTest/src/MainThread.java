public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WorkThread workThread = new MainThread().new WorkThread();
		workThread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workThread.interrupt();
	}

	class WorkThread extends Thread {
		public void run() {
			// while(!Thread.currentThread().isInterrupted()){
			while (!interrupted()) {
				System.out.println("runing!!!");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("InterruptedException...");
					break;
				}
			}
			System.out.println("stop!!!");
		}
	}

}
