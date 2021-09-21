
class Example {
	
	boolean odd(int a) {
		if(a%2==1)
			return true;
		else
			return false;
	}
	
	int min(int[] dat) {
		int min=dat[0];
		for(int i=1; i<dat.length; i++) {
			if(dat[i]<min)
				min = dat[i];
		}
		return min;
	}

}
