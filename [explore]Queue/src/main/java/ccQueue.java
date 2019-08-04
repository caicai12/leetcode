import java.util.List;

public class ccQueue {
    private List<Integer> data;
    private int p_idx;

    public ccQueue() {
        data = null;
        p_idx = -1;
    }

    public boolean isEmpty() {
        if (p_idx == -1) {
            return true;
        }
        return false;
    }

    public void add(int number) {
        p_idx++;
        data.add(number);
    }

    public void remove(int index) {
        if (isEmpty() == true) {
            p_idx--;
            data.remove(index);
        }
    }
    public int getsize(){
        int size=0;
        if(p_idx == -1)
        {return size;}
        else{
        return p_idx+1;
        }
    }

    public static void main(String[] args) {
        ccQueue ccQueue=new ccQueue();
        System.out.println(ccQueue.isEmpty());
        ccQueue.add(3);
        ccQueue.add(4);
        System.out.println(ccQueue.isEmpty());
        ccQueue.remove(1);

    }
}
