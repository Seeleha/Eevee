package com.Tests;

import java.util.InputMismatchException;
import java.util.Scanner;

public class conversation {
	Scanner sc = new Scanner(System.in);
	String newLigne = System.getProperty("line.separator");
	String prenom = " ";

	int age;
	int responseQuestions = ' ';
	char response = ' ';
	char response2 = ' ';

	public void debutConversation() {
		System.out.println("Bonjour je me présente je suis Eevee," + '\n' +
						   "première du nom," + newLigne +
						   "Souveraine de la petite cuillère," + newLigne +
						   "fan de la première heure des feux de l'amour," + newLigne +
						   "mangeuse de crevettes aguérie.");
		System.out.println("");
		System.out.println("Je suis la maitresse de ces lieux, faisons connaissance veux-tu ?");
		sc.nextLine();
		System.out.println("Quel est ton petit nom ?");

		prenom = sc.nextLine();

		System.out.println("Ravie de te rencontrer... " + prenom + ".");
		sc.nextLine();
		System.out.println("...");
		sc.nextLine();
		System.out.println("C'est vraiment juste " + prenom + "...? Sans aucun titre ni rien...?");
		sc.nextLine();
		System.out.println("Bon bah je vais devoir m'en contenter... Après tout, ça fait bien longtemps que je n'ai pas eu de visite !");

		this.conversationBanale();
		this.askQuestions();
		this.Questions();
		this.moreQuestions();
	}

	public void conversationBanale() {
		sc.nextLine();
		System.out.println("Mais dis moi, je suis curieuse ! Quel âge as tu ?");
		boolean saisieAgeOk = false;

		while (!saisieAgeOk) {
			try {
				age = sc.nextInt();
				saisieAgeOk = true;
			} catch (InputMismatchException e) {
				System.out.println("Je te demande ton âge alors n'essaie pas de me dire autre chose et saisi des chiffres...");
				System.out.println("");
				System.out.println("Alors, quel âge as-tu ?");
			}
		}

		if (age < 14) {
			System.out.println(age + " ans ?! Quoi ?! Tu peux déjà parler à cet âge là ?! Un bébé, tu es un bébé...");
		} else if (age <= 25) {
			System.out.println("Oh tu as " + age + " ans... La vigueur de la jeunesse... On peut échanger stp ?");
		} else if (age <= 35) {
			System.out.println("Haha " + age + " ans c'est ça ? C'est que la vieillesse commence à arriver dis donc... ;)");
		} else if ( age <= 42) {
			System.out.println(age + " ans hein... Je les vois d'ici tes petits cheveux blancs hihi !");
		} else {
			System.out.println("MON DIEU, être aussi âgé devrait être interdit ?!! On te surnommera bientôt l'ancêtre !");
		}

		sc.nextLine();
		sc.nextLine();
		System.out.println("Bon, maintenant que la question épineuse de l'âge est réglée on peut passer à autre chose...");
		sc.nextLine();
		System.out.println(".. Quoi ?");
		sc.nextLine();
		System.out.println("Moi je ne t'ai pas dit mon âge ?");
		sc.nextLine();
		System.out.println("O-Oui c'est vrai mais on ne demande pas son âge à une femme non...?");
		sc.nextLine();
		System.out.println("... Il est vrai que toi tu m'as donné le tien... Et sans pester qui plus est.");
		sc.nextLine();
		System.out.println("B-Bon très bien ! Je vais te le donner mais sache que ça ne me réjouit pas du tout...");
		sc.nextLine();
		System.out.println("Tu me revaudras ça...");
		sc.nextLine();
		System.out.println("Tu souhaites VRAIMENT connaitre mon âge ? (O/N) ");

		response = sc.nextLine().charAt(0);

		if (response == 'O') {
			System.out.println("J-Je vois que tu te fiche de briser le coeur d'une femme..!" + newLigne +
							   "Bon... Dis toi que je suis encore plus âgée que l'addition de ton âge avec celui de tes parents, de tes grands-parents, de tes arrières grands-parents, de tes..." + newLigne +
							   "Mmh, je pense que tu as saisi l'idée.");
		} else {
			System.out.println("Oooh toi je t'apprécie déjà ! Tu sais comment ravir mon coeur <3");
		}

		sc.nextLine();
	}

	public void askQuestions() {
		System.out.println("Passons à autre chose veux-tu...");
		sc.nextLine();
		System.out.println("Tiens !");
		sc.nextLine();
		System.out.println("Comme je m'ennuie un peu et que tu es là, que dirais-tu de me poser des questions ? (O/N)");

		response = sc.nextLine().charAt(0);

		if (response == 'O'){
			System.out.println("Super ! Je te laisse choisir dans la liste alors :D");
			System.out.println("");
		} else if (response == 'N') {
			System.out.println("Tu n'es pas très drôle toi tu sais... Je t'ennuie déjà, c'est ça ?!");
		} else {
			System.out.println("Tu dois saisir 'O' ou 'N', les gens sans titres ne savent pas lire ou bien ?");
		}

		sc.nextLine();
	}

	public void Questions() {
		if (response == 'O') {
		System.out.println("1 - As-tu un péché mignon ?");
		System.out.println("2 - Que penses-tu du véganisme ?");
		System.out.println("3 - A choisir, plutôt diner avec le clown Pennywise ou manger un bol entier d'arraignées VIVANTES ?");
		System.out.println("4 - As-tu quelqu'un dans ta vie ?");
		System.out.println("5 - As-tu un ennemi ?");
		System.out.println("6 - Eevee... Je pense qu'il y a une réelle connexion entre nous... Veux-tu m'épouser ?");
		responseQuestions = sc.nextInt();
		sc.nextLine();
		} else {
			System.out.println("Bon eh bien à bientôt " + prenom + ", je suppose... Non en vérité reviens vite me voir stp, il n'y a rien à faire ici !");
		}

		switch (responseQuestions) {
		case 1:
			System.out.println("Oui le sucre, j'en suis addict ! D'ailleurs... T'aurais pas une petite dose stp ?");
		break;
		case 2:
			System.out.println("Oh tu sais... Moi je ne retiendrais que cette citation d'un grand homme : " + newLigne +
							   "'Qu'est-ce que c'est que ce style de bouffer des petits machins tout secs et trois gallons de flotte par jour ?" + newLigne +
							   "Si la jeunesse se met à croire à ces conneries, on se dirige tout droit vers une génération de dépressifs ! Le gras, c'est la vie.'");
		break;
		case 3:
			System.out.println("Ah ouais tu fais pas dans la dentelle toi, t'as été fini à l'urine ou c'est comment ?");
		break;
		case 4:
			System.out.println("Parce que dans la vie on est obligés d'être en couple peut-être ?! Moi j'ai pas le temps pour ces conneries ! M-Moi je suis une femme occupée ! M-M-Moi j-je... Buhuhu...");
		break;
		case 5:
			System.out.println("LES CALORIES ! Je les hais...");
		break;
		case 6:
			System.out.println("Ah non désolée je peux pas, je suis mariée à mon frigo depuis bien longtemps déjà...");
		break;
		}
	}

	public void moreQuestions() {

		if (response == 'O') {
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("bye bye !");
		}

		try {
			response2 = sc.nextLine().charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("");
		}

		response2 = 'O';

		while (response2 == 'O') {
			System.out.println("On continue ? (O/N)");
			response2 = sc.nextLine().charAt(0);
			if (response2 == 'O') {
				this.Questions();
			} else {
				System.out.println("Bon eh bien à bientôt " + prenom + ", je suppose... Non en vérité reviens vite me voir stp, il n'y a rien à faire ici !");
				sc.nextLine();
				System.out.println("bye bye !");
			}
		}
	}
}
