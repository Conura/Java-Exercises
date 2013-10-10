class AirplaneTestDrive {
	public static void main(String[] args) {
	
	int x = 0;
	
	
	Airplane[] Haddock = new Airplane[3];
	
	while (x < 3) {
		
		Haddock[x] = new Airplane();
		
		Haddock[x].name = ("Aeroplane_number " + x + " is a ");
		
		Haddock[x].size = x;
		
		System.out.print(Haddock[x].name);
		
		Haddock[x].aircraftType(3);
		
		x++;
		
		}	
	}
}