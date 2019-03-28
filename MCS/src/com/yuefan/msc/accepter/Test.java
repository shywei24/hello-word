package com.yuefan.msc.accepter;

public class Test {

	public static int count = 1 ;
	public static String msg1 = "08 03 00 00 00 01 84 93" ;
	public static String msg2 = "08 03 00 02 00 02 65 52" ;
	public static String msg3 = "08 03 00 03 00 03 F5 52" ;
	public static String getMsg(){
		System.out.println(count);
		if(count == 1){
			count++ ;
			return msg1;
		}else if (count == 2){
			count++ ;
			return msg2;
		}else if (count == 3){
			count++ ;
			return msg3;
		}
		return null;
	}
	
    public static byte[] hexToByte(String hex){
    	hex = hex.replaceAll(" ", "");
//		System.out.println(hex);
        int m = 0, n = 0;
        int byteLen = hex.length() / 2;
        byte[] ret = new byte[byteLen];
        for (int i = 0; i < byteLen; i++) {
            m = i * 2 + 1;
            n = m + 1;
            int intVal = Integer.decode("0x" + hex.substring(i * 2, m) + hex.substring(m, n));
            ret[i] = Byte.valueOf((byte)intVal);
        }
        return ret;
    }
    
	public static String bytesToHexString(byte[] src){  
	    StringBuilder stringBuilder = new StringBuilder("");  
	    if (src == null || src.length <= 0) {  
	        return null;  
	    }  
	    int n = 0 ;
	    for (int i = 0; i < src.length; i++) {
	        int v = src[i] & 0xFF;  
	        String hv = Integer.toHexString(v);  
	        if (hv.length() < 2) {  
	            stringBuilder.append(0);  
	        }  
	        stringBuilder.append(hv);
	        if (++n % 16 ==0 ) {
		        stringBuilder.append("\n");
			}else {
				stringBuilder.append(" ");
			}
	        
	    }  
	    return stringBuilder.toString();  
	}
}
