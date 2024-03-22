package ArraysPractice;
//Find the leader element in the element
//example array ={90,30,-1,3,-2,40,0}
//leader element in the array are 90,40,0
//an element in the array is said to be a leader element if there
//do not exist an element greater than that element on the right hand
//side of tha array from that position
public class nine {
    public static void findLeader(int []x)
    {
        boolean flag=false;
        int i;
        for (i=0;i<x.length;i++){
            int key=x[i];
            for(int j=i+1;j<x.length; j++){
                if(!(key>x[j])){
                    flag=false;
                    break;
                }
                else{
                    flag=true;
                }

            }
            if(flag){
                System.out.println(x[i]+ " is leader element");
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={90,30,-1,3,-2,40,0};
        findLeader(arr);

    }
}
