public class Ukeoppgaver1 {


    public static int min(int [] a){
        //Initialiserer  med første element
        int minValue = a [0];
        int minIndex = 0;

        //Looper over alle resterende elementer og sjekker
        //om vi finner et mindre tall
        for(int i = 1; i < a.length; i++){
            int value = a [i];
            int index = i;

            //Sjekker om verdien vi har er mindre enn tidligere.
            if(value < minValue){
                minValue = value;
                minIndex = index;
            }
        }
        //Returnerer indexen til minste tall
        return  minIndex;
    }



    public static void main(String [] args) {
        int [] a = {8,4,17,10,6,20,1,11,15,3,18,9,27,19};

        //Kaller opp metoden
        int minIndex = min(a);

        //Utskrift
        System.out.println(minIndex);
        System.out.println(a[minIndex]);


    }
}
