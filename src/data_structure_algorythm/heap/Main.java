package data_structure_algorythm.heap;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);

        System.out.println(myHeap.getHeap());

        myHeap.insert(100);
        System.out.println(myHeap.getHeap());
        
        myHeap.insert(75);
        System.out.println(myHeap.getHeap());

        // remove
        System.out.println("remove -------");
        Heap myHeap1 = new Heap();
        myHeap1.insert(95);
        myHeap1.insert(75);
        myHeap1.insert(80);
        myHeap1.insert(55);
        myHeap1.insert(60);
        myHeap1.insert(50);
        myHeap1.insert(65);

        System.out.println(myHeap1.getHeap());

        myHeap1.remove();
        System.out.println(myHeap1.getHeap());

        myHeap1.remove();
        System.out.println(myHeap1.getHeap());
        /*
            Expected output
            ---------------
            [95, 75, 80,, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]
         */
    }
}
