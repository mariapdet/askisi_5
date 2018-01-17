import java.util.Scanner;

public class SongTest {

	public static void main (String args[]){

	Scanner scanner=new Scanner (System.in);

	Singer singer = new  Singer("Frank Sinatra");
		new  Singer("Wham!");
		new  Singer("Mariah Carey");
		new  Singer("Chris Rea");
		new  Singer("Sia");

	Song song = new Song("All I Want for Christmas Is You",singer.sin[2], "https://www.youtube.com/watch?v=yXQViqx6GMY" );
		new Song ("White Christmas",singer.sin[0], "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		new Song ("Last Christmas",singer.sin[1], "https://www.youtube.com/watch?v=E8gmARGvPlI" );
		new Song ("Driving home for christmas",singer.sin[3], "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		new Song ("Santa's Coming For Us",singer.sin[4], "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		new Song ("Let It Snow! Let It Snow! Let It Snow!",singer.sin[0], "https://www.youtube.com/watch?v=vGRC2LYmHfU" );

	while (true){

		System.out.println("*****Welcome to our DMST Christmas Music Application*****");
		System.out.println("Menu:");
	 	System.out.println("Type 1 to display singer's list");
		System.out.println("Type 2 to display Frank's Sinatra available songs");
		System.out.print("Type here: ");

		int userinput = scanner.nextInt();

			if (userinput==1){

				System.out.println ("** Display Singer's list **");

					for (int i=0; i<(singer.sin.length); i++){

						if(singer.sin[i]!=null){

							System.out.println ("-Singer " + singer.sin[i].toString());

							}
						}
				}

			else if (userinput==2){

				System.out.println ("** Display Frank's Sinatra song List **");

				System.out.println("2 songs were found");

					for (int i=0; i<(song.son.length); i++){

						if (song.son[i] !=null){

							System.out.println ("Title: " + song.son[i].getTitle()+ " Url: " + song.son[i].getUrl());
						}
					}
				}

			else {

				System.out.println ("Eisagwgi lathos arithmou");
				System.out.println ("Xanaprospathiste");

				}

		}
	}
}