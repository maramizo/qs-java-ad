package qs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.lang.model.element.Element;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frmQuadsolutionsAdwordsInterface;
	private static KeyManWindow keyManElement = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmQuadsolutionsAdwordsInterface.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuadsolutionsAdwordsInterface = new JFrame();
		frmQuadsolutionsAdwordsInterface.setBackground(Color.BLUE);
		frmQuadsolutionsAdwordsInterface.getContentPane().setBackground(new Color(248, 248, 255));
		frmQuadsolutionsAdwordsInterface.setTitle("QuadSolutions: AdWords Interface");
		frmQuadsolutionsAdwordsInterface.setBounds(100, 100, 623, 736);
		frmQuadsolutionsAdwordsInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setToolTipText("Manage Existing Campaigns");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ryan.Clarke\\Documents\\PPictures\\campaignx3.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Manage Current Campaigns");
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		GroupLayout groupLayout = new GroupLayout(frmQuadsolutionsAdwordsInterface.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(75)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(94)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(359, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addContainerGap(532, Short.MAX_VALUE))
		);
		frmQuadsolutionsAdwordsInterface.getContentPane().setLayout(groupLayout);
		
		JMenuBar menuBar = new JMenuBar();
		frmQuadsolutionsAdwordsInterface.setJMenuBar(menuBar);
		
		JMenu mnNewCustomers = new JMenu("New Customers");
		menuBar.add(mnNewCustomers);
		
		JMenuItem mntmCreateNewPackage = new JMenuItem("Create New Package");
		mnNewCustomers.add(mntmCreateNewPackage);
		
		JMenuItem mntmCreateNewActivation = new JMenuItem("Create New Activation Sheet");
		mnNewCustomers.add(mntmCreateNewActivation);
		
		JMenu mnExistingCustomers = new JMenu("Existing Customers");
		menuBar.add(mnExistingCustomers);
		
		JMenuItem mntmRenewPackage = new JMenuItem("Renew Package");
		mnExistingCustomers.add(mntmRenewPackage);
		
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		mnReports.add(menuItem);
		
		JMenu mnKeywords = new JMenu("Keywords");
		menuBar.add(mnKeywords);
		
		JMenuItem mntmCreateNewKeywords = new JMenuItem("Create New Keywords");
		mnKeywords.add(mntmCreateNewKeywords);
		
		JMenuItem mntmKeywordManipulation = new JMenuItem("Keyword Manipulation");
		mntmKeywordManipulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(keyManElement == null)
					keyManElement = new KeyManWindow();
				else
					keyManElement.focus();
			}
		});
		mnKeywords.add(mntmKeywordManipulation);
		
		JMenuItem mntmEstimateTrafficpackage = new JMenuItem("Estimate Traffic");
		mnKeywords.add(mntmEstimateTrafficpackage);
		
		frmQuadsolutionsAdwordsInterface.setVisible(true);
	}
	public static void destroyElement(int referenceID) {
		switch(referenceID) {
		case 0:
		{
			keyManElement = null;
			break;
		}
		}
	}
}
