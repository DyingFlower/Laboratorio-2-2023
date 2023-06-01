import java.awt.Color;

import javax.swing.JPanel;

public class Painel extends JPanel{
	public Botão botao1;
	public Botão botao2;
	public Botão botao3;
	public Botão botao4;
	public Painel() {
		botao1= new Botão("Cadastrar",this);
		add(botao1);
		botao2= new Botão("Listar",this);
		add(botao2);
		botao3= new Botão("Atualizar",this);
		add(botao3);
		botao4= new Botão("Deletar",this);
		add(botao4);
		setBackground(Color.GRAY);
		setVisible(true);
	}
}
