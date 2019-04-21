import java.util.Scanner;

public class Television {

	// The purpose is studying for midterm
	// Mert Mehmet Ezgin 03.04.19
	static int c;
	public static class TV{
		String Manufacturer="Samsung";
		int Screen_size=155,Channel=2,Volume=20,x,y;
		static int c;
		boolean PowerOn =false;
		public static void counterInc() {
			c++;
		}
		public static void counterDec() {
			c--;
		}
		
		public String getBrand() {
			 
			return Manufacturer;
		}
		
		public int getSize() {
			 
			return Screen_size;
		}
		
		public void SetIVolume() {
			
			counterInc();
			Volume=Volume+c;
			
		}
		public int GetIVolume() {
			
			return Volume;
		}
		
		public void SetDVolume() {
			counterDec();
			Volume=Volume+c;
					
		}
		public int GetDVolume() {
			return this.Volume;
		} 
		
		public void SetChannel(int Channel) {
			this.Channel=Channel;
		}
        public int GetChannel() {
        	return this.Channel;
        }
        public void SetPowerOn(boolean PowerOn) {
        	this.PowerOn = PowerOn;
        	
        }
        public boolean GetPowerOn() {
        	
        	return this.PowerOn=PowerOn;
        }
		
	}
	public static void Run() {
		Starting_Message();
		Menu();
	}
	public static void Starting_Message () {
		TV t1= new TV();
		System.out.println("A "+t1.getSize()+" inch "+t1.getBrand() +" has been turned on. ");
	}
	public static void Menu() {
		TV t1= new TV();
		
		System.out.println(" 1-Set Channel\n 2-Increase Volume \n 3-Decrease Volume \n 4-PowerOff \n");
		Scanner sc1 = new Scanner(System.in);
		String x=sc1.nextLine();
		if(x.equals("1")) {
			PickChannel();
		}
		else if(x.equals("2")) {
			IncreaseVolume();
			Menu();
		}
		else if(x.equals("3")) {
			DecreaseVolume();
			Menu();
		}
		else if(x.equals("4")) {
			PowerOff_Menu();
		}
		else {
			System.out.println(" Error !!! Invalid choose. Please choose between 1-4 integer selection !!! ");
			Menu();
		}
		
	}
	public static void PickChannel() {
		TV t1=new TV();
		System.out.println("What channel do you want? \n");
		Scanner sc1 = new Scanner(System.in);
		int x=sc1.nextInt();
		t1.SetChannel(x);
		System.out.println("Channel is: "+t1.GetChannel()+"\n");
		Menu();
	}
	
public static void IncreaseVolume() {
	TV t1 = new TV();
	t1.SetIVolume();
	System.out.println("Volume increased to:  "+ t1.GetIVolume()+"\n");
}
public static void DecreaseVolume() {
	TV t1 = new TV();
	t1.SetDVolume();
	System.out.println("Volume decreased to:  "+ t1.GetDVolume());
}
public static void PowerOff_Menu() {
	
	System.out.println("Power is OFF !!! \n 1- Turn On the TV.\n 2-Exit the program "+"\n");
	Scanner sc1 = new Scanner(System.in);
	String x=sc1.nextLine();
	if(x.equals("1")) {
		Run();
	}
	if(x.equals("2")) {
		String x1;
		System.out.println("Are you sure to exit the program ? (Y/N \n"); 
		Scanner sc3 = new Scanner(System.in);
		x1= sc3.nextLine();
		if (x1.equals("Y")   || x1.equals("y")) {
			//
			System.out.println("Program succesfully closed !");
			System.exit(0);
	}
		else if  (x1.equals("N")   || x1.equals("n")) {
			PowerOff_Menu();
		}
	}
		else {
			System.out.println(" Error !!! Invalid choose. Please choose between 1-2 integer selection !!! ");
			PowerOff_Menu();
	}
}

	public static void main(String[] args) {
	
		Run();
	

	}

}