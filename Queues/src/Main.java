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

        ArrayQueue array = new ArrayQueue();
        array.push(1);
        array.push(2);
        array.push(3);
        array.push(4);
        array.push(5);
        System.out.println("Only pushed 5 items");
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Adding Nr: 6 to first place");
        array.push(6);
        array.show();
        System.out.println(" adding Nr: 7 to last place and making array bigger");
        array.push(7);
        array.show();
        System.out.println(" adding 4 more to the last place ");
        array.push(8);
        array.push(9);
        array.push(10);
        array.push(11);
        array.show();
        System.out.println(" bajs ");
        array.push(12);
        array.push(13);
        array.push(14);
        array.push(15);
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();
        System.out.println(" Popping Nr: " + array.getPopped());
        array.pop();
        array.show();




        /*array.show();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        System.out.println(" poping Nr: " + array.getPoped());
        array.pop();
        array.show();
        System.out.println(" adding more to the last place ");
        array.show();
        //array.push(12);
*/


    }

}
