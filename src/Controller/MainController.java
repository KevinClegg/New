package Controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Artikel;
import Model.ArtikelListe;
import Model.ShopAdresse;
import Model.ShopAdresseListe;
import View.MainFrame;

public class MainController {
	
	private MainFrame mainFrame;
	private Artikel artikel;
	private ArtikelListe artikelliste;
	private ShopAdresse shopadresse;
	private ShopAdresseListe shopadresseliste;
	
	
	
	
	public  MainController (){
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run () {
				try {
					mainFrame = new MainFrame();
					init();
					mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				
				}
			}
		});
	}
			
	public void init() {
		ShopAdresseListe SAL1 = new ShopAdresseListe();
		ArtikelListe AL1 = new ArtikelListe();
	
		
	mainFrame.getBtnNewButton_1().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			mainFrame.getTextField_1();
			
			
		}
		
	});
	
	
	
