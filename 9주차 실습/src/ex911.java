
public class ex911 {
	
	//1
	boolean odd(int n) {
		if(n%2 == 1)
			return true;
		else
			return false;
	}
	
	//3
	int min(int[] data) {
		int min = data[0];
		for(int i=1; i<data.length; i++) {
			if(data[i]<min)
				min = data[i];
		}
		return min;
	}

}
