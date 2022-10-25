public class City {
    String name;
    Connection[] connections;
    Integer pointer = 0;

    public City(String name) {
        this.name = name;
        this.connections = new Connection[0];
    }

    public void addConnection(City city, Integer distance) {
        makeBigger();
        connections[pointer++] = new Connection(city, distance);
    }
    public void makeBigger() {
        Connection[] temp = new Connection[connections.length + 1];
        for (int i = 0; i < connections.length; i++)
            temp[i] = connections[i];
        connections = temp;
    }

    public void print() {
        System.out.print("Name: " + name + " | ");
        System.out.print("Connections: ");
        int i = 0;
        System.out.print("{");
        while (i < connections.length) {
            System.out.print("City: " + connections[i].neighbors.name + " - Distance: " + connections[i].distance + ", ");
            i++;
        }
        System.out.println("}");


    }


}

