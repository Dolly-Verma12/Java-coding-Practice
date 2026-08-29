//https://leetcode.com/problems/minimum-total-price-after-applying-discounts/
public class TotalDiscount {

   
    public static double minPrice(int[] prices, int[] discounts) {
       double ans=0;
       int st=-1;
       int st1=-1;
       int len=prices.length;
       int count=0;
       for(int i=0;i<len;i++){
        int max=prices[0];
        int max1=discounts[0]; 
            for(int j=1;j<prices.length;j++){
                if(max<prices[j]){
                     if(st!=j){
                        max=prices[j];
                        st=j;
                      }System.out.println(max);
            }
                for(int k=0;k<discounts.length;k++){
                  
                if(max1<discounts[k]){
                     if(st1!=k){
                        max1=discounts[k];
                        st1=k;
                      
                }
            }
          
        }
        }
         
        // System.out.println(max);
        // System.out.println(max1);
        double ans1=max*(100-max1)/100;
        ans=ans+ans1;
        // System.out.println(ans1);
       }  return ans;
    }


public static void main(String[] args){
    int[]p={10,30,21};
    int []d={50,60};
    minPrice(p,d);
    // System.out.print(minPrice(p,d));
}
}