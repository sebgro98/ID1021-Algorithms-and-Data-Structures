package HP35;

public class Main {

    public static void main (String[] args) {
        Item[] items = {new Item (5), new Item (3), new Item((ItemType.MUL))};
        Calculator calc = new Calculator(items);
        //System.out.println(calc.run());

        Stack stack = new Stack();

        stack.push(6);
        stack.push(6);
        stack.pop();
        stack.push(6);


        stack.show();
    }
}


