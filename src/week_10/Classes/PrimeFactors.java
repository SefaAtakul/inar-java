package week_10.Classes;

public class PrimeFactors {
    private int[] primeFactors;
    private  int size ;

    public PrimeFactors(int number){
        primeFactors =new int[number];
    }
    public void push(int number){
        if (size >= primeFactors.length){
            int [] temp =new int[primeFactors.length*2];
            System.arraycopy(primeFactors,0,temp,0,primeFactors.length);
            primeFactors=temp;
        }
        primeFactors[size++]=number;
    }
    public int pop(){
        return primeFactors[--size];
    }
 public boolean empty(){
        return size == 0;
 }
    public int getSize(){
        return size;
    }
public int [] getPrimeFactors(){
        return primeFactors;
}
}
