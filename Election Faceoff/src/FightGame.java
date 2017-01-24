import java.util.ArrayList;
import java.util.Scanner;
public class FightGame
	{
		static ArrayList <Characters> lineup = new ArrayList <Characters>();
		static ArrayList <Characters> myPick = new ArrayList <Characters>();
		static String name;
		static String attack;
		static Characters player;
		static int aiChoice;
		static Characters computorAI;
		public static void main(String[] args)
			{
			makeArray();
			setUp();
			playing();
			}
		public static void makeArray()
			{
			lineup.add(new Characters ("Donald Trump", 1000000000, "Republican", "The Wall", "Mass Deportation", "Extreme Vetting", "Twitter Storm"));
			lineup.add(new Characters ("Ted Cruz", 10000, "Republican", "Annoyingness", "Monotone", "Establishment Smash", "Caucus System"));
			lineup.add(new Characters ("John Kasich", 10000, "Rebublican", "Establishment Smash", "Old-Timey Policy", "Ohio", "Stayin in the race"));
			lineup.add(new Characters ("Jeb Bush", 10, "Republican", "Please Clap", "Low Energy, poorly worded attack", "General Patheticness", "Scrapin' for Money"));
			lineup.add(new Characters ("Bernie Sanders", 20000, "Democrat", "Socialism", "Millenial Horde", "Marx-KO", "Free College"));
			lineup.add(new Characters ("Hillary Clinton", 10000, "Democrat", "Delete the Emails", "Lie", "Blame the Russians", "Establishment Smash"));
			lineup.add(new Characters ("Jill Stein", 1, "Green", "Tree Huggin' Takedown", "Recounts", "Global Warming", "Third Party Pin"));
			lineup.add(new Characters ("Gary Johnson", 5, "Libertarian", "Freedom-to-everything", "Aleppo", "Sane-Alternative Suplex", "Third Party Pin"));
			}
		public static void computorSelect()
			{
			aiChoice = (int)(Math.random()* 8); 
			computorAI = lineup.get(aiChoice);
			System.out.println("Your opponent is " + computorAI.getName() + ". Their health is " + computorAI.getHealth() + ".");
			}
		public static void selection()
			{
			System.out.println();
			for (Characters c : myPick)
				{
				System.out.println("You have chosen " + c.getName() + "! Your health is " + player.getHealth() + ".");
				}
			System.out.println();
			computorSelect();
			System.out.println();
			}
		public static void selectionThirdParty()
			{
			System.out.println();
			System.out.println("You have chosen the " + player.getParty() + "! Your candidate is " + player.getName() + " and your health is " + player.getHealth());
			System.out.println();
			computorSelect();
			System.out.println(); 
			} 
		public static void setUp()
			{
			java.util.Scanner userInput = new Scanner(System.in);
			System.out.println("Hero! What is your name?");
			name = userInput.nextLine();
			System.out.println(name + "! A worthy name indeed! Tell me " + name + "...which party do you wish to fight for today?");
			System.out.println();
			System.out.println("(1) The Republicans");
			System.out.println("(2) The Democrats");
			System.out.println("(3) The Libertarians");
			System.out.println("(4) The Green Party");
			java.util.Scanner userInput1 = new Scanner(System.in);
			int selection;
			selection = userInput.nextInt();
			System.out.println();
			if (selection == 1)
				{
				System.out.println("Ahh, the Republicans. A good choice indeed! Now tell me, who would you like to fight with today? Please choose the number!");
				System.out.println();
				for (int i = 0; i <= 3; i++)
					{
					System.out.println("(" + (i+1) + ") " + lineup.get(i).getName());
					}
				java.util.Scanner userInput2 = new Scanner(System.in);
				int fighter;
				fighter = userInput.nextInt();
				if (fighter == 1)
					{
					player = lineup.get(0);
					myPick.add(lineup.get(0));
					selection();
					}
				else if (fighter == 2)
					{
					player = lineup.get(1);
					myPick.add(lineup.get(1));
					selection();
					}
				else if (fighter == 3)
					{
					player = lineup.get(2);
					myPick.add(lineup.get(2));
					selection();
					}
				else if (fighter == 4)
					{
					player = lineup.get(3);
					myPick.add(lineup.get(3));
					selection();
					}
				else 
					{
					System.exit(0);
					}
				}
			else if (selection == 2)
				{
				System.out.println("You have chosen the Democrats! A respectable pick! Now, which candidate will you represent?");
				System.out.println();
				for (int i = 4; i <= 5; i++)
					{
					System.out.println("(" + (i-3) + ") " + lineup.get(i).getName());	
					}
				java.util.Scanner userInput3 = new Scanner(System.in);
				int fighter;
				fighter = userInput.nextInt();
				if (fighter == 1)
					{
					player = lineup.get(4);
					myPick.add(lineup.get(4));
					selection();
					}
				else if (fighter == 2)
					{
					player = lineup.get(5);
					myPick.add(lineup.get(5));
					selection();
					}
				else 
					{
					System.exit(0);
					}
				}
			else if (selection == 3)
				{
				player = lineup.get(7);
				myPick.add(lineup.get(7));
				selectionThirdParty();
				}
			else if (selection == 4)
				{
				player = lineup.get(6);
				myPick.add(lineup.get(6));
				selectionThirdParty();
				}
			else 
				{
				System.out.println("Sorry fam. That option doesn't even exist");
				System.exit(0);
				}
			}
		public static void playing()
			{
			boolean stillPlaying = true;
			while (stillPlaying == true)
				{
				playGame();
				if (computorAI.getHealth() <= 0)
					{
					stillPlaying = false;
					System.out.println("Great job! You've won!!");
					System.exit(0);
					}
				computorMove();
				if (player.getHealth() <= 0)
					{
					stillPlaying = false;
					System.out.println("You've lost the election...better luck next time!");
					System.exit(0);
					}	
				}
			}
		public static void fightFightFight()
			{
			int power;
			if (player.getMove1() == lineup.get(0).getMove1() || player.getMove2() == lineup.get(0).getMove2() || player.getMove3() == lineup.get(0).getMove3() || player.getMove4() == lineup.get(0).getMove4())
				{
				power = (int)(Math.random()* 200000) + 100000; 
				computorAI.setHealth((computorAI.getHealth()) - power);
				if (computorAI.getHealth() < 0)
					{
					computorAI.setHealth(0);
					}
				System.out.println("You have chosen " + attack + "! " + player.getName() + " does " + power + " in damage. " + computorAI.getName() + "'s health is now " + computorAI.getHealth());
				}
			else
				{
				power = (int)(Math.random()* 700) + 800; 
				computorAI.setHealth((computorAI.getHealth()) - power);
				if (computorAI.getHealth() < 0)
					{
					computorAI.setHealth(0);
					}
				System.out.println("You have chosen " + attack + "! " + player.getName() + " does " + power + " in damage. " + computorAI.getName() + "'s health is now " + computorAI.getHealth());
				}
			}
		public static void playGame()
			{
			System.out.println("Here are your moves. Choose wisely");
			System.out.println("(1) " + player.getMove1());
			System.out.println("(2) " + player.getMove2());
			System.out.println("(3) " + player.getMove3());
			System.out.println("(4) " + player.getMove4());
			java.util.Scanner userInput4 = new Scanner(System.in);
			int selection;
			selection = userInput4.nextInt();
			System.out.println();
			if (selection == 1)
				{
				attack = player.getMove1();
				fightFightFight();
				}
			else if (selection == 2)
				{
				attack = player.getMove2();
				fightFightFight();
				}
			else if (selection == 3)
				{
				attack = player.getMove3();
				fightFightFight();
				}
			else if (selection == 4)
				{
				attack = player.getMove4();
				fightFightFight();
				}
			else 
				{
				System.out.println("Not an option. You've lost a turn.");
				}
			}
		public static void computorMove()
			{
			String move =
				null;
			int choice;
			choice = (int)(Math.random()* 4); 
			if (choice == 0)
				{
				move = computorAI.getMove1();
				}
			else if (choice == 1)
				{
				move = computorAI.getMove2();
				}
			else if (choice == 2)
				{
				move = computorAI.getMove3();
				}
			else if (choice == 3)
				{
				move = computorAI.getMove4();
				}
			int attack;
			if (computorAI.getMove1() == lineup.get(0).getMove1() || computorAI.getMove2() == lineup.get(0).getMove2() || computorAI.getMove3() == lineup.get(0).getMove3() || computorAI.getMove4() == lineup.get(0).getMove4())
				{
				attack = (int)(Math.random()* 200000) + 100000; 
				player.setHealth((player.getHealth()) - attack);
				if (player.getHealth() < 0)
					{
					player.setHealth(0);
					}
				System.out.println(computorAI.getName() + " uses " + move + ". Their attack does " + attack + " damage. Your new health is " + player.getHealth());
				System.out.println();
				}
			else
				{
				attack = (int)(Math.random()* 700) + 800; 
				player.setHealth((player.getHealth()) - attack);
				if (player.getHealth() < 0)
					{
					player.setHealth(0);
					}
				System.out.println(computorAI.getName() + " uses " + move + ". Their attack does " + attack + " damage. Your new health is " + player.getHealth());
				System.out.println();
				}
			}
	}
