import java.util.Stack;

public class GfG {
    static char[] rod = { 'S', 'A', 'D' };
    static Stack<Integer>[] stacks = new Stack[3];

    static
    {
        for (int i = 0; i < 3; i++) {
            stacks[i] = new Stack<>();
        }
    }

    static void moveDisk(int a, int b)
    {
        if (stacks[b].isEmpty()
            || (!stacks[a].isEmpty()
                && stacks[a].peek() < stacks[b].peek())) {
            System.out.println("Move disk "
                               + stacks[a].peek()
                               + " from rod " + rod[a]
                               + " to rod " + rod[b]);
            stacks[b].push(stacks[a].pop());
        }
        else {
            moveDisk(b, a);
        }
    }

    static void towerOfHanoi(int n)
    {
        System.out.println("Tower of Hanoi for " + n
                           + " disks:");

        int src = 0, aux = 1, dest = 2;
        for (int i = n; i > 0; i--) {
            stacks[src].push(i);
        }

        int totalMoves = (1 << n) - 1;
        if (n % 2 == 0) {
            int temp = aux;
            aux = dest;
            dest = temp;
        }

        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 0)
                moveDisk(aux, dest);
            else if (i % 3 == 1)
                moveDisk(src, dest);
            else
                moveDisk(src, aux);
        }
    }

    public static void main(String[] args)
    {
        int n = 20000; // number of disks
        towerOfHanoi(n);
    }
}