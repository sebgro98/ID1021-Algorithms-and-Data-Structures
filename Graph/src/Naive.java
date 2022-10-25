public class Naive {

    public static void main(String[] args) {
    Map foo = new Map("C:\\Users\\sushi\\OneDrive\\Skrivbord\\Algorithmer\\Upp10\\trains.csv");

    Paths better = new Paths();

    String from = "MalmÃ¶";
    String to = "Stockholm";
    Integer max = 300;

    long t0 = System.nanoTime();
    Integer dist = shortest2(foo.lookup(from), foo.lookup(to), max);
    long time = (System.nanoTime() - t0)/1_000;
        System.out.println("shorest: " + dist + " min (" + time + " ms)");
/*
    long t2 = System.nanoTime();
    Integer bdist = better.shortest(foo.lookUpCity(from), foo.lookUpCity(to), max);
    long btime = (System.nanoTime() - t2)/1_000;
        System.out.println("shorest: " + bdist + " min (" + btime + " ms)");
*/
}

    private static Integer shortest(City from, City to, Integer max) {
        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
            int i = 0;
            while (from.connections[i] != null) {
                Connection conn = from.connections[i];
                Integer distance = shortest(to, from, max - conn.distance);
                if(distance != null) {
                    distance += conn.distance;
                    if (shrt == null) {
                        shrt = distance;
                    }
                    else if(distance.compareTo(shrt) > 0) {
                        shrt = distance;
                    }
                }
            }
        return shrt;
        }



    private static Integer shortest1(City from, City to, Integer max)
    {
        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
        int i = 0;
        while(i < from.connections.length)
        {
            Connection conn = from.connections[i++];
            Integer ret = shortest(conn.neighbors, to, max-conn.distance);
            if(ret != null)
            {
                ret += conn.distance;
                if(shrt == null)
                    shrt = ret;
                else if(shrt.compareTo(ret) > 0)
                    shrt = ret;
            }
        }
        return shrt;
    }

    private static Integer shortest2(City from, City to, Integer max) {
        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
        for (int i = 0; i < from.connections.length; i++) {
            if (from.connections[i] != null) {
                Connection conn = from.connections[i];
                Integer totDist = shortest(conn.neighbors, to, max-conn.distance);

                if (totDist != null && (shrt == null || (shrt > totDist + conn.distance))) {
                    shrt = totDist + conn.distance;
                }
            }
        }
        return shrt;
    }

}
