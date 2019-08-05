// "static void main" must be defined in a public class.

import java.util.ArrayList;
import java.util.List;

/**
 * @author 菜菜
 * @date 2019/8/5
 **/
public class MyQueue {
    /**
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @param
     * @return
     * @description: store elements
     */
    private List<Integer> data;
    /**
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @param
     * @return
     * @description:a pointer to indicate the start position
     */
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    /**
     * @param [x]
     * @return boolean
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: 添加元素
     */
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    /**
     * @param []
     * @return boolean
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description:Delete an element from the queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }

    /**
     * @param []
     * @return int
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: Get the front item from the queue.
     */
    public int front() {
        return data.get(p_start);
    }

    /**
     * @param []
     * @return boolean
     * @author:caiyq(蔡永琪)
     * @date: 2019/8/5
     * @description: 判断是否为空
     */
    public boolean isEmpty() {
        return p_start >= data.size();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
    }
}