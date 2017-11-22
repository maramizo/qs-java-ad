package qs.windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyManWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyManWindow window = new KeyManWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KeyManWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                frame.dispose();
                MainWindow.destroyElement(0);
            }
        });
		frame.setBounds(100, 100, 483, 722);
		
		JLabel lblKeywordManipulation = new JLabel("Keyword Manipulation");
		lblKeywordManipulation.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeywordManipulation.setVerticalAlignment(SwingConstants.TOP);
		lblKeywordManipulation.setFont(new Font("Rockwell", Font.PLAIN, 18));
		
		JComboBox cbxOperation = new JComboBox();
		cbxOperation.setModel(new DefaultComboBoxModel(new String[] {"Multiplication", "Division (Removal)"}));
		
		JButton btnProcess = new JButton("Process");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JScrollPane scrollPane_3 = new JScrollPane();
		
		JComboBox cbxMatch = new JComboBox();
		cbxMatch.setToolTipText("Different types of search modifiers.");
		cbxMatch.setModel(new DefaultComboBoxModel(new String[] {"Exact Match", "Phrase Match", "Broad Match", "Broad Modifier Match"}));

		JButton btnCopy = new JButton("Copy Result");
		btnCopy.setToolTipText("Copy the result to your clipboard.");
		JButton btnClear = new JButton("Clear");
		btnClear.setToolTipText("Clear all of the contents except the original text.");
		
		JLabel lblModifier = new JLabel("Modifier #2:");
		lblModifier.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblModifier_1 = new JLabel("Modifier #1:");
		lblModifier_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblOriginalText = new JLabel("Original Text:");
		lblOriginalText.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63)
							.addComponent(cbxOperation, 0, 110, Short.MAX_VALUE)
							.addGap(117)
							.addComponent(cbxMatch, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(7))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(77)
							.addComponent(btnProcess, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(59)
							.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
							.addGap(48)
							.addComponent(btnCopy, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
							.addGap(22))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblOriginalText)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblModifier)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
											.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
										.addGap(72))))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
									.addComponent(lblResult))
								.addComponent(lblModifier_1)
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
					.addGap(78))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(62)
					.addComponent(lblKeywordManipulation, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
					.addGap(117))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addComponent(lblKeywordManipulation, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModifier_1)
						.addComponent(lblOriginalText))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollPane_1)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
					.addGap(16)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblModifier)
						.addComponent(lblResult))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_3, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(cbxOperation, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxMatch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnProcess)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnClear, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnCopy, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addGap(24))
		);
		
		JTextArea txtModifier1 = new JTextArea();
		txtModifier1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtModifier1.selectAll();
			}
		});
		txtModifier1.setWrapStyleWord(true);
		txtModifier1.setLineWrap(true);
		scrollPane_1.setViewportView(txtModifier1);
		
		JTextArea txtResult = new JTextArea();
		txtResult.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtResult.selectAll();
			}
		});
		txtResult.setWrapStyleWord(true);
		txtResult.setLineWrap(true);
		scrollPane_3.setViewportView(txtResult);
		
		JTextArea txtModifier2 = new JTextArea();
		txtModifier2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtModifier2.selectAll();
			}
		});
		txtModifier2.setWrapStyleWord(true);
		txtModifier2.setLineWrap(true);
		scrollPane_2.setViewportView(txtModifier2);
		
		JTextArea txtOriginal = new JTextArea();
		txtOriginal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtOriginal.selectAll();
			}
		});
		txtOriginal.setLineWrap(true);
		txtOriginal.setWrapStyleWord(true);
		scrollPane.setViewportView(txtOriginal);
		
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxOperation.getSelectedIndex() == 0)
				{
					String[] _firstHolder = txtOriginal.getText().split("\\r?\\n");
				    ArrayList<String>tempList = new ArrayList<>(Arrays.asList(_firstHolder));
				    _firstHolder = txtModifier1.getText().split("\\r?\\n");
				    String[] _secondHolder = txtModifier2.getText().split("\\r?\\n");
				    tempList.removeAll(Arrays.asList("", null));
				    ArrayList<String>arrList = new ArrayList<String>();
		    		arrList.addAll(tempList);
				    
				    for(int i=0; i < tempList.size();i++) {
				    	for(int j=0;j<_secondHolder.length;j++) {
				    		if(_secondHolder[j].isEmpty() != true)
				    			arrList.add(i, tempList.get(i) + ' ' + _secondHolder[j]);
				    		else
				    			break;
				    	}
				    	for(int j=0;j<_firstHolder.length;j++) {
				    		if(_firstHolder[j].isEmpty() != true)
				    			arrList.add(i, tempList.get(i) + ' ' + _firstHolder[j]);
				    		else
				    			break;
				    	}
				    }
				    
				    
				    String newText = "";
				    char matchModifier[] = new char[2];
			    	
			    	for(int i = 0; i < arrList.size();i++) {
				    	arrList.set(i, arrList.get(i).replace("[", ""));
				    	arrList.set(i, arrList.get(i).replace("]", ""));
				    	arrList.set(i, arrList.get(i).replace("\"", ""));
				    	arrList.set(i, arrList.get(i).replace("+", ""));
				    }		    	
			    	
				    switch(cbxMatch.getSelectedIndex()) {
					    case 0:
					    {
						    matchModifier[0] = '[';
						    matchModifier[1] = ']';
						    break;
					    }
					    case 1:
					    {
					    	matchModifier[0] = '"';
					    	matchModifier[1] = matchModifier[0];
					    	break;
					    }
					    case 3:
					    {
						    ArrayList<String> resList = new ArrayList<String>();
						    
						    for(int i = 0; i < arrList.size();i++) {
						    	if(arrList.get(i).contains(" "))
						    	{
						    		resList.add(arrList.get(i).replace(" ", " +"));
						    	}
						    	else 
						    		resList.add(arrList.get(i));
					    		resList.set(i, '+' + resList.get(i));
						    }
					    	for(String s : resList) {
					    		newText += s + "\n";
					    	}
					    	break;
					    }
					    default:
					    {
					    	break;
					    }
				    }
				    if(cbxMatch.getSelectedIndex() != 3)
				    {
					    for(String s : arrList) {
					    	if(cbxMatch.getSelectedIndex() != 2)
					    		newText += matchModifier[0] + s + matchModifier[1] + "\n";
					    	else
					    		newText += s + "\n";				    		
					    }
				    }
				    txtResult.setText(newText);
				}
				else
				{
					
				}
			}
		});
		
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StringSelection stringSelection = new StringSelection(txtResult.getText());
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText("");
				txtModifier1.setText("");
				txtModifier2.setText("");
			}
		});
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
	public void focus() {
		frame.toFront();
		return;
	}
}
