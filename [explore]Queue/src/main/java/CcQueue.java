import java.util.ArrayList;
import java.util.List;

/**
 * @author:caiyq(蔡永琪)
 * @date: 2019/8/5
 */
public class CcQueue {
    /**
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: 存放数组的容器
     */
    private List<Integer> data;
    /**
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: 序号
     */
    private int index;

    /**
     * @param []
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: 构造方法初始化
     */
    public CcQueue() {
        data = new ArrayList<Integer>();
        index = 0;
    }

    /**
     * @param []
     * @return boolean
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: 判断是否为空
     */
    public boolean isEmpty() {
        if (index >= data.size()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int number) {
        data.add(number);
    }

    public int front() {
        return data.get(index);
    }

    public void dequeue() {
        index++;
    }

    public static void main(String[] args) {
        CcQueue q = new CcQueue();
        q.add(5);
        q.add(3);
        System.out.println(q.front());
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.dequeue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.dequeue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }

    }
}
