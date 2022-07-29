package CollectionPackage;

import java.util.ArrayDeque;
	public class ArrayDeq {
		public static void main(String []args) {
			//a queue in which data can be added an removed from both the ends
			ArrayDeque<Integer> ad = new ArrayDeque<>();
			//offer adds in front
			ad.offer(1);
			ad.offer(2);
			//offerFirst also adds in front
			ad.offerFirst(3);
			//offerLast adds in last or back
			ad.offerLast(4);
			ad.offerLast(5);
			System.out.println(ad);
			//pollFirst removes from back or front
			System.out.println(ad.pollFirst());
			//pollLast removes from first element i.e last added element
			System.out.println(ad.pollLast());
			System.out.println(ad);
		}
	}

