package Recursion;

public class IncrementAdder {
    public static int AddSequence(int end, int Incre){
        if(end <= 0){
            return 0;
        }
        return end+AddSequence(end-Incre, Incre);
    }
}
