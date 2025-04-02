import javax.swing.*;  
import java.awt.event.*;  

public class HPCalc implements ActionListener{  
    JTextField HP;  
    JButton submit;  
	JLabel lft, psn, sub;
	
    HPCalc(){  
        JFrame f = new JFrame(); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HP = new JTextField();  
        HP.setBounds(50,25,100,20);  
        submit = new JButton("Calculate!");  
        submit.setBounds(50,75,100,20);  
        submit.addActionListener(this); 
		lft = new JLabel("Leftovers Recovery:");
		lft.setBounds(50,125,200,20); 
		psn = new JLabel("Poison Heal Recovery:");
		psn.setBounds(50,175,200,20); 
		sub = new JLabel("Substitute Health:");
		sub.setBounds(50,225,200,20);
		
        f.add(HP);f.add(submit); f.add(lft); f.add(psn); f.add(sub);
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }      
	
    public void actionPerformed(ActionEvent e) {  
        String s = HP.getText();   
        int totalHP = Integer.parseInt(s);   
		String lftOut = "Leftovers Recovery: " + String.valueOf(totalHP / 16) + " (r = " + String.valueOf(totalHP % 16) + ")";
        lft.setText(lftOut);
		String psnOut = "Poison Heal Recovery: " + String.valueOf(totalHP / 8) + " (r = " + String.valueOf(totalHP % 4) + ")";
        psn.setText(psnOut);
		String subOut = "Substitute Health: " + String.valueOf(totalHP / 4) + " (r = " + String.valueOf(totalHP % 4) + ")";
        sub.setText(subOut);
    }  
	
	public static void main(String[] args) {  
		new HPCalc();  
	} 
}  
