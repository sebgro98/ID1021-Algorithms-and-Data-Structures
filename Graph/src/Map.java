import java.io.BufferedReader;
import java.io.FileReader;

public class Map {
    int antal = 1;
    private City[] cities;
    private final int mod = 541;

    public Map(String file) {
        cities = new City[mod];
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                City one = lookup(row[0]);
                City two = lookup(row[1]);
                Integer dist = Integer.valueOf(row[2]);
                one.addConnection(two, dist);
                two.addConnection(one, dist);
            }

        } catch (Exception e) {
            System.out.println(" file " + file + " not found or corrupt");
        }
    }

    private Integer hash(String name) {
        int hash = 7;
        for (int i = 0; i < name.length(); i++) {
            hash = (hash * 31 % mod) + name.charAt(i);
        }
        return hash % mod;
    }

    public City lookup(String name) {
        Integer index = hash(name);
        while (cities[index] != null) {

            if (cities[index].name.equals(name)) {
                return cities[index];
            }
            index++;
        }
            if (cities[index] == null) {
                cities[index] = new City(name);

            }
        return cities[index];

        }

    public void print() {

        int amount = 0;
        City temp;
        for (int i = 0; i < cities.length; i++) {

            temp = cities[i];
            if (temp != null)
            {
                System.out.println(cities[i]);
                amount++;
                System.out.print("(" + temp.connections.length + ") " + temp.name + ":: ");
                if (0 < temp.connections.length)
                    System.out.print("{ " + temp.name);
                for (int j = 1; j < temp.connections.length; j++)
                    System.out.print(", " + temp.connections[j].neighbors.name);
                System.out.print(" }");
                System.out.println();
            }
        }


    }
    public void print1(){
        int checks = 1;
        for(City city : cities){
            if(city != null){
                System.out.println(checks++);
                city.print();
            }
        }
    }


}



