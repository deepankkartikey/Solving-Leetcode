class UndergroundSystem {

    // Arrival class to store information in format
    // of id, station name and time
    class ArrivalInfo{
        int id;
        String stationName;
        int time;
        
        ArrivalInfo(int id, String stationName, int time){
            this.id = id;
            this.stationName = stationName;
            this.time = time;
        }
    }
    
    // Arrivals Map stores id -> arrivalInfo for each customer
    Map<Integer, ArrivalInfo> arrivals;
    
    // total Map stores startStation_endStation -> {totalTime, count of visits} for each journey
    Map<String, double[]> total;
    
    public UndergroundSystem() {
        arrivals = new HashMap<>();
        total = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        // put arrival info for each checkin record using id as key and class as value
        arrivals.put(id, new ArrivalInfo(id, stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        ArrivalInfo arrival = arrivals.get(id);
        String key = arrival.stationName+"_"+stationName;
        // either update record for start_end OR create a new one
        double[] pair = total.getOrDefault(key, new double[2]);
        // total_time = destination_time - arrival_time
        int time = t-arrival.time;
        pair[0] += time;
        // update count of source_destination journeys
        pair[1] ++;
        total.put(key, pair);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation+"_"+endStation;
        double[] pair = total.get(key);
        return pair[0]/pair[1];
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */