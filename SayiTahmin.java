
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

	private static int getRandomNumberInRange(int min, int max) 
	{
		if (min >= max) {
		throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	static boolean findNumber(int random,int tahmin)
	{
		if(tahmin<random)
			System.out.println("Eksik Söyledin");
		
		else if(tahmin>random)
			System.out.println("Fazla Söyledin");
			
		else if(tahmin==random) 
		{
			System.out.println("Bravo, bildiniz. Tuttuðum sayý "+tahmin+" idi.");
			return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int min,max,randomSayi,tahminiSayi;
		boolean kontrol=false;
		System.out.println("Tuttuðum sayýyý bulabilecek misin?");
		System.out.print("Aralýk girin ( 100 999 gibi) : ");
		min=input.nextInt();
		max=input.nextInt();
		randomSayi=getRandomNumberInRange(min,max);
		do 
		{
			if(!kontrol) 
			{
				System.out.print("Tahmin et : ");
				tahminiSayi=input.nextInt();
				kontrol=findNumber(randomSayi,tahminiSayi);
			}	
		}while(!kontrol);
		System.out.println("\nGüle güle... ");
	}
}