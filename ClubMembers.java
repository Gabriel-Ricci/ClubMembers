import java.util.ArrayList;
public class ClubMembers {
    private ArrayList<MemberInfo> memberList;
    
    
    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }
    
    
    public void addMembers(String[] names, int gradYear) {
        for (int i = 0; i < names.length; i++) {
            MemberInfo member = new MemberInfo(names[i], gradYear, true);
            memberList.add(member);
        }
    }
    
    
    
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedGoodStanding = new ArrayList<MemberInfo>();
        
        
        for (int i = memberList.size() - 1; i >= 0; i--) {
            MemberInfo member = memberList.get(i);
            
            
            if (member.getGradYear() <= year) {
                
                if (member.inGoodStanding()) {
                    graduatedGoodStanding.add(member);
                }
                
                memberList.remove(i);
            }
        }
        
        return graduatedGoodStanding;
    }
    
    
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }
    
    
    public void printMembers() {
        for (MemberInfo member : memberList) {
            System.out.println(member);
        }
    }
}

