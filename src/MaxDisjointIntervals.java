import java.util.*;

//https://www.interviewbit.com/problems/disjoint-intervals/ read the link
public class MaxDisjointIntervals {
    static int maxDisjointIntervals(ArrayList<ArrayList<Integer>> ans){
        Collections.sort(ans, (p1,p2)->p1.get(0)-p2.get(0));
        int count =1;
        int currEnd = ans.get(0).get(1);
        for(int i=1; i<ans.size(); i++){
             if(currEnd >= ans.get(i).get(0)){
                 currEnd = Math.min(currEnd,ans.get(i).get(1));
             }
             else{
                 count ++;
                 currEnd = ans.get(i).get(1);
             }
        }return count;
    }


    public static void main(String[] args) {

    }
}
