public class Array {

    public  Array(int size){
        int myArray [] = new int[size];

        for(int i=0;i<size;i++){
            myArray[i] = (i+1);
        }
        for (int j=0;j<size;j++){
            System.out.println("myArray"+j+" Contains "+myArray[j]);
        }
    }

    public void ArrayThings(){
        int myArray [] = new int[6];
        int rand,count=1;

        while(count<6){
            rand = (int) (Math.random() * 49) + 1;
            

        }

        for (int j=0;j<myArray.length;j++){
            System.out.println("myArray"+j+" Contains "+myArray[j]);
        }

    }
}
