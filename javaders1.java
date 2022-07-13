import java.util.Locale;
import java.util.Scanner;

public class javaders1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int bakiye = 1000;
		int islem;
		
		
		System.out.println("1; Bakiye Görüntüleme");
		System.out.println("2; Para Yatırma");
		System.out.println("3; Para Çekme");
		System.out.println("4: SİSTEMDEN ÇIKIŞ");
		
		islem = scan.nextInt();
		
		
		switch(islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakiye + "tl 'dir ");
			break;
		case 2:
			System.out.println("Ne kadar yatıracaksınız ? ");
			int miktar = scan.nextInt();
			
			bakiye = bakiye + miktar;
			
			System.out.println("Yeni Bakiyeniz: " + bakiye + "tl 'dir");
			break;
		case 3:
			System.out.println("Ne kadar çekeceksiniz ?");
			miktar = scan.nextInt();
			
			bakiye = bakiye - miktar;
			
			if (miktar > bakiye) {
				System.out.println("Çekeceğiniz miktar yatıracağınızdan büyük tekrar deneyiniz.");
			}
			else {
				System.out.println("Yeni Bakiyeniz: " + bakiye + "tl 'dir");
			}
			
			break;
		case 4:
			System.out.println("Sistemden Çıkılıyor...");
			break;
		default:
			System.out.println("Geçersiz İşlem...");
			break;
			
		}
	}
		
}