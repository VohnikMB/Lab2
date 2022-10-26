package Institute;

import java.util.ArrayList;

public class Institute {
    public ArrayList<Group> groups = new ArrayList<>();
    public String instituteName;

    public Institute(ArrayList<Group> groups,String instituteName){
        this.groups=groups;
        this.instituteName=instituteName;
    }
}
