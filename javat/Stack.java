package javat;
public class Stack<A>{
	private Object[] na=new Object[0];
	public void add(A ad){
		Object[] temp=new Object[na.length+1];
		for(int i=0;i<na.length;i++){
			temp[i]=na[i];
		}
		temp[na.length]=ad;
		na=temp;
	}
	public A get(int i){
		return (A)na[i];
	}
	public void remove(int i){
		Object[] temp=new Object[na.length-1];
		for(int a=0;a<na.length-1;a++){
			if(a>=i){
				temp[a]=na[a+1];
			}else temp[a]=na[a];
		}
	}
	public void destroy(){na = new Object[0];}
}