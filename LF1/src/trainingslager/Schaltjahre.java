package trainingslager;

import oop.IO;

public class Schaltjahre {

	public static void main(String[] args) {

			while (true) {

				System.out.println("Bitte geben Sie ein start Jahr an: ");

				int jahrStart = IO.readInteger();

				System.out.println("Bitte geben Sie ein end Jahr an: ");

				int jahrEnde = IO.readInteger();

				for(int jahr = jahrStart; jahr <= jahrEnde; jahr++){

					boolean Schaltjahr = jahr % 4 == 0;

					boolean KeinSchaltjahr = jahr % 100 == 0;

					boolean AusnahmeRegel2 = jahr % 400 == 0;

					if (Schaltjahr) {

						System.out.println(jahr + " Ist ein Schaltjahr!");

					} else if(KeinSchaltjahr){

						if(AusnahmeRegel2){

							System.out.println("Ist ein Schaltjahr!");

							System.out.println(jahr);

						}else{

							//System.out.println("Ist kein Schaltjahr!");
						}
					}
				}
				System.out.println("Möchten Sie nochmal wiederholen? (j/n)");
				if (!IO.readBoolean()) {

					return;

				}
			}
		}
	}
