import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: caiyq(蔡永琪)
 * @time: 2019/8/5 10:38
 */
public class MovingAverage{
    int size = 0;
    int index = 0;
    double sum = 0.0;
    Queue<Integer> queue = new LinkedList<Integer>();

    public MovingAverage(int size) {
        this.size = size;
    }

    public double next(int val) {
        sum += val;
        queue.offer(val);
        if (index++ >= size) {
            sum -= queue.remove();
        }
        return sum / queue.size();
    }


    public static void main(String[] args) {
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1));
        System.out.println(m.next(2));
        System.out.println(m.next(3));
        System.out.println(m.next(5));

    }
}
