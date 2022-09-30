package ödev1;

public class MükemmelSayi {
public static void main(String[] args) {
	
	int number=28;
	int total=0;
	for(int i=1; i<number;i++) {
		
		if(number%i==0) {
		
		System.out.println(i);
		total=total+i;
		}
		
	}
	
	System.out.println(total);
	if(number==total) {
	System.out.println("Sayınız mükemmler sayıdır");
	}
	else {
		System.out.println("Sayınız mükemmel sayı değildir");
	}
}
}
