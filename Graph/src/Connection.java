public class Connection {
     City neighbors;
    Integer distance;

    public Connection(City neighbors, Integer distance) {
        this.neighbors = neighbors;
        this.distance = distance;
    }

    public void print() {
        System.out.print("City: " + neighbors.name + ", Distance: " + distance);
    }
}

