public class Main {

    public static void main (String[] args) {
        ALinkedQueue node = new ALinkedQueue();

        node.add(1);
        //node.add(2);
        //node.add(3);
        //node.add(4);
        //node.printForward();
        node.remove();
        node.printForward();

        ArrayQueue array = new ArrayQueue(5);
        System.out.println("add three items");
        array.add(1);
        array.add(2);
        array.add(3);
        array.show();System.out.println(" ");
        System.out.println("pop first item");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("add two new items");
        array.add(4);
        array.add(5);
        array.show();
        System.out.println(" ");
        System.out.println("add 6 to first place");
        array.add(6);
        array.show();
        System.out.println(" ");
        System.out.println("pop second item");
        array.remove();
        array.show();
       System.out.println(" ");
        System.out.println("add 7 to second place");
        array.add(7);
        array.show();
        System.out.println(" ");
        System.out.println("pop third item");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("add 8 to third place ");
        array.add(8);
        array.show();
        System.out.println(" ");
        System.out.println("add 9 to last place and make array bigger");
        array.add(9);
        array.show();
        System.out.println(" ");
        System.out.println("add 10 to last place");
        array.add(10);
        array.show();
        System.out.println(" ");
        System.out.println("add 11 to last place");
        array.add(11);
        array.show();
        System.out.println(" ");
        System.out.println("add 12 to last place");
        array.add(12);
        array.show();
        System.out.println("add 12 to last place");
        array.add(13);
        array.show();
        System.out.println("add 12 to last place");
        array.add(14);
        array.show();
        System.out.println(" ");
        System.out.println("pop 1st item");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("pop 2st item");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("pop 3rd item");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("pop 4th item");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("pop 5th");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("pop 6th");
        array.remove();
        array.show();
        System.out.println(" ");
        System.out.println("pop 7th");
        array.remove();
        array.show();




    }

}
