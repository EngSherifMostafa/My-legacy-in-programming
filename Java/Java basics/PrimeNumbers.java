       while(true){
            int startNum, stopNum = -1, amount;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter amount of numbers: ");
            amount = input.nextInt();
            
            while(amount > 0){
                startNum = 2;
                stopNum++;
                
                for( ;stopNum > startNum; startNum++) {                 
                    if(stopNum % startNum == 0)
                        break;
                }
                if(stopNum == startNum){
                    System.out.print(stopNum + "\t");
                    amount--;
                    
                    if(amount % 5 == 0)
                        System.out.println();
                }
            }
        }