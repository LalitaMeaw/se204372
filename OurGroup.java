import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Thanapat Wongtungjaroensuk");
	    groupMembers.add("Nuttawat Juntawong");      
        groupMembers.add("Pooriwat Poolab");//PUT YOUR NAME HERE
        groupMembers.add("Lalita Apirakausanee");//PUT YOUR NAME HERE
        groupMembers.add("Chatchaya Promrin"); //PUT YOUR NAME HERE
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
