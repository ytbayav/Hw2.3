package hashMap;

public class HashMapService {
	
	String[] key;
	String [] value;
	
	String[] tempKey;
	String[] tempValue;
	
	public HashMapService() {
		
		key= new String[0];
		value = new String[0];
		
		
	}
	
	public void add(String key1, String value2) {
		tempKey = key;
		tempValue = value;
		
		key =new String[this.tempKey.length+1];
		value = new String [tempKey.length+1];
		
		
		for (int i = 0; i<tempKey.length;i++) {
			key[i] = tempKey[i];
			value[i] = tempValue [i];
			
		}
		
		key[key.length-1] = key1;
		value[value.length-1] = value1;
		
		System.out.println();
		
		
	}

}
