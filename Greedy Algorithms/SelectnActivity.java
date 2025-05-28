import java.util.*;
public class SelectnActivity{
    public static void main(String[] args) {
        int startTime[]={10,12,20};
        int Endtime[]={20,25,30};
        // Arrange endTime in ascending order
        int activities[][]=new int[startTime.length][3];
        for (int i = 0; i < startTime.length; i++) {
            activities[i][0]=i;
            activities[i][1]=startTime[i];
            activities[i][2]=Endtime[i];
        }

        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
       int maxActivity=0;
        ArrayList<Integer>list=new ArrayList<>();

       maxActivity=1;
       list.add(0);
        int lastEndTime;
        lastEndTime=Endtime[0];

        for (int i = 1; i < startTime.length; i++) {
            if (startTime[i]>=lastEndTime) {
                maxActivity++;
                list.add(i);
                lastEndTime=Endtime[i];
            }
        }

        System.out.println("Maximum Activity "+maxActivity);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("A"+list.get(i)+" ");
        }
    }
}