import java.util.*;

//https://www.interviewbit.com/problems/disjoint-intervals/ read the link
public class MaxDisjointIntervals {


    static int maxDisjointIntervals(ArrayList<ArrayList<Integer>> ans){

        //sort the list first wrt to the starting point
        Collections.sort(ans, (p1,p2)->p1.get(0)-p2.get(0));
        //there will be atleast one interval disjointed, then start the count with 1, and take current end to compare

        int count =1;
        int currEnd = ans.get(0).get(1);
        for(int i=1; i<ans.size(); i++){

            // if end of the first element is greater, then this will be the part of the same interval,
            // so do not increase the count and update the end with minimum one
             if(currEnd >= ans.get(i).get(0)){
                 currEnd = Math.min(currEnd,ans.get(i).get(1));
             }
             //otherwise increase the count and update the current end with the next one and return the count
             else{

                 count ++;
                 currEnd = ans.get(i).get(1);
             }
        }return count;
    }


    public static void main(String[] args) {

    }
}
