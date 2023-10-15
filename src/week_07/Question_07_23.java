package week_07;

public class Question_07_23 {
    public static void main(String[] args) {
        boolean [] lockers = new boolean[100];
        makeAllArrayFalse(lockers);
        findOpenLockers(lockers);


    }
    public static boolean [] makeAllArrayFalse(boolean [] lockers){
        for (int i = 0; i <lockers.length ; i++) {
            lockers[i]=false;
        }
        return lockers;
    }
    public static void findOpenLockers(boolean [] lockers){
        for (int i = 0; i < lockers.length; i++) {
            lockers[i]=true;

        }

        for (int i = 2; i < lockers.length; i++) {
            for ( int j = i; j < lockers.length ; j+=i) {
               if (lockers[j]==true){
                   lockers[j]=false;
               }else {
                   lockers[j]=true;
               }
            }

        }

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]==true){
                System.out.printf("%s%d%s","L",i," ");
            }

        }

    }
}
