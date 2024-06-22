import java.util.*;
public class Timecoverter {
    public static void main (String[]  args){
        Scanner sc =new Scanner(System.in);

       System.out.println("Enter a year ");
        int year=sc.nextInt();

        System.out.println("Enter a month ");
        int month=sc.nextInt();

        System.out.println("Enter a day ");
        int day=sc.nextInt();
         
        System.out.println("Enter a hour ");
        int hour=sc.nextInt();

        System.out.println("Enter a min ");
        int min=sc.nextInt();


        hour+=5;
        min+=30;

        if(min>=60){
            hour++;
            min-=60;
        }

        if(hour>=24){
            day++;
                    hour-=24;
        }

        if(day>31){
            month++;
            day-=31;

        }

        if(month>12){
            year++;
            month-=12;
            

        }
        

        System.out.println("year " +" Month :" +"day:"  +"hour :" +"minute :" );
        System.out.println( " " + year  +" " + month +" " + day  +" "+ hour  +" "+ min);

    }

    }