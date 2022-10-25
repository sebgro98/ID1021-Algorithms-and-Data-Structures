public class Paths {

    City[] path;
    int sp;
    public Paths() {
        path = new City[54];
        sp = 0;
    }
    private Integer shortest(City from, City to, Integer max) {

        if (max < 0)
            return null;
        if (from == to)
            return 0;
        Integer shrt = null;
        for (int i = 0; i < sp; i++) {
            if (path[i] == from)
                return null;
        }
        path[sp++] = from;
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
        path[sp--] = null;
        return null;
        return shrt;
    }

}
