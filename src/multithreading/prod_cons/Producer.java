package multithreading.prod_cons;

import java.util.List;

public class Producer implements Runnable {

	private List<String> msgQueue;
	private Integer maxSize;

	public Producer(List<String> msgQueue, Integer maxSize) {
		this.msgQueue = msgQueue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			try {
				produce(++i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void produce(int i) throws InterruptedException {
		synchronized (msgQueue) {
			if (msgQueue.size() != maxSize) {
				String msg = "Msg-" + i;
				msgQueue.add(msg);
				System.out.println("Producer produced : "+msg +"; Size : "+ msgQueue.size());
				msgQueue.notify();

			} else {
				// wait for consumer to consume
				System.out.println("Producer is waiting as Queue is full");
				msgQueue.wait();
                
			}
		}

	}

}
