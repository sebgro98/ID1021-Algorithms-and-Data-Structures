package HP35_Dynamic;

public class Main {

    public static void main (String[] args) {
        Item[] items = {new Item(5), new Item(3), new Item(4), new Item(5), new Item(8),
                new Item(5), new Item((ItemType.ADD)), new Item((ItemType.ADD)) };

        Calculator calc = new Calculator(items);
        System.out.println(calc.run());

        /*Stack stack = new Stack();
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);
        stack.push(6);


        stack.show();*/
    }
}


