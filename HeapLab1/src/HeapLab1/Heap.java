package HeapLab1;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap {
	private List<Integer> list;

	public Heap() {
		list = new ArrayList<Integer>();
	}

	public void add(int value) {
		list.add(value);
        swapUp(list.size() - 1);
	}

   	public void swapUp(int bot) {
   		while (bot > 0) {
            int parent = (bot - 1) / 2;
            if (list.get(bot) > list.get(parent)) {
                swap(bot, parent);
                bot = parent;
            } else {
                break;
            }
        }
   		
	}

	public void remove( ) {
		if (list.isEmpty()) return;
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        swapDown(0);
	}

	public void swapDown(int top)	{
		int last = list.size() - 1;
        while (top <= last) {
            int left = 2 * top + 1;
            int right = 2 * top + 2;
            if (left > last) break;

            int biggest = left;
            if (right <= last && list.get(right) > list.get(left)) {
            	biggest = right;
            }

            if (list.get(top) < list.get(biggest)) {
                swap(top, biggest);
                top = biggest;
            } else {
                break;
            }
        }
	}
	
	private void swap(int start, int finish) {
		int temp = list.get(start);
        list.set(start, list.get(finish));
        list.set(finish, temp);
	}

	public void print() {
		out.println("\n\nPRINTING THE HEAP!\n\n");
        int level = 0;
        int levelSize = 1;
        int current = 0;

        while (current < list.size()) {
            for (int i = 0; i < levelSize && current < list.size(); i++) {
                out.print(list.get(current) + " ");
                current++;
            }
            out.println();
            level++;
            levelSize = (int) Math.pow(2, level);
        }

	}

	public String toString() {
		return list.toString();
	}
}
