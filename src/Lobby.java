/**
 * Created by iliubetska on 23.08.2016.
 */
public class Lobby {
    public String machineName;
    public int machine_id;
    public String topPanelFeatures;
    public String bottomPanelFeatures;
    public String adventureQuest;

    public Lobby(String machineName, int machine_id, String topPanelFeatures, String bottomPanelFeatures, String adventureQuest){
        System.out.println("The main components of Slotomania Lobby are: " + "machineName is " + machineName + "," + "machine_id is " + machine_id + "," + "topPanelFeatures are " + topPanelFeatures + ", " + "bottomPanelFeatures are " + bottomPanelFeatures + ", " + "adventureQuest is " + adventureQuest);

    }
}
