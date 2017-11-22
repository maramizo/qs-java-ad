package qs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201702.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomer;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomerPage;
import com.google.api.ads.adwords.axis.v201702.mcm.ManagedCustomerServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201702.cm.ManagedCustomerField;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Maps;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201710.cm.Campaign;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignPage;
import com.google.api.ads.adwords.axis.v201710.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201710.cm.Selector;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.adwords.lib.selectorfields.v201710.cm.CampaignField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JCheckBoxMenuItem;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.lang.model.element.Element;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LoginWindow {
	final int PAGE_SIZE = 500;

	private JFrame frmQuadsolutionsAdwordsLogin;
	private JPasswordField pwdField;
	private final Action action = new SwingAction();
	private MainWindow winElement = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frmQuadsolutionsAdwordsLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuadsolutionsAdwordsLogin = new JFrame();
		frmQuadsolutionsAdwordsLogin.setTitle("QuadSolutions: AdWords Login");
		frmQuadsolutionsAdwordsLogin.setBounds(100, 100, 431, 282);
		frmQuadsolutionsAdwordsLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(winElement == null)
					winElement = new MainWindow();
				frmQuadsolutionsAdwordsLogin.setVisible(false);
			}
		});
		
		JButton btnCancel = new JButton("Clear");
		
		JLabel lblPassword = new JLabel("Password:");
		
		JLabel lblUsername = new JLabel("Username:");
		
		pwdField = new JPasswordField();
		
		JFormattedTextField usernameField = new JFormattedTextField();
		GroupLayout groupLayout = new GroupLayout(frmQuadsolutionsAdwordsLogin.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
						.addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(112)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(75)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(usernameField, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
								.addComponent(pwdField, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
					.addGap(88))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(64)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsername)
						.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(pwdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnCancel))
					.addGap(28, 28, Short.MAX_VALUE))
		);
		frmQuadsolutionsAdwordsLogin.getContentPane().setLayout(groupLayout);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private void Login() throws Exception {
		
	    Credential oAuth2Credential = new OfflineCredentials.Builder()
	            .forApi(Api.ADWORDS)
	            .fromFile()
	            .build()
	            .generateCredential();

	    AdWordsSession session = new AdWordsSession.Builder()
	        .fromFile()
	        .withOAuth2Credential(oAuth2Credential)
	        .build();

	    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();
	    
	    List<Long> customerIDs = GetAccountIDs(adWordsServices, session);	    
	    List<Long> campaignIDs = new ArrayList<Long>();
	    
	    for(int i=0; i < customerIDs.size(); i++) {
	    	campaignIDs.add(GetCampaigns(customerIDs.get(i), adWordsServices, session));
	    }
	}
	
	// Acquire list of all customer IDs.
	public List<Long> GetAccountIDs(AdWordsServicesInterface adWordsServices, AdWordsSession session)
		throws Exception {
		
	    // Get the ServicedAccountService.
	    ManagedCustomerServiceInterface managedCustomerService =
	        adWordsServices.get(session, ManagedCustomerServiceInterface.class);

	    // Create selector builder.
	    int offset = 0;
	    SelectorBuilder selectorBuilder =
	        new SelectorBuilder()
	            .fields(ManagedCustomerField.CustomerId)
	            .offset(offset)
	            .limit(PAGE_SIZE);

	    // Get results.
	    ManagedCustomerPage page;

	    List<Long> customerIDs = new ArrayList<Long>();
	    
	    do {
	      page = managedCustomerService.get(selectorBuilder.build());

	      if (page.getEntries() != null) {
	        // Create account tree nodes for each customer.
	        for (ManagedCustomer customer : page.getEntries()) {
	        	customerIDs.add(customer.getCustomerId());
	        }
	      }
	      offset += PAGE_SIZE;
	      selectorBuilder.increaseOffsetBy(PAGE_SIZE);
	    } while (offset < page.getTotalNumEntries());
	    
	    return customerIDs;
	  }
	
	public long GetCampaigns(Long customerID, AdWordsServicesInterface adWordsServices, AdWordsSession session) throws Exception {
		    // Get the CampaignService.
		
			session.setClientCustomerId(customerID.toString());
		
		    CampaignServiceInterface campaignService =
		        adWordsServices.get(session, CampaignServiceInterface.class);

		    int offset = 0;

		    // Create selector.
		    com.google.api.ads.adwords.axis.utils.v201710.SelectorBuilder builder = new com.google.api.ads.adwords.axis.utils.v201710.SelectorBuilder();
		    Selector selector = builder
		        .fields(CampaignField.Id, CampaignField.Name)
		        .orderAscBy(CampaignField.Name)
		        .offset(offset)
		        .limit(PAGE_SIZE)
		        .build();
		    
		    CampaignPage page = null;
		    do {
		      // Get all campaigns.
		      page = campaignService.get(selector);

		      // Display campaigns.
		      if (page.getEntries() != null) {
		        for (Campaign campaign : page.getEntries()) {
				      return campaign.getId();		        	
		        }
		      } else {
		        System.out.println("No campaigns were found.");
			    return 0;
		      }
		      offset += PAGE_SIZE;
		      selector = builder.increaseOffsetBy(PAGE_SIZE).build();
		    } while (offset < page.getTotalNumEntries());
			return 0;
		  }
}
