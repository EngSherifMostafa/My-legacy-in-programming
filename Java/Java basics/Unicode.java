        int unicodeCount = 65535;
        String toBin, toInt, toHex;
        PrintWriter UnicodeMap;
        
        try {
            UnicodeMap = new PrintWriter("UnicodeMap.txt");
            
            for(int i = 0 ; i <= unicodeCount ; i++) {
                //get equivalent binary
                toBin = "";
                int comple = 16 - Integer.toBinaryString(i).length();
                for (int rep = 1; rep <= comple; rep++)
                    toBin += "0";
                toBin += Integer.toBinaryString(i);

                //get equivalent decimal
                if(i < 10) toInt = "0000" + i;
                else if(i < 100) toInt = "000" + i;
                else if(i < 1000) toInt = "00" + i;
                else if(i < 10000) toInt = "0" + i;
                else toInt = Integer.toString(i);

                //get equivalent hexadecimal
                switch (Integer.toHexString(i).length()) {
                    case 1:
                        toHex = "000" + Integer.toHexString(i);
                        break;
                    case 2:
                        toHex = "00" + Integer.toHexString(i);
                        break;
                    case 3:
                        toHex = "0" + Integer.toHexString(i);
                        break;
                    default:
                        toHex = Integer.toHexString(i);
                        break;
                }

                UnicodeMap.println(toBin + "\t" + toInt + "\t\t" + toHex + "\t\t" + (char)i);
            }
            UnicodeMap.close();
        }
        
        catch (IOException exp) {
            System.out.println(exp);
        }