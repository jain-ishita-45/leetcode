class RideSharingSystem {
    Queue<Integer>rider, driver;

    public RideSharingSystem() {
        rider=new LinkedList<>();
        driver=new LinkedList<>();
        
    }
    
    public void addRider(int riderId) {
        rider.offer(riderId);
        
    }
    
    public void addDriver(int driverId) {
        driver.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(driver.isEmpty() || rider.isEmpty())
        return new int []{-1,-1};
        int r=rider.poll();
        int d=driver.poll();
        return new int[]{d,r};
    }
    
    public void cancelRider(int riderId) {
        ArrayList<Integer> temp=new ArrayList<>();
        while(!rider.isEmpty())
        {
            int r=rider.poll();
            if(r==riderId)
            continue;
            temp.add(r);
        }
        for(int i:temp)
        rider.offer(i);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */