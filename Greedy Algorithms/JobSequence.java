import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class JobSequence {
    static class JOB {
        char id;
        int deadline;
        int profit;

        public JOB(char id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    
        
    }
    public static void main(String[] args) {
        int JobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<JOB>jobs=new ArrayList<>();
        for (int i = 0; i < JobsInfo.length; i++) {
            char ch=(char)(65+i);
            jobs.add(new JOB(ch,JobsInfo[i][0],JobsInfo[i][1]));
        }
        //     JOB []jobsArr=new JOB[JobsInfo.length];
        // for (int i = 0; i < JobsInfo.length; i++) {
        //     char ch=(char)(65+i);
        //     jobsArr[i]=new JOB(ch,JobsInfo[i][0],JobsInfo[i][1]);
        // }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        // // Sort jobsArr by deadline in ascending order
        // Arrays.sort(jobsArr, (obj3, obj4) -> obj3.deadline - obj4.deadline);


          ArrayList<Character>seq=new ArrayList<>();
             int time=0;
             int maxprofit=0;
        for(int i=0;i<JobsInfo.length;i++){
                     JOB curr=jobs.get(i);
            if(curr.deadline>time){
                time++;
                maxprofit+=curr.profit;
                seq.add(curr.id);

                
            }

        }
        System.out.println("MaxProfit "+maxprofit);
        System.out.println("MAx JOBS "+seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
            
        }





    }
  
    
}
