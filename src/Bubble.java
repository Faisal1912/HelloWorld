public class Bubble {

    static void bubble(int [] a){
        int begin = 0;
        int end = a.length-1; //Ikke inkluderer 6 tallet

        for(int i = begin; i<end; i++){    //For og iF --> O(n^2)
            if(a[i] > a[i+1]){
                //BYTT. Hvis 0 posisjon/1ern. Hvis 1'ern er større enn det tallet som står etter den. Bytter plass
                // -> INVERSJON
                int temp = a[i];
                a[i] = a[i+1]; // a[0] = 9
                a[i+1] = temp; // a[1] = a[0] =9
            }
            else{
                //Gjør ingenting
            }
            System.out.print(a[0]);
            for(int j = 1; j < a.length; j++){
                System.out.print( ", " + a[j]);
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        int [] a = {1, 9, 2, 4,7,6};

        bubble(a);
        //Samme som for(int i = 0; i<a.lenght; i++) hvor k=a[i]
        for(int k : a){
            System.out.println(k);

        }
    }


}
