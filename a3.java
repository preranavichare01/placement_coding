import java.util.Stack;

public class a3 {
    public static void main(String[] args) {
        int stock[]={100,80,60,70,60,85,100};
        int span[]=new int [stock.length];
        stockSpan(stock,span);
        for (int i=0;i<span.length;i++){
            System.out.println(span[i]+"");
        }
    }

    public static void stockSpan(int stocks[],int span []){
        Stack <Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){ // Start from index 1
            int curr=stocks[i]; // Corrected variable name
            while(!s.isEmpty() && stocks[s.peek()]<=curr){
                s.pop();
            }
            span[i] = s.isEmpty() ? i + 1 : i - s.peek();
            s.push(i);
        }
    }
}
