package lviv.lgs.ua;

import java.util.Scanner;

public class Deputy extends Human {

	private String surname;
	private String name;
	private int age;
	private boolean bribeTaker;
	private int bribesSize;

	public Deputy(int weight, int height, String surname, String name, int age, boolean bribeTaker) {
		super(weight, height);
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.bribeTaker = bribeTaker;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBribeTaker() {
		return bribeTaker;
	}

	public void setBribeTaker(boolean bribeTaker) {
		this.bribeTaker = bribeTaker;
	}

	public int getBribesSize() {
		return bribesSize;
	}

	public void setBribesSize(int bribesSize) {
		this.bribesSize = bribesSize;
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", bribeTaker=" + bribeTaker
				+ ", bribesSize=" + bribesSize + "]";
	}

	public void giveBribes(boolean b) {
		if (!bribeTaker)
			System.out.println("This deputy does not take bribes");
		else {
			Scanner s = new Scanner(System.in);
			int bribesSize = s.nextInt();
			if (bribesSize > 5000)
				System.out.println("Police will imprison the deputy");
			else
				this.bribesSize = bribesSize;
		}

	}

}
