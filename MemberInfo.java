import java.util.ArrayList;


public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;
    
    
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }
    
    
    public int getGradYear() {
        return gradYear;
    }
    
    
    public boolean inGoodStanding() {
        return hasGoodStanding;
    }
    
    
    public String getName() {
        return name;
    }
    
    
    public String toString() {
        return name + ", " + gradYear + ", " + hasGoodStanding;
    }
}