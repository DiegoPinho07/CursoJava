package entidades;

public class Comment {
	
	//classe criada para adicionar e remover comentarios da aplicação
	private String text;

	public Comment(String text) {
		
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
