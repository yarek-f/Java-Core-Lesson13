package lviv.lgs.ua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Faction {

	String factionName;
	List<Deputy> deputies = new ArrayList<>();

	public Faction(String name) {
		this.factionName = name;
	}

	public String getFactionName() {
		return factionName;
	}

	public List<Deputy> getDeputies() {
		return deputies;
	}

	public void setName(String name) {
		this.factionName = name;
	}

	public void setDeputies(List<Deputy> deputies) {
		this.deputies = deputies;
	}

	@Override
	public String toString() {
		return "Faction [FactionName = " + factionName + ", deputies = " + deputies + "]";
	} 

	public void addDeputy() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter weight of deputy !");
		int inputWeight = s.nextInt();
		System.out.println("Enter growth of deputy !");
		int inputGrowth = s.nextInt();
		System.out.println("Enter first name of deputy !");
		String inputFirstName = s.next();
		System.out.println("Enter surname of deputy !");
		String inputLastName = s.next();
		System.out.println("Enter age of deputy !");
		int inputAge = s.nextInt();
		System.out.println("If the deputy is bribes enter: true !\nIf the deputy isn't bribes enter: false !");
		boolean inputisBribeTaker = s.nextBoolean();

		Deputy deputy = new Deputy(inputWeight, inputGrowth, inputFirstName, inputLastName, inputAge, inputisBribeTaker);

		if (inputisBribeTaker) {
			deputy.giveBribes(deputy.isBribeTaker());
		}

		deputies.add(deputy);

	}

	public void deleteDeputy() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter last name of deputy which you want to except from faction !");
		String inputFirsName = s.next();

		ListIterator<Deputy> deputyIterator = deputies.listIterator();

		while (deputyIterator.hasNext()) {
			if (inputFirsName.equals(deputyIterator.next().getName())) {
				deputyIterator.remove();
			}
		}
	}

	public void showBribeTakers() {
		ListIterator<Deputy> deputyIterator = deputies.listIterator();

		while (deputyIterator.hasNext()) {
			Deputy tempDeputy = deputyIterator.next();
			if (tempDeputy.isBribeTaker()) {
				System.out.println(tempDeputy);
			}
		}
	}

	public Deputy findTheBestBribeTakers() {
		return Collections.max(deputies, new DeputyBribeSizeComparator());
	}

	public void showAllDeputys() {
		ListIterator<Deputy> deputyIterator = deputies.listIterator();

		while (deputyIterator.hasNext()) {
			System.out.println(deputyIterator.next());
		}

	}

	public void cleanFaction() {
		deputies.clear();
	}

}
