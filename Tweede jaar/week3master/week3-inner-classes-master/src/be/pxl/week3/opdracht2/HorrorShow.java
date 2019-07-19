package be.pxl.week3.opdracht2;

public class HorrorShow {

	public static void main(String[] args) {
		class Vampire implements Monster {

			@Override
			public void menace() {
				System.out.println("I'll drink your blood!!");

			}
		}

		class Werewolf implements DangerousMonster {

			@Override
			public void menace() {
				System.out.println("I'll destroy you");
			}

			@Override
			public void destroy(Monster monster) {
				monster.menace();
				System.out.println("Big fight...");
				System.out.println(getClass().getName() + " killed one " + monster.getClass().getName());
			}

		}

		Vampire edward = new Vampire();
		edward.menace();

		Werewolf jacob = new Werewolf();
		jacob.destroy(new Monster() {

			@Override
			public void menace() {
				System.out.println("You smell like wet dog.");

			}
		});

		jacob.destroy(new Monster() {

			@Override
			public void menace() {
				System.out.println("fdskfjsdlfd");

			}
		});

	}

}
