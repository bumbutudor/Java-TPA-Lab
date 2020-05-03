/*
6.	Creati o clasa Queue. Introduce o serie de siruri de caractere, să se verifece daca string-ul dat este unic in coadă.
 */
package lab5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Queue<String> q = new LinkedList<>();

        // Adaugam elemente in queue
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Introduceti caracterul ");
            Scanner te = new Scanner(System.in);
            String c = te.nextLine();
            q.add(c);
        }

        // Afisam elementele din queue
        System.out.println("Element din queue " + q);

        //Verificam daca string-ul dat este unic in coadă

            int flag = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 5; j > 0; j--) {
                    if (i != j) {
                        try {
                        if (get(q, i) != get(q, i + 1))
                            flag = 1;
                        } catch (Exception e) { System.out.println("Exceptie"+e);}
                    }
                }
            }

            if (flag != 1) {
                System.out.println("Queue nu contine elemente unice ");
            } else {
                System.out.println("Queue contine elemente unice ");
            }
    }
    public static <T > T get(Queue < T > queue, int index){
            synchronized (queue)
            {
                if (queue == null)
                {
                    return null;
                }

                int size = queue.size();
                if (index < 0 || size < index + 1)
                {
                    return null;
                }

                T element = null;
                for (int i = 0; i < size; i++)
                {
                    if (i == index)
                    {
                        element = queue.remove();
                    } else {
                        queue.add(queue.remove());
                    }
                }

                return element;
            }
    }
}