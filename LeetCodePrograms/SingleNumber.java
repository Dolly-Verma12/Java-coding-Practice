public class SingleNumber {
    public static void main(String[] args){
        int num[]={4,2,1,1,4,2,9};
        for(int i=0;i<num.length;i++){
            boolean ch=false;
            int N=num[i];
           
            for(int j=0;j<num.length;j++){
                if(i!=j&&N==num[j]){
                    ch=true;
                    break;
                }
            }
            if(!ch){
                System.out.println(N);
            }
        }
    }
    }

