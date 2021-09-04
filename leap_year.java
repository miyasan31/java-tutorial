
class leap_year{
	int uruudosi(int a){
		int b;
		if((a % 4 == 0 && a % 100 != 0 )|| a % 400 == 0){
			b = 29;
		}
		else{
			b = 28;
		}
		return b;
	}
	
}

