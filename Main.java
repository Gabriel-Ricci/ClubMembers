import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        ClubMembers club = new ClubMembers();
        
        
        
        String[] names = {"SMITH, JANE", "FOX, STEVE", "XIN, MICHAEL", "GARCIA, MARIA"};
        club.addMembers(names, 2019);
        
        
        ArrayList<MemberInfo> members = club.getMemberList();
        members.set(0, new MemberInfo("SMITH, JANE", 2019, false));
        members.set(1, new MemberInfo("FOX, STEVE", 2018, true));
        members.set(2, new MemberInfo("XIN, MICHAEL", 2017, false));
        members.set(3, new MemberInfo("GARCIA, MARIA", 2020, true));
        
        
        club.printMembers();
        
       
        ArrayList<MemberInfo> graduated = club.removeMembers(2018);
        
        
        club.printMembers();
        
        
        for (MemberInfo member : graduated) {
            System.out.println(member);
        }
    }
}
