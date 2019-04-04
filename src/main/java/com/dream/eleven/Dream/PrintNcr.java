package com.dream.eleven.Dream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNcr {
	// Java program to print all combination of size r in an array of size n 
	static List<List<Integer>> validTeams = new ArrayList<>();


		/* arr[] ---> Input Array 
		data[] ---> Temporary array to store current combination 
		start & end ---> Staring and Ending indexes in arr[] 
		index ---> Current index in data[] 
		r ---> Size of a combination to be printed */
		static void combinationUtil(int arr[], int data[], int start, 
									int end, int index, int r) 
		{ 
			// Current combination is ready to be printed, print it
			List<Integer> list = new ArrayList<>();
			if (index == r) 
			{ 
				
				for (int j=0; j<r; j++) {
					list.add(data[j]);
					//System.out.print(data[j]+",");
				}
				if(checkValidTeam(list)){
					validTeams.add(list);
				//System.out.println(list.toString());
				}
				//System.out.println(""); 
				return; 
			} 

			// replace index with all possible elements. The condition 
			// "end-i+1 >= r-index" makes sure that including one element 
			// at index will make a combination with remaining elements 
			// at remaining positions 
			for (int i=start; i<=end && end-i+1 >= r-index; i++) 
			{ 
				data[index] = arr[i]; 
				combinationUtil(arr, data, i+1, end, index+1, r); 
			} 
		} 
static boolean checkValidTeam(List<Integer> list){
	//List<Integer> teamA = Arrays.asList(1,2,3);
	//List<Integer> teamB = Arrays.asList(4,5,6);
	List<Integer> teamA = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
	List<Integer> teamB = Arrays.asList(12,13,14,15,16,17,18,19,20,21,22);
	if(matchingMembers(list,teamA)>=8 || matchingMembers(list,teamB)>=8||
			matchingMembers(list,teamA)<=3 || matchingMembers(list,teamB)<=3){
		return false;
	}
	return true;
	
}

static int matchingMembers(List<Integer> list,List<Integer> team){
	int count =0;
	for(Integer member : list){
		if(team.contains(member)){
			count++;
		}
	}
	return count;
}
		// The main function that prints all combinations of size r 
		// in arr[] of size n. This function mainly uses combinationUtil() 
		static void printCombination(int arr[], int n, int r) 
		{ 
			// A temporary array to store all combination one by one 
			int data[]=new int[r]; 

			// Print all combination using temprary array 'data[]' 
			combinationUtil(arr, data, 0, n-1, 0, r); 
		} 

		/*Driver function to check for above function*/
		public static void main (String[] args) { 
			int arr[] = {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22}; 
			//int arr[] = {1, 2, 3, 4, 5,6};
			int r = 11; 
			int n = arr.length; 
			printCombination(arr, n, r); 
			long teamCount =0;
			//validTeams.forEach(a-> System.out.println(a));
			for(List<Integer> team : validTeams){
				teamCount++;
			}
			System.out.println(teamCount);
			

			List<String> names = Arrays.asList("dhoni", "dhawan", "kohli", "rohit", "raina", "jaddu", "ashwin", "bhuvi",
					"bumrah", "kaul", "sharma", "decock", "warner", "abd", "lynn", "munro", "russel", "stokes", "tahir",
					"tye", "malinga", "rashid");
			List<String> type = Arrays.asList("wk", "bat", "bat", "bat", "bat", "ar", "ar", "bowl", "bowl", "bowl", "bowl",
					"wk", "bat", "bat", "bat", "bat", "ar", "ar", "bowl", "bowl", "bowl", "bowl");
			List<String> credits = Arrays.asList("10", "11", "9.5", "8.5", "8", "9", "8.5", "9.5", "8.5", "8.5", "8", 
												"9","10", "9", "9", "8.5", "9", "8.5", "9", "8.5", "8.5", "8");
			ProcessPlayerDetails.assignPlayers(names, type, credits,validTeams);
		} 
	} 


