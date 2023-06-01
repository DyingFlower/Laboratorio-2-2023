import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Janela extends JFrame{
	public Label label;
	public Painel painel1;
	public Painel2 painel2;
	public Botão botao;
	public Janela() {
		painel1 = new Painel();
		painel2 = new Painel2();
		setLayout(new BorderLayout(2,1));
		setSize(1000,600);
		add(painel1,BorderLayout.NORTH);
		add(painel2,BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
