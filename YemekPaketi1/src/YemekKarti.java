import java.util.Scanner;

public class YemekKarti {
	public static void main(String[] args) {
		
		
String YemekİslemSecenekleri  = "bakiye Görüntüleme --> 1\n"	
+"İstediğiniz yemekleri seçiniz-->2\n  " ;

String  Yemekler=
"tost seçimi için 3 e basınız = 20 tl -->3\n";


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
				
	
	double 	OgrencıBakiye=100;
	String OgrencıKartId="1";
	String OgrencıSifre="101";	
	
	double AkadamısyenBakiye=100;
	String AkadamısyenKartId="2";
	String AkadamısyenSifre="102";	
	
	double PersonelBakiye=100;	
	String PersonelKartId="3";	
	String PersonelSifre="103";	
	
	System.out.println("Yemek Paketi Seçimine Hoşgeldiniz");
	System.out.println("Lütfen Bilgilerinizi Giriniz");
	
	System.out.print("Kullanıcı Adı");
	String KullaniciAdi=scanner.nextLine();
	
	System.out.print("Şifre");
	String Sifre=scanner.nextLine();
	
	
	
	
	
	if ( KullaniciAdi.equals("1") && Sifre.equals("101") )
	{
		System.out.println("Öğrenci hesabına giriş yapıldı");
	System.out.println(YemekİslemSecenekleri );	
	System.out.println("lütfen bir seçim yapınız: ");
	String secim = scanner.nextLine();
	switch (secim)
	{ case "1":
	System.out.println("Bakiyeniz:" + OgrencıBakiye );
	break;
	case "2":
	System.out.println("Almak istediğiniz ürünü seçiniz");	
	System.out.println(Yemekler );	
	case "3":
	int cekilecekTutar=scanner.nextInt();
	OgrencıBakiye=100-20; 


	if (OgrencıBakiye>=cekilecekTutar)
	{
		
	
System.out.println("Kalan Tutar: " + OgrencıBakiye );
		
		}
	else {
		System.out.println("Bakiyenizden fazla ürün alamazsınız");
	}
	break;
	}
	}
	
	
	
	
	
	else if ( KullaniciAdi.equals("2") && Sifre.equals("102") )
	{
		System.out.println("Akademisyen hesabına giriş yapıldı");
		System.out.println(YemekİslemSecenekleri );	
		System.out.println("lütfen bir seçim yapınız: ");
		String secim = scanner.nextLine();
		switch (secim)
		{ case "1":
		System.out.println("Bakiyeniz:" + AkadamısyenBakiye );
		break;
		case "2":
		System.out.println("Almak istediğiniz ürünü seçiniz");	
		System.out.println(Yemekler );	
		case "3":
		int cekilecekTutar=scanner.nextInt();
		AkadamısyenBakiye=100-20; 


		if (AkadamısyenBakiye>=cekilecekTutar)
		{
			
		
	System.out.println("Kalan Tutar: " + AkadamısyenBakiye );
			
			}
		else {
			System.out.println("Bakiyenizden fazla ürün alamazsınız");
		}
		break;
		}
		}
	
	
	
	
	
	
	else if ( KullaniciAdi.equals("3") && Sifre.equals("103") )
	{
		System.out.println("Personel hesabına giriş yapıldı");
		System.out.println(YemekİslemSecenekleri );	
		System.out.println("lütfen bir seçim yapınız: ");
		String secim = scanner.nextLine();
		switch (secim)
		{ case "1":
		System.out.println("Bakiyeniz:" +  PersonelBakiye );
		break;
		case "2":
		System.out.println("Almak istediğiniz ürünü seçiniz");	
		System.out.println(Yemekler );	
		case "3":
		int cekilecekTutar=scanner.nextInt();
		PersonelBakiye=100-20; 


		if (PersonelBakiye>=cekilecekTutar)
		{
			
		
	System.out.println("Kalan Tutar: " + PersonelBakiye );
			
			}
		else {
			System.out.println("Bakiyenizden fazla ürün alamazsınız");
		}
		break;
		}
		}
	
	
	
	else 
	{
		System.out.println("Giriş için yanlış yetki veya şifre ");
	}
	
	
	
	}

}
