
/*Reverse a string using stack
 
asked by: microsoft,paytm, flipkart,amazon
 */

 import java.util.*;
 
public class a2 {
    public static     String reverse(String str){
        Stack <Character>s=new  Stack<>();
int index=0;
while(index<str.length()){
    s.push(str.charAt(index));
    index++;

}
StringBuilder res=new StringBuilder("");
while ((!s.isEmpty())) {
    char curr=s.pop();
    res.append(curr);

    
}
return  res.toString();
    }      
    public static void main(String[] args) {
        String str="abc";
    
       
        String res=reverse(str);
        System.out.println(res);
    }
}
