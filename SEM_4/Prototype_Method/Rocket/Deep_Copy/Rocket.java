package SEM_4.Prototype_Method.Rocket.Deep_Copy;
import java.util.*;

public class Rocket {
    private List<String> RocketList;

        public Rocket()
        {
            this.RocketList = new ArrayList<String>();
        }

        public Rocket( List<String> list)
        {
            this.RocketList = list;
        }

        public void InsertData()
        {
            RocketList.add("SpaceX Starship");
            RocketList.add("SpaceX Falcon Heavy");
            RocketList.add("NASA Orion");
            RocketList.add("NASA Saturn 5");            
        }

        public List<String> getRocketList()
        {
            return this.RocketList;
        }

        @Override
        public Object clone() throws CloneNotSupportedException
        {
            List<String> tempList = new ArrayList<>();

            for(String s: this.RocketList)
            {
                tempList.add(s);
            }
            return new Rocket(tempList);
        }
}
