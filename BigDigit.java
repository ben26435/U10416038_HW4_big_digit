import java.util.*;
//U10416038  Ma Chia-Liang

class BigDigit{
	//datafields
	String firstnumber;
	String secondnumber;
	ArrayList<Integer> firList = new ArrayList<>();
	ArrayList<Integer> secList = new ArrayList<>();
	ArrayList<Integer> ans = new ArrayList<>();
	
	int last;
	int i,f,s,n,a;
	//Constructor
	BigDigit(String firstnumber,String secondnumber){
		this.firstnumber = firstnumber;
		this.secondnumber = secondnumber;
		StringtoArray1(firstnumber);
		StringtoArray2(secondnumber);
		checkArraysize(firstnumber,secondnumber);
		plus(firList,secList);
		
	}
	//The method let String firstnumber Enter the ArrayList firList
	void StringtoArray1(String firstnumber){
		for(n =firstnumber .length()-1;n>=0;n--){
			firList.add(Integer.valueOf(String.valueOf(firstnumber.charAt(n))));
		}
	}
	//The method let String secondnumber Enter the ArrayList secList
	void StringtoArray2(String secondnumber){
		for(n =secondnumber .length()-1;n>=0;n--){
			secList.add(Integer.valueOf(String.valueOf(secondnumber.charAt(n))));
		}
	}
	//Check two Lists Sizes add 0 to short one
	void checkArraysize(String firstnumber,String secondnumber){
		
		
		if(firstnumber.length()>secondnumber.length()){
			//Use loop to add 0 to secList
			for(n = 0;n<(firstnumber.length()-secondnumber.length());n++){
				secList.add(0);
				
			}
		}
		if(secondnumber.length()>firstnumber.length()){
			//Use loop to add 0 to firList
			for(n = 0;n<(secondnumber.length()-firstnumber.length());n++){
				firList.add(0);
				
			}
		
		}
	}
	//Method to plus two ArrayList
	void plus(ArrayList firList,ArrayList secList){
		
		//Use loop to plus the int in ArrayList in order
		for(i = 0;i<firList.size()-1;i++){
			
			f =	(int)(firList.get(i));
			s = (int)(secList.get(i));
			n = (f+s);
			//if two int plus smaller then 10 ,let n add to ansArrayList
			if(n<10){
				ans.add(n);
			}//if if two int plus bigger then 10, let n-10 add to ansArrayList
			//and let firList next int add 1
			else if(n>=10){
				ans.add(n-10);
				firList.set((i+1),((int)(firList.get(i+1))+1));
				
			}
			last = (int)(firList.get(firList.size()-1)) + (int)(secList.get(firList.size()-1));
		
			
		
		}
		//Print the result
		System.out.print("The Add is");
		//Use Loop to print ans
		System.out.printf("%d",last);
		for(i = ans.size()-1;i>=0;i--){
				a =(int)(ans.get(i));
				System.out.printf("%d",a);
			
				
			}	
		}
		
	}



