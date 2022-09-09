import java.util.Scanner;

public class SavingsAccountDemo {
	public static void main(String[] args) {
		
		int count = 0;
		double balance, deposit, total = 0, countsw = 0, counting = 0, withdraw, totalw = 0, AIR;

		
		@SuppressWarnings("resource")
		Scanner numbers = new Scanner(System.in);
		
		System.out.print("Enter beginning balance :$");
		balance = numbers.nextDouble();
		
		System.out.print("Enter interest rate(whole number) :%");
		AIR = numbers.nextDouble();
		

		menu();
		
		
		do {
			
			String choice;
			@SuppressWarnings("unused")
			double counts = 0, number = 1, numberw = 1, feecharge, totalfeecharge;
			
			SavingsAccount account = new SavingsAccount(balance, AIR);
			
			
			
			System.out.print("");
			choice = numbers.nextLine();
			
			
			
			 if (choice.equals("M") && counting > 1) {
				System.out.print("Your Balance after Monthly process is: "); 
			    System.out.printf("%.2f\n", (account.getmonthlyprocess3()));
			    menu();
			}
			
			if (choice.equals("E") && counting > 1) {
				System.out.print("Balance: $" + account.getmonthlyprocess3() + "\n");
				System.out.print("Thank you. Bye");
				break;
			}
			
			else if (choice.equals("M") && account.getnumberofwithdraws(countsw) > 4 && counting == 0) {
				System.out.print("Your Balance after Monthly process is: ");
			    System.out.printf("%.2f\n",(account.getmonthlyprocess2() - 1.01));
				menu();
				
			}
			
			
			if (choice.equals("X")) {
					try {
						account.getError2();
					} catch (InvalidChoice e) {
						System.out.print(e.getMessage());
					}
					System.out.print("\n");
					menu();
				
			}
			
			
			if (choice.equals("B") && account.getnumberofwithdraws(countsw) < 4) {
				System.out.print("Your Balance is: "); 
			    System.out.printf("%.2f\n", (account.getFinalBalance()));
			    menu();
			}
			
           else if (choice.equals("B") && account.getnewamountD(total) == 28 && counting > 1) {
				
				System.out.print("Your Balance is: ");
				System.out.printf("%.2f\n", (account.getnewamountD(total) - 4));
				menu();
			}
			
			
			else if(choice.equals("B") && account.getamountd(total) == 10) {
				System.out.print("Your Balance is: ");
				System.out.printf("%.2f\n", (account.getnewamountD(total)));
				counting++;
				menu();
			}
		
			
			
			
			else if (choice.equals("B") && account.getnumberofwithdraws(countsw) > 4 && account.getnumberofwithdraws(countsw) <= 5) {
				
				totalfeecharge = account.feechargeW(totalw);
				
				System.out.print("Your Balance is: " );
				System.out.printf("%.2f\n", (totalfeecharge));
				menu();
			}
			
			else if (choice.equals("B") && account.getnumberofwithdraws(countsw) > 5 && account.getnumberofwithdraws(countsw) <= 7) {
				
				System.out.print("Your Balance is: ");
				System.out.printf("%.2f\n", account.feechargeW2(totalw) -1);
				menu();
			}
			
			
			else if (choice.equals("W") && account.getnewamountD(total) > 25) {
				System.out.print("Enter the amount you want to withdraw: ");
				withdraw = numbers.nextDouble();
				countsw ++;
				counting++;
				if (withdraw < 0) {
					try {
						account.getError();
					} catch (InvalidValue e) {
						System.out.print(e.getMessage());
					}
					menu();
				}
				
				else if(withdraw > 0) {
					totalw += withdraw;
					account.getamountofwithdraws(totalw);
					account.getnumberofwithdraws(countsw);
					menu();
					if (account.getnumberofwithdraws(countsw) > 4) {
						account.fees(countsw);
						feecharge = account.getFinalBalance()-1;
					}
					menu();
					
				}
			}
			
	      
			
			else if (choice.equals("W") && account.getfeechargeW(totalw) < 25) {
				try {
					account.getError4();
				} catch (InactiveAccountError e) {
					System.out.print(e.getMessage());
				}
				menu();
			}
			
			
			else if (choice.equals("D")) {
					System.out.print("Enter the amount you want to Deposit :$");
					deposit = numbers.nextDouble();
					if (deposit < 0) {
						try {
							account.getError();
						} catch (InvalidValue e) {
							System.out.print(e.getMessage());
						}
						System.out.print("\n");
						menu();
					}
					else if (deposit > 0 && countsw == 0) {
						counts += number;
						total += deposit;
						account.getamountofdeposits(total);
						menu();
	
					}
					
					else if (deposit > 0 && countsw > 0) {
						counts += number;
						total += deposit;
						account.getamountd(total);
						account.getactiveD(total);
						menu();
					}
					

			}
		
			
			
			else if (choice.equals("W")) {
				System.out.print("Enter the amount you want to withdraw :$");
				withdraw = numbers.nextDouble();
				countsw ++;
				if (withdraw < 0) {
					try {
						account.getError();
					} catch (InvalidValue e) {
						System.out.print(e.getMessage());
					}
					menu();
				}
				
				else if(withdraw > balance) {
					try {
						account.getError3();
					} catch (InvalidTransaction e) {
						System.out.print(e.getMessage());
					}
					menu();
				}
				
				else if(withdraw > 0 && account.getnumberofwithdraws(countsw) <= 4) {
					totalw += withdraw;
					account.getamountofwithdraws(totalw);
					account.getnumberofwithdraws(countsw);
					account.activeorinactiveW2(totalw, countsw);
					menu();
				}
				
					
				else if (withdraw > 0 && account.getnumberofwithdraws(countsw) > 4) {
					    totalw += withdraw;
					    account.getamountofwithdraws(totalw);
					    account.getnumberofwithdraws(countsw);
					    account.activeorinactiveW2(totalw, countsw);
						feecharge = account.getFinalBalance()-1;
						System.out.print("\n");
						menu();
					
				}
			}
			
			
			else if (choice.equals("M") && account.getnumberofwithdraws(countsw) < 4) {
				System.out.print("Your Balance after Monthly process is: ");
				System.out.printf("%.2f\n", account.getmonthlyprocess());
				menu();
			}
			
			
			else if (choice.equals("E") && account.getnumberofwithdraws(countsw) < 4) {
				System.out.print("Balance : $"); 
			    System.out.printf("%.2f\n", account.getmonthlyprocess());
				System.out.print("Thank you. Bye\n");
				break;
			}
			
			else if (choice.equals("E") && account.getnumberofwithdraws(countsw) > 4) {
				System.out.print("Balance : $"); 
			    System.out.printf("%.2f\n", account.getmonthlyprocess2() - 1.01);
				System.out.print("Thank you. Bye\n");
				break;
			}
			
		
			
	
		} while (count != 25);
		
		
	}
	
	public static void menu() {

		
		System.out.print("Enter D to deposit\n");
		System.out.print("Enter W to Withdraw\n");
		System.out.print("Enter B for Balance\n");
		System.out.print("Enter M for Monthly Process\n");
		System.out.print("Enter E to Exit\n");
		
	}
}
