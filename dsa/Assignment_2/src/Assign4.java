
public class Assign4{
	
	public static int calculate(int op1,char opr,int op2) {
		switch(opr) {
		   case '+': return op1 + op2;
		   case '-': return op1 - op2;
		   case '*': return op1 * op2;
		   case '/': return op1 / op2;
		   case '%': return op1 % op2;
		   case '$': return (int) Math.pow(op1, op2);
		   
		}
		return 0;
	}
	
	public static int prefixEvaluation(String[] arr) {
		 int[] st  = new int[10];
		 int top=-1;
		 
		 for(int i=arr.length-1;i>=0;i--) {
				
			 String token = arr[i].trim();
			 if (token.isEmpty()) {
		         continue;
		     }
			 char el= token.charAt(0);
			
			if(Character.isDigit(el)) {
				int num  = el -'0';
				st[++top]=num;
			}
			else {
				int op1 = st[top--];
				int op2 = st[top--];
				int res = calculate(op1,el,op2);
				st[++top] =res;
			}
		}
		
		return st[top];
	}
	
	public static int  postfixEvaluation(String[] arr) {
		 int[] st  = new int[10];
		 int top=-1;
		
		 
		for(int i=0;i<arr.length;i++) {
			
			 String token = arr[i].trim();
			 if (token.isEmpty()) {
		         continue;
		     }
			 char el= token.charAt(0);
			
			if(Character.isDigit(el)) {
				int num  = el -'0';
				st[++top]=num;
			}
			else {
				int op2 = st[top--];
				int op1 = st[top--];
				int res = calculate(op1,el,op2);
				st[++top] =res;
			}
		}
		
		return st[top];
	}


	public static void main(String[] args) {

		
		String expr = "1 2 +"; 
        String[] arr = expr.split(" ");
        int result = postfixEvaluation(arr);
        System.out.println("Postfix evaluation result: " + result);
        
        String expr2 = "+ 1 2 "; 
        String[] arr2 = expr2.split(" ");
        int res = prefixEvaluation(arr2);
        System.out.println("Prefix evaluation result: " + res);

	}

}
