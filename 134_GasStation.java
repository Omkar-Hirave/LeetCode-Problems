class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0 , total_cost = 0;
        for(int i = 0 ; i < gas.length ; i++){
            total_gas = total_gas + gas[i];
            total_cost = total_cost + cost[i];
        }
        if(total_cost > total_gas){
            return -1;
        }
        int remaining_fuel = 0 , start = 0 ;
        for(int i = 0 ; i < gas.length ; i++){
            remaining_fuel = remaining_fuel + (gas[i] - cost[i]);
            if(remaining_fuel < 0){
                remaining_fuel = 0;
                start = i+1 ; 
            }
        }
        return start; 
    }
}