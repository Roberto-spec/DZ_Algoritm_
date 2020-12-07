public class Main {
    public static void main(String[] args) {
        int steps=1;
        int hard=0;
        System.out.println("This test with algoritm <vstavka>");
        for (int i = 10; i <= 100; i += 10) {
            System.out.println("Step: "+steps+" with "+i+" elments of massiv");
            Mass massiv= new Mass(i);
            System.out.println("Sort the array 100 times and calculating the average difficulty of sorting");
            hard=0;
            for(int y=0;y<100;y++) {
                massiv.zapolnenie();
                hard += massiv.sort();
            }
            hard=hard/100;
            System.out.println("average difficulty of sorting: "+hard);
            steps++;
            System.out.println();
        }
    }

}
class Mass{
    int[] masiv;
    Mass(int n){
        //System.out.println("Create massiv with n elements");
        masiv=new int[n];
    }
    void zapolnenie(){
        //System.out.println("Create massiv with n elements");
        for(int i=0;i< masiv.length;i++){
            masiv[i]=10+(int)(Math.random()*(double)(90));
        }
    }
    int sort(){
        //System.out.println("Calculating difficulty of sorting");
        int hard=0;
        for (int i = 1; i < masiv.length; i++) {
            hard++;
            hard++;
            int key = masiv[i];
            hard++;
            int j = i - 1;
            while (j >= 0 && masiv[j]> key) {
                hard++;
                hard++;
                masiv[j + 1]= masiv[j];
                hard++;
                j = j - 1;
            }
            hard++;
            masiv[j + 1]= key;
        }
        return hard;
    }
    void show(){
        for(int i=0;i< masiv.length;i++){
            System.out.println(masiv[i]+", ");
        }
    }




}



