package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comment;
import entidades.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
		//instanciando objetos do tipo Comment para inserir os dados dos comentários
		Comment c1 = new Comment("Have a nice trip!!");
		Comment c2 = new Comment(" uowww! Thats awesome!");
		//instanciando um objeto do tipo post para inclusão de argumentos da classe
	  Post p1 = new Post(sdf.parse("21/06/2018 21:48:44"), 
			  "Im Traveling", 
			  "Im going to visit this wonderfull contry!! \n", 
			  21);
//adicionando os comentários na classe post instanciada
	  p1.addComment(c1);
	  p1.addComment(c2);
	  
	  Comment c3 = new Comment("Good Night!! ");
		Comment c4 = new Comment(" May the force with you!!");
		 Post p2 = new Post(sdf.parse("28/07/2018 2:14:09"), 
				  "Good night guys!!", 
				  "See you tommorow!! \n", 
				  5);
		 p2.addComment(c3);
		 p2.addComment(c4);
	  
	  System.out.println(p1);
	  System.out.println(p2);
	}

}
