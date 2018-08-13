package tutorials;

public class byteShortInt {
	public static void main(String[] args) {
		//LISB = long,int,short,byte
		//		 64   32  16    8
		
		//Width == 64
		long longValue = 100L;
		
		//INT has width of 32
		int myValue = 10_000;
		int maxValue = 1_000_000;
		
		//SHORT has width of 16
		short shortValue = 3;
		
		//BYTE has width of 8
		byte byteValue = 12;
		byte newByteValue = (byte) (byteValue/2);
		
		System.out.println(newByteValue);
		
	}
}
