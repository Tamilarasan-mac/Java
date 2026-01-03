public class Binary_search{
    public static int binarySearch(int[]marks , int find){
    int low = 0 , high = marks.length-1;
        while (low <= high){
            int mid = (low + high)/2;
        if(marks [mid]==find) 
            return mid;
        else if (find < marks[mid])
            high = mid-1;

        else 
            low = mid+1;


        }
        return-1;
}
public static void main(String[] args){
        int[] marks ={98,95,85,97,100};
        int find = 100;
        int result = binarySearch(marks, find);
        if (result == -1)
        System.out.println("Mark not found");
        else
        System.out.println("Mark Founded :" + result);
        


}









}


