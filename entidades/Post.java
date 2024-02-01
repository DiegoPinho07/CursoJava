package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//instanciando um sipledateformat na forma de constante para não ficar se repetindo na classe post, para imprimir na classe principal
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String Tittle;
	private String Content;
	private Integer Likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post(){
		
	}
	//criando os construtores para incluir o valor das variáveis no programa principal
	public Post(Date moment, String tittle, String content, Integer likes) {
		this.moment = moment;
		Tittle = tittle;
		Content = content;
		Likes = likes;
		
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) { 
		this.moment = moment;
	}
	public String getTittle() {
		return Tittle;
	}
	public void setTittle(String tittle) {
		Tittle = tittle;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public Integer getLikes() {

		return Likes;
	}
	public void setLikes(Integer likes) {
		Likes = likes;
	}
	public List<Comment> getComment() {
		return comments;
	}
	//criando o metodo para adicionar o comentário do objeto comentário
       public void addComment(Comment comment) {
    	  comments.add(comment);
       }
       //criando o método para remover o comentário do objeto comentário
       public void removeComment(Comment comment) {
     	  comments.remove(comment);
       }
       //criando um construtor toString para imprimir na classe principal
        public String toString() {     
        	//instanciando uma classe para construir um toString
        	StringBuilder sb = new StringBuilder();
        	sb.append(Tittle + "\n");
        	sb.append(Likes);
        	sb.append(" Likes - ");
            sb.append(sdf.format(moment) + "\n");
            sb.append(Content);
            sb.append("Comments: \n");
            for (Comment c: comments) {
            	sb.append(c.getText() + "\n");
            	
            }
            return sb.toString();
        	
        	}
        }
