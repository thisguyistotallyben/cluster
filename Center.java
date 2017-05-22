// Author:  Benjamin Johnson
// Purpose: Holds all the data for things (model)

/* TODO
pretty much everything
*/

package cluster;


class ClusterControl {
    int speed;
    int rpm;
    int flevel;
    int odometer;
    int trip;
    int temp;
    boolean highBeams;
    boolean leftTurn;
    boolean rightTurn;
    boolean hazards;
    
    // go-getters
    public int getMPH()           { return speed;     }
    public int getKPH()           { return speed;     }
    public int getRPM()           { return rpm;       }
    public int getFuelLevel       { return flevel;    }
    public int getOdometer()      { return odometer;  }
    public int getTrip()          { return trip;      }
    public int getTemperature()   { return temp;      }
    public boolean getHighBeams() { return highBeams; }

    // constructor
    public ClusterControl() {
        // 
    }
}
