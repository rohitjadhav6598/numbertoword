import java.util.Scanner;

public class Englishdigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int num = scan.nextInt();
			if(num==-1)
				break;
			System.out.println(inttoword(num));
		}
		scan.close();
	}
	
	static String inttoword(int num) {
		String sindig[] = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String dbdig[] = new String[] {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
		String tenmul[] = new String[] {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		if(num>=0 && num<=9) {
			return sindig[num];
		}
		else if(num>=10 && num<=19) {
			return dbdig[num-10];
		}
		else if(num>=20 && num<=99) {
			return tenmul[num/10]+" "+sindig[num%10];
		}
		else if(num>=100 && num<=999) {
			return sindig[num/100]+" "+"Hundred"+" "+inttoword(num%100);
		}
		else if(num>=1000 && num<=999999) {
			return inttoword(num/1000)+" "+"Thousand"+" "+inttoword(num%1000);
		}
		else if(num>=1000000 && num<=999999999) {
			return inttoword(num/1000000)+" "+"Million"+" "+inttoword(num%1000000);
		}
		else {
			return "work in progress";
		}
	}

}
