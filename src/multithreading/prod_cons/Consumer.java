package multithreading.prod_cons;

import java.util.List;

public class Consumer implements Runnable {

	private List<String> msgQueue;

	public Consumer(List<String> msgQueue) {
		this.msgQueue = msgQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void consume() throws InterruptedException {
		synchronized (msgQueue) {

			if (msgQueue.size() != 0) {
				String msg = msgQueue.remove(0);
				System.out.println("Consumer consumed : " + msg + "; Size : "+ msgQueue.size());
                msgQueue.notify();
			} else {
				// wait for producer to produce
				System.out.println("Consumer is waiitng as queue is empty!!");
				msgQueue.wait();
			}
		}

	}
}
