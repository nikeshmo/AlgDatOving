public class AlgDataOving {

    public static void main(String[] args){
        System.out.println("Hei AlgDat!");

        System.out.println("Teller til 10");

        for (int i =1; i <= 10; i++){
            System.out.println(i);
        }

        int [] a = {8,5,2,77,12,1,5,1};

        //finne det indexen til det minste tallet
        int min_index = min(a);
        System.out.println(min_index);

    }

    static int min(int [] a) {
        int min_index = 0;

        for (int i=0; i<a.length; i++){
            if (a[min_index]>a[i]){
                min_index = i;
            }
        }

        return min_index;
    }
}
