import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
class Customer implements Serializable
{
    private String name,address;
    private int tel;
    public int idv,imv,iyv,ida,ima,iya;
    public int due,rentAudio,rentVideo;
    public boolean isAudio,isVideo;
    public String nameaud,namevid;
    
    public Customer(String n,String a,int no)
    {
        name=n;
        address=a;
        tel=no;
        due=0;
        isAudio=isVideo=false;
    }
    public String getName() { return name; }
    public int getTel() { return tel; }
    public String getAddress() { return address; }
}
class storePurchase implements Serializable{
    public String name,AV;
    public int d,m,y,rental,price;
    boolean isAvailable;
    public storePurchase(String s,int dd,int mm,int yy,int p,int r,String item)
    {
        name=s;
        d=dd;
        m=mm;
        y=yy;
        rental=r;
        price=p;
        AV=item;
        isAvailable=true;
    }
    public int getRental(int dd,int mm,int yy)
    {
        if(y==yy)
        {
            return rental;
        }
        else if(yy-y==1)
        {
          if(dd==d && mm==m)
              return rental/2;
          else
              return rental;
        }
        else
            return rental/2;
    } 
}
public class StartGUI extends javax.swing.JFrame {

    private int custid;
    ArrayList <Customer> cust=new ArrayList();
    ArrayList <storePurchase> stp=new ArrayList();
    public StartGUI() {
        initComponents();
        NewCustomerPanel.setVisible(false);
        ManagerLoginPanel.setVisible(false);
        StorePurchasePanel.setVisible(false);
        StorePurchasePanel.setVisible(false);
        CDLoanLoginPanel.setVisible(false);
        CDLoanPanel.setVisible(false);
        CDReturnLoginPanel.setVisible(false);
        CDReturnPanel.setVisible(false);
        CloseAccountLoginPanel.setVisible(false);
        File file=null;
        file= new File("E:\\customer.ser");
        ObjectInput ois=null;
        InputStream isr =null;
        InputStream buffer=null;
        try {
             if(!file.exists())
                 file.createNewFile();
             isr= new FileInputStream("E:\\customer.ser");
             buffer = new BufferedInputStream(isr);
             ois = new ObjectInputStream(buffer);
             cust=(ArrayList)ois.readObject();
             ois.close();
             isr.close();
        } catch (Exception ex) {
            Logger.getLogger(StartGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        file= new File("E:\\storepurchase.ser");
        try {
             if(!file.exists())
                 file.createNewFile();   
             isr= new FileInputStream("E:\\storepurchase.ser");
             buffer = new BufferedInputStream(isr);
             ois = new ObjectInputStream(buffer);
             stp=(ArrayList)ois.readObject();
             ois.close();
             isr.close();
        } catch (Exception ex) {
            Logger.getLogger(StartGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WelcomePanel = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        NewCustomerPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TelephoneField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressArea = new javax.swing.JTextArea();
        bg1 = new javax.swing.JLabel();
        ManagerLoginPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ManagerField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        bg2 = new javax.swing.JLabel();
        StorePurchasePanel = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        AVComboBox = new javax.swing.JComboBox();
        RentalField = new javax.swing.JTextField();
        PriceField = new javax.swing.JTextField();
        MonthField = new javax.swing.JTextField();
        YearField = new javax.swing.JTextField();
        DayField = new javax.swing.JTextField();
        NameField1 = new javax.swing.JTextField();
        bg3 = new javax.swing.JLabel();
        CDLoanLoginPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        CTelField = new javax.swing.JTextField();
        CNameField = new javax.swing.JTextField();
        bg4 = new javax.swing.JLabel();
        CDLoanPanel = new javax.swing.JPanel();
        VideoSelectLabel = new javax.swing.JLabel();
        AudioSelectLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        VideoSelect = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        AudioSelect = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AudioList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        VideoList = new javax.swing.JList();
        WelcomeLabel = new javax.swing.JLabel();
        CDReturnLoginPanel = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        CTelField1 = new javax.swing.JTextField();
        CNameField1 = new javax.swing.JTextField();
        bg5 = new javax.swing.JLabel();
        CDReturnPanel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        AudioReturnField = new javax.swing.JTextField();
        VideoReturnField = new javax.swing.JTextField();
        VideoSelect1 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        AudioSelect1 = new javax.swing.JLabel();
        WelcomeLabel1 = new javax.swing.JLabel();
        CloseAccountLoginPanel = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        CTelField2 = new javax.swing.JTextField();
        CNameField2 = new javax.swing.JTextField();
        bg6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WelcomePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        WelcomePanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        WelcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 204, 0));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Close Account");
        jLabel45.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        WelcomePanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 260, 40));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CD Loan");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        WelcomePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 180, 40));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Store Purchase");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        WelcomePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 260, 40));

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Technology Video Store");
        WelcomePanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Customer");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        WelcomePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 260, 40));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CD Return");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        WelcomePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, 190, 40));

        jLabel17.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 204, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("EXIT");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        WelcomePanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 570, 120, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        WelcomePanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(WelcomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        NewCustomerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        NewCustomerPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        NewCustomerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Back");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        NewCustomerPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel8.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Technology Video Store");
        NewCustomerPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Register");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        NewCustomerPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 260, 40));

        jLabel10.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Telephone");
        NewCustomerPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 110, 40));

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Name");
        NewCustomerPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 110, 40));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Address");
        NewCustomerPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 110, 40));

        TelephoneField.setBackground(new java.awt.Color(204, 204, 0));
        TelephoneField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewCustomerPanel.add(TelephoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 160, 30));

        NameField.setBackground(new java.awt.Color(204, 204, 0));
        NameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NewCustomerPanel.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 160, 30));

        AddressArea.setBackground(new java.awt.Color(204, 204, 0));
        AddressArea.setColumns(20);
        AddressArea.setLineWrap(true);
        AddressArea.setRows(5);
        AddressArea.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(AddressArea);
        AddressArea.getAccessibleContext().setAccessibleParent(AddressArea);

        NewCustomerPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 160, -1));

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        NewCustomerPanel.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(NewCustomerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ManagerLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        ManagerLoginPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        ManagerLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Back");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        ManagerLoginPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel13.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Technology Video Store");
        ManagerLoginPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LOgin");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        ManagerLoginPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 260, 40));

        jLabel15.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Password");
        ManagerLoginPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 110, 40));

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Manager ID");
        ManagerLoginPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 140, 40));

        ManagerField.setBackground(new java.awt.Color(204, 204, 0));
        ManagerField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ManagerLoginPanel.add(ManagerField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 160, 30));

        PasswordField.setBackground(new java.awt.Color(204, 204, 0));
        PasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ManagerLoginPanel.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 160, 30));

        bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        ManagerLoginPanel.add(bg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(ManagerLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        StorePurchasePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        StorePurchasePanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        StorePurchasePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 204, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Logout");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        StorePurchasePanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel19.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Technology Video Store");
        StorePurchasePanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel20.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 204, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Enter");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        StorePurchasePanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 160, 40));

        jLabel21.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 204, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Date");
        StorePurchasePanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 110, 40));

        jLabel22.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 204, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Name");
        StorePurchasePanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 110, 40));

        jLabel24.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 204, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Rental  Rs.");
        StorePurchasePanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 120, 40));

        jLabel23.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 204, 0));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Price  Rs.");
        StorePurchasePanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 110, 40));

        AVComboBox.setBackground(new java.awt.Color(204, 204, 0));
        AVComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Audio", "Video" }));
        AVComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        AVComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StorePurchasePanel.add(AVComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 160, 30));

        RentalField.setBackground(new java.awt.Color(204, 204, 0));
        RentalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorePurchasePanel.add(RentalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 160, 30));

        PriceField.setBackground(new java.awt.Color(204, 204, 0));
        PriceField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorePurchasePanel.add(PriceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 160, 30));

        MonthField.setBackground(new java.awt.Color(204, 204, 0));
        MonthField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MonthField.setText("mm");
        MonthField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorePurchasePanel.add(MonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 40, 30));

        YearField.setBackground(new java.awt.Color(204, 204, 0));
        YearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        YearField.setText("yyyy");
        YearField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorePurchasePanel.add(YearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 60, 30));

        DayField.setBackground(new java.awt.Color(204, 204, 0));
        DayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DayField.setText("dd");
        DayField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorePurchasePanel.add(DayField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 40, 30));

        NameField1.setBackground(new java.awt.Color(204, 204, 0));
        NameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StorePurchasePanel.add(NameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 160, 30));

        bg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        StorePurchasePanel.add(bg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(StorePurchasePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CDLoanLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        CDLoanLoginPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        CDLoanLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 204, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Back");
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        CDLoanLoginPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel26.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 153, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Technology Video Store");
        CDLoanLoginPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel27.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 204, 0));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("LOgin");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        CDLoanLoginPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 260, 40));

        jLabel28.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 204, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Telephone Number");
        CDLoanLoginPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 230, 40));

        jLabel29.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 204, 0));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Name");
        CDLoanLoginPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 230, 40));

        CTelField.setBackground(new java.awt.Color(204, 204, 0));
        CTelField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CDLoanLoginPanel.add(CTelField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 160, 30));

        CNameField.setBackground(new java.awt.Color(204, 204, 0));
        CNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CDLoanLoginPanel.add(CNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 160, 30));

        bg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        CDLoanLoginPanel.add(bg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(CDLoanLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CDLoanPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        CDLoanPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        CDLoanPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VideoSelectLabel.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        VideoSelectLabel.setForeground(new java.awt.Color(255, 204, 0));
        VideoSelectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CDLoanPanel.add(VideoSelectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, 40));

        AudioSelectLabel.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        AudioSelectLabel.setForeground(new java.awt.Color(255, 204, 0));
        AudioSelectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CDLoanPanel.add(AudioSelectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 180, 210, 40));

        jLabel30.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 204, 0));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Logout");
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        CDLoanPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel31.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 153, 0));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Technology Video Store");
        CDLoanPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        VideoSelect.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        VideoSelect.setForeground(new java.awt.Color(255, 204, 0));
        VideoSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VideoSelect.setText("Select");
        VideoSelect.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VideoSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VideoSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VideoSelectMouseClicked(evt);
            }
        });
        CDLoanPanel.add(VideoSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 170, 40));

        jLabel33.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 204, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Audio List");
        CDLoanPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 230, 40));

        jLabel35.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 204, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CDLoanPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 40));

        jLabel34.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 204, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Video List");
        CDLoanPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 230, 40));

        AudioSelect.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        AudioSelect.setForeground(new java.awt.Color(255, 204, 0));
        AudioSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AudioSelect.setText("select");
        AudioSelect.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AudioSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AudioSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AudioSelectMouseClicked(evt);
            }
        });
        CDLoanPanel.add(AudioSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 170, 40));

        AudioList.setBackground(new java.awt.Color(204, 153, 0));
        AudioList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        AudioList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane3.setViewportView(AudioList);

        CDLoanPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 170, 360));

        VideoList.setBackground(new java.awt.Color(204, 153, 0));
        VideoList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        VideoList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(VideoList);

        CDLoanPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 170, 360));

        WelcomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        CDLoanPanel.add(WelcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 620));

        getContentPane().add(CDLoanPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CDReturnLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        CDReturnLoginPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        CDReturnLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 204, 0));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Back");
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        CDReturnLoginPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel36.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 153, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Technology Video Store");
        CDReturnLoginPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel37.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 204, 0));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("LOgin");
        jLabel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        CDReturnLoginPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 260, 40));

        jLabel38.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 204, 0));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Telephone Number");
        CDReturnLoginPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 230, 40));

        jLabel39.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 204, 0));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Name");
        CDReturnLoginPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 230, 40));

        CTelField1.setBackground(new java.awt.Color(204, 204, 0));
        CTelField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CDReturnLoginPanel.add(CTelField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 160, 30));

        CNameField1.setBackground(new java.awt.Color(204, 204, 0));
        CNameField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CDReturnLoginPanel.add(CNameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 160, 30));

        bg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        CDReturnLoginPanel.add(bg5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(CDReturnLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CDReturnPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        CDReturnPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        CDReturnPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 204, 0));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Logout");
        jLabel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        CDReturnPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel41.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 153, 0));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Technology Video Store");
        CDReturnPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        AudioReturnField.setEditable(false);
        AudioReturnField.setBackground(new java.awt.Color(204, 204, 0));
        AudioReturnField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CDReturnPanel.add(AudioReturnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 160, 30));

        VideoReturnField.setEditable(false);
        VideoReturnField.setBackground(new java.awt.Color(204, 204, 0));
        VideoReturnField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CDReturnPanel.add(VideoReturnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 160, 30));

        VideoSelect1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        VideoSelect1.setForeground(new java.awt.Color(255, 204, 0));
        VideoSelect1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VideoSelect1.setText("Return");
        VideoSelect1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        VideoSelect1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VideoSelect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VideoSelect1MouseClicked(evt);
            }
        });
        CDReturnPanel.add(VideoSelect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 170, 40));

        jLabel42.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 204, 0));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Audio List");
        CDReturnPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 230, 40));

        jLabel43.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 204, 0));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CDReturnPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1170, 40));

        jLabel44.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 204, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Video List");
        CDReturnPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 230, 40));

        AudioSelect1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        AudioSelect1.setForeground(new java.awt.Color(255, 204, 0));
        AudioSelect1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AudioSelect1.setText("Return");
        AudioSelect1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AudioSelect1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AudioSelect1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AudioSelect1MouseClicked(evt);
            }
        });
        CDReturnPanel.add(AudioSelect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 170, 40));

        WelcomeLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        CDReturnPanel.add(WelcomeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 620));

        getContentPane().add(CDReturnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        CloseAccountLoginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 102, 0)));
        CloseAccountLoginPanel.setPreferredSize(new java.awt.Dimension(1169, 620));
        CloseAccountLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 204, 0));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Back");
        jLabel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        CloseAccountLoginPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 180, 40));

        jLabel47.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 153, 0));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Technology Video Store");
        CloseAccountLoginPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jLabel48.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 204, 0));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Close account");
        jLabel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel48.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        CloseAccountLoginPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 260, 40));

        jLabel49.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 204, 0));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Telephone Number");
        CloseAccountLoginPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 230, 40));

        jLabel50.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 204, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Name");
        CloseAccountLoginPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 230, 40));

        CTelField2.setBackground(new java.awt.Color(204, 204, 0));
        CTelField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CloseAccountLoginPanel.add(CTelField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 160, 30));

        CNameField2.setBackground(new java.awt.Color(204, 204, 0));
        CNameField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CloseAccountLoginPanel.add(CNameField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 160, 30));

        bg6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vdst.png"))); // NOI18N
        CloseAccountLoginPanel.add(bg6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 620));

        getContentPane().add(CloseAccountLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int flag=0;
        int n=0,i;
        try {
            n=Integer.parseInt(TelephoneField.getText()+"");
        }
        catch(Exception e) {
            flag=1;
            JOptionPane.showMessageDialog(null,"Invalid Telephone number.Please re-enter.");
            TelephoneField.setText("");
        }
        if(flag==0)
        {
            if(NameField.getText().equals("") || TelephoneField.getText().equals("") || AddressArea.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill up the form.");
            }
            else{
                    for(i=0;i<cust.size();i++)
                        if((cust.get(i).getName().equalsIgnoreCase(NameField.getText()+"") && cust.get(i).getAddress().equalsIgnoreCase(AddressArea.getText()+"")) ||(cust.get(i).getName().equalsIgnoreCase(NameField.getText()+"") && (cust.get(i).getTel()+"").equalsIgnoreCase(TelephoneField.getText()+"")))
                        {
                            JOptionPane.showMessageDialog(null,"Customer already registered.");
                            break;
                        }
                    if(i==cust.size())
                    {
                        cust.add(new Customer(NameField.getText()+"",AddressArea.getText()+"",n));
                        cust.get(cust.size()-1).due=0;
                        JOptionPane.showMessageDialog(null,"Successfully registered.");
                    }
            }
            NameField.setText("");
            AddressArea.setText("");
            TelephoneField.setText("");
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        WelcomePanel.setVisible(true);
        NewCustomerPanel.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        WelcomePanel.setVisible(true);
        ManagerLoginPanel.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        char[] correctPassword = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
        if(ManagerField.getText().equals("M1") && Arrays.equals(PasswordField.getPassword(),correctPassword))
        {
            StorePurchasePanel.setVisible(true);
            ManagerLoginPanel.setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(null,"Incorrect Password or Manager ID.");
        ManagerField.setText("");
        PasswordField.setText("");
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        WelcomePanel.setVisible(false);
        ManagerLoginPanel.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        File file=null;
        OutputStream os=null;
        ObjectOutput oo=null;
        file=new File("E:\\customer.ser");
        try {
            file.createNewFile();
            oo=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("E:\\customer.ser")));
            oo.writeObject(cust);
            oo.close();
        } catch (Exception e) {
            Logger.getLogger(StartGUI.class.getName()).log(Level.SEVERE, null, e);
        }
        file=new File("E:\\storepurchase.ser");
        try {
            file.createNewFile();
            oo=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("E:\\storepurchase.ser")));
            oo.writeObject(stp);
            oo.close();
        } catch (Exception e) {
            Logger.getLogger(StartGUI.class.getName()).log(Level.SEVERE, null, e);
        }
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        StorePurchasePanel.setVisible(false);
        ManagerLoginPanel.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private boolean checkDate(int d,int m,int y)throws NumberFormatException
    {
        Date da=new Date();
        Calendar c=Calendar.getInstance();
        da=c.getTime();
        int dd=da.getDate();
        int mm=da.getMonth()+1;
        int yy=da.getYear()+1900;
        if(y>yy)
            return false;
        else if(y==yy && m>mm)
            return false;
        else if(y==yy && m==mm && d>dd)
            return false;
        if(d>31 || d<1 || m>12 || m<1 || y<1)
            return false;
        if(m==2 && d>29)
            return false;
        if(m==2 && d==29)
        {
            if(y%4==0)
            {
                if(y%100==0)
                    if(y%400==0)
                        return true;
                    else
                        return false;
                else
                    return true;
            }
            else
                return false;
                
        }
        if((m==4 ||m==6 ||m==9 ||m==11) && d>30)
            return false;
        else
            return true;
    }
    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        int p=0,r=0,i=0,d=0,m=0,y=0;
        boolean isDate=false;
        try {
            p=Integer.parseInt(PriceField.getText()+"");
            r=Integer.parseInt(RentalField.getText()+"");
            } 
        catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Please fill the form properly.");
                PriceField.setText("");
                RentalField.setText("");
                DayField.setText("dd");
                MonthField.setText("mm");
                YearField.setText("yyyy");
            }
        try {
                d=Integer.parseInt(DayField.getText()+"");
                m=Integer.parseInt(MonthField.getText()+"");
                y=Integer.parseInt(YearField.getText()+"");
            } 
        catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Please fill in the dates.");
                DayField.setText("dd");
                MonthField.setText("mm");
                YearField.setText("yyyy");
            }
        isDate=checkDate(d,m,y);
        if(isDate==false)
        {
            JOptionPane.showMessageDialog(null,"Please enter valid date.");
            DayField.setText("dd");
            MonthField.setText("mm");
            YearField.setText("yyyy");
        }
        if(!PriceField.getText().equals("") && !RentalField.getText().equals("") && !NameField1.getText().equals("") && !DayField.getText().equals("") && !MonthField.getText().equals("") && !YearField.getText().equals(""))
        {
            stp.add(new storePurchase(NameField1.getText(),Integer.parseInt(DayField.getText()+""),Integer.parseInt(MonthField.getText()+""),Integer.parseInt(YearField.getText()+""),p,r,AVComboBox.getSelectedItem()+""));
            PriceField.setText("");
            RentalField.setText("");
            DayField.setText("dd");
            MonthField.setText("mm");
            YearField.setText("yyyy");
            NameField1.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please fill the form properly.");
        }
        
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        NewCustomerPanel.setVisible(true);
        WelcomePanel.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        CDLoanLoginPanel.setVisible(false);
        WelcomePanel.setVisible(true);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        Date d=new Date();
        Calendar c=Calendar.getInstance();
        d=c.getTime();
        int dd=d.getDate();
        int mm=d.getMonth()+1;
        int yy=d.getYear()+1900;
        //System.out.println(dd+"-"+mm+"-"+yy);
        int i=0;
        try {
        for(i=0;i<cust.size();i++)
        {
            if(CNameField.getText().equalsIgnoreCase(cust.get(i).getName()) && Integer.parseInt(CTelField.getText()+"")==cust.get(i).getTel())
            {
                JOptionPane.showMessageDialog(null,"Login Successful.");
                CDLoanPanel.setVisible(true);
                CDLoanLoginPanel.setVisible(false);
                break;
            }
        }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Invalid details or not a Registered Member.");
        }
        if(i==cust.size())
        {
            JOptionPane.showMessageDialog(null,"Invalid details or not a Registered Member.");
        }
        else
        {
            custid=i;
            jLabel35.setText("Welcome, "+CNameField.getText());
            if(cust.get(i).isAudio==false)
                AudioSelectLabel.setText("Select Any 1");
            else
                AudioSelectLabel.setText("Cannot Select");
            if(cust.get(i).isVideo==false)
                VideoSelectLabel.setText("Select Any 1");
            else
                VideoSelectLabel.setText("Cannot Select");
            DefaultListModel model1=new DefaultListModel();
            DefaultListModel model2=new DefaultListModel();
            for(i=0;i<stp.size();i++)
            {
                if(stp.get(i).AV.equalsIgnoreCase("Audio") && stp.get(i).isAvailable==true)
                    model2.addElement(stp.get(i).name+" Rs. "+stp.get(i).getRental(dd, mm,yy));
                else if(stp.get(i).AV.equalsIgnoreCase("Video") && stp.get(i).isAvailable==true)
                    model1.addElement(stp.get(i).name+" Rs. "+stp.get(i).getRental(dd, mm, yy));
                
            }
            VideoList.setModel(model1);
            AudioList.setModel(model2);
          }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        CDLoanLoginPanel.setVisible(true);
        WelcomePanel.setVisible(false);
        CNameField.setText("");
        CTelField.setText("");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        CDLoanPanel.setVisible(false);
        WelcomePanel.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void VideoSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VideoSelectMouseClicked
        Date d=new Date();
        Calendar c=Calendar.getInstance();
        d=c.getTime();
        int dd=d.getDate();
        int mm=d.getMonth()+1;
        int yy=d.getYear()+1900;
        if(cust.get(custid).isVideo==true || VideoList.getLastVisibleIndex()==-1 || VideoList.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null,"Error.You cannot select any Video CD.");
        else
        {
            VideoSelectLabel.setText("Cannot Select");
            cust.get(custid).isVideo=true;
            for(int i=0;i<stp.size();i++)
                if(stp.get(i).name.equalsIgnoreCase(((String)VideoList.getSelectedValue()).substring(0,((String)VideoList.getSelectedValue()).length()-6)+"") || stp.get(i).name.equalsIgnoreCase(((String)VideoList.getSelectedValue()).substring(0,((String)VideoList.getSelectedValue()).length()-7)+"") || stp.get(i).name.equalsIgnoreCase(((String)VideoList.getSelectedValue()).substring(0,((String)VideoList.getSelectedValue()).length()-8)+"") || stp.get(i).name.equalsIgnoreCase(((String)VideoList.getSelectedValue()).substring(0,((String)VideoList.getSelectedValue()).length()-9)+""))
                {
                    DefaultListModel model=(DefaultListModel)VideoList.getModel();
                    int selectedIndex = VideoList.getSelectedIndex();
                    if (selectedIndex != -1) 
                        model.remove(selectedIndex);
                    JOptionPane.showMessageDialog(null,"You have seleted "+stp.get(i).name+" Video CD.\nYour daily rental charge will be Rs."+stp.get(i).getRental(dd,mm,yy));
                    cust.get(custid).namevid=stp.get(i).name;
                    cust.get(custid).idv=dd;
                    cust.get(custid).imv=mm;
                    cust.get(custid).iyv=yy;
                    cust.get(custid).rentVideo=stp.get(i).getRental(dd, mm, yy);
                    stp.get(i).isAvailable=false;
                    break;
                }
        }
            
    }//GEN-LAST:event_VideoSelectMouseClicked

    private void AudioSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AudioSelectMouseClicked
        Date d=new Date();
        Calendar c=Calendar.getInstance();
        d=c.getTime();
        int dd=d.getDate();
        int mm=d.getMonth()+1;
        int yy=d.getYear()+1900;
        if(cust.get(custid).isAudio==true || AudioList.getLastVisibleIndex()==-1 || AudioList.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null,"Error.You cannot select any Audio CD.");
        else
        {
            AudioSelectLabel.setText("Cannot Select");
            cust.get(custid).isAudio=true;
            for(int i=0;i<stp.size();i++)
                if(stp.get(i).name.equalsIgnoreCase(((String)AudioList.getSelectedValue()).substring(0,((String)AudioList.getSelectedValue()).length()-6)+"") || stp.get(i).name.equalsIgnoreCase(((String)AudioList.getSelectedValue()).substring(0,((String)AudioList.getSelectedValue()).length()-7)+"") || stp.get(i).name.equalsIgnoreCase(((String)AudioList.getSelectedValue()).substring(0,((String)AudioList.getSelectedValue()).length()-8)+"") || stp.get(i).name.equalsIgnoreCase(((String)AudioList.getSelectedValue()).substring(0,((String)AudioList.getSelectedValue()).length()-9)+""))
                {
                    DefaultListModel model=(DefaultListModel)AudioList.getModel();
                    int selectedIndex = AudioList.getSelectedIndex();
                    if (selectedIndex != -1) 
                        model.remove(selectedIndex);
                    JOptionPane.showMessageDialog(null,"You have seleted "+stp.get(i).name+" Audio CD.\nYour dailty rental charge will be Rs."+stp.get(i).getRental(dd,mm,yy));
                    cust.get(custid).nameaud=stp.get(i).name;
                    cust.get(custid).ida=dd;
                    cust.get(custid).ima=mm;
                    cust.get(custid).iya=yy;
                    cust.get(custid).rentAudio=stp.get(i).getRental(dd, mm, yy);
                    stp.get(i).isAvailable=false;
                    break;
                }
        }
    }//GEN-LAST:event_AudioSelectMouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        CDReturnLoginPanel.setVisible(false);
        WelcomePanel.setVisible(true);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        int i;
        for(i=0;i<cust.size();i++)
        {
            if(CNameField1.getText().equalsIgnoreCase(cust.get(i).getName()) && Integer.parseInt(CTelField1.getText()+"")==cust.get(i).getTel())
            {
                JOptionPane.showMessageDialog(null,"Login Successful.");
                jLabel43.setText("Welcome, "+cust.get(i).getName());
                CDReturnPanel.setVisible(true);
                CDReturnLoginPanel.setVisible(false);
                break;
            }
        }
        if(i==cust.size())
        {
            JOptionPane.showMessageDialog(null,"Invalid details or not a Registered Member.");
        }
        else
        {
            custid=i;
            if(cust.get(i).isVideo==true)
                VideoReturnField.setText(""+cust.get(i).namevid);
            else
                VideoReturnField.setText("");
            if(cust.get(i).isAudio==true)
                AudioReturnField.setText(""+cust.get(i).nameaud);
            else
                AudioReturnField.setText("");
        }
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        WelcomePanel.setVisible(false);
        CDReturnLoginPanel.setVisible(true);
        CNameField1.setText("");
        CTelField1.setText("");
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        WelcomePanel.setVisible(true);
        CDReturnPanel.setVisible(false);
    }//GEN-LAST:event_jLabel40MouseClicked

    private int getDay(int m,int y)
    {
        if(m==2 && (y%4==0 || (y%100==0 && y%400==0)))
                return 29;
        else if(m==2)
            return 28;
        if(m==4 ||m==6 ||m==9 ||m==11)
            return 30;
        else
            return 31;
    }
    private int generateDue(int day,int m,int y,char ch)
    {
        int due=0;
        Date d=new Date();
        Calendar c=Calendar.getInstance();
        d=c.getTime();
        int dd=d.getDate();
        int mm=d.getMonth()+1;
        int yy=d.getYear()+1900;
        int dy,dm=0,dda,i;
        dy=yy-y;
        for(i=m+1;i<=12;i++)
        {
            if(i==4 ||i==6 ||i==9 ||i==11)
                dm+=30;
            else if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                dm+=31;
            else if(m==2 && (y%4==0 || (y%100==0 && y%400==0)))
                dm+=29;
            else if(m==2)
                dm+=28;
        }
        for(i=1;i<mm;i++)
        {
            if(i==4 ||i==6 ||i==9 ||i==11)
                dm+=30;
            else if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                dm+=31;
            else if(mm==2 && (yy%4==0 || (yy%100==0 && yy%400==0)))
                dm+=29;
            else if(mm==2)
                dm+=28;
        }
        dda=((mm-m)>0)?(getDay(m,y)-day+dd):(getDay(mm,yy)-dd+day);
        dda=dda<0?getDay(mm,yy)-dda:dda;
        if(dy>=2)
         dda+=dm+(dy-1)*365;
        else
            dda+=dm;
        if(mm==m)
            dda=dd-day;
        if(ch=='a')
            due=(dda+1)*cust.get(custid).rentAudio;
        else
            due=(dda+1)*cust.get(custid).rentVideo;
        return due;
    }
    private void VideoSelect1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VideoSelect1MouseClicked
        if(VideoReturnField.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Nothing to return!");
        else
        {
            int dd=cust.get(custid).idv;
            int mm=cust.get(custid).imv;
            int yy=cust.get(custid).iyv;
            int due=generateDue(dd,mm,yy,'v');
            int n = JOptionPane.showConfirmDialog(null,"Would you like to return your due?\n Your due is Rs."+due,"Confirm",JOptionPane.YES_NO_OPTION);
            if(n==JOptionPane.YES_OPTION)
                cust.get(custid).due+=0;
            else
                cust.get(custid).due+=due;
            cust.get(custid).isVideo=false;
            for(int i=0;i<stp.size();i++)
                if(stp.get(i).name.equalsIgnoreCase(VideoReturnField.getText()))
                {
                    stp.get(i).isAvailable=true;
                    break;
                }
            VideoReturnField.setText("");
        }
                 
    }//GEN-LAST:event_VideoSelect1MouseClicked

    private void AudioSelect1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AudioSelect1MouseClicked
        if(AudioReturnField.getText().equals(""))
            JOptionPane.showMessageDialog(null,"Nothing to return!");
        else
        {
            int dd=cust.get(custid).ida;
            int mm=cust.get(custid).ima;
            int yy=cust.get(custid).iya;
            int due=generateDue(dd,mm,yy,'a');
            int n = JOptionPane.showConfirmDialog(null,"Would you like to return you due?\n Your due is Rs."+due,"Confirm",JOptionPane.YES_NO_OPTION);
            if(n==JOptionPane.YES_OPTION)
                cust.get(custid).due+=0;
            else
                cust.get(custid).due+=due;
            for(int i=0;i<stp.size();i++)
                if(stp.get(i).name.equalsIgnoreCase(AudioReturnField.getText()))
                {
                    stp.get(i).isAvailable=true;
                    break;
                }
            AudioReturnField.setText("");
            cust.get(custid).isAudio=false;
        }
    }//GEN-LAST:event_AudioSelect1MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
         CloseAccountLoginPanel.setVisible(true);
         WelcomePanel.setVisible(false);
         CNameField2.setText("");
         CTelField2.setText("");
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        CloseAccountLoginPanel.setVisible(false);
        WelcomePanel.setVisible(true);
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        int i;
        for(i=0;i<cust.size();i++)
        {
            if(CNameField2.getText().equalsIgnoreCase(cust.get(i).getName()) && Integer.parseInt(CTelField2.getText()+"")==cust.get(i).getTel())
            {
                JOptionPane.showMessageDialog(null,"Login Successful.");
                break;
            }
        }
        if(i==cust.size())
            JOptionPane.showMessageDialog(null,"Invalid details or not a Registered member.");
        else
        {
            if(cust.get(i).due>0 && cust.get(i).isAudio==false && cust.get(i).isVideo==false){
                int n = JOptionPane.showConfirmDialog(null,"Please return your due.\n Your due is Rs."+cust.get(i).due,"Confirm",JOptionPane.YES_NO_OPTION);
                if(n==JOptionPane.YES_OPTION)
                {
                    cust.remove(i);
                    JOptionPane.showMessageDialog(null,"Successfully closed your account. You get back your Rs. 1000");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry, you have due outstanding against your account.\nYou cannot get your Rs.1000/- back.");
                }
            }
            else if(cust.get(i).isAudio==true || cust.get(i).isVideo==true)
                JOptionPane.showMessageDialog(null,"Sorry, you have Video store CDs in your possession.\nPlease return them.");
            else
            {
                cust.remove(i);
                JOptionPane.showMessageDialog(null,"Successfully closed your account. You get back your Rs. 1000");
            }
        }
    }//GEN-LAST:event_jLabel48MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AVComboBox;
    private javax.swing.JTextArea AddressArea;
    private javax.swing.JList AudioList;
    private javax.swing.JTextField AudioReturnField;
    private javax.swing.JLabel AudioSelect;
    private javax.swing.JLabel AudioSelect1;
    private javax.swing.JLabel AudioSelectLabel;
    private javax.swing.JPanel CDLoanLoginPanel;
    private javax.swing.JPanel CDLoanPanel;
    private javax.swing.JPanel CDReturnLoginPanel;
    private javax.swing.JPanel CDReturnPanel;
    private javax.swing.JTextField CNameField;
    private javax.swing.JTextField CNameField1;
    private javax.swing.JTextField CNameField2;
    private javax.swing.JTextField CTelField;
    private javax.swing.JTextField CTelField1;
    private javax.swing.JTextField CTelField2;
    private javax.swing.JPanel CloseAccountLoginPanel;
    private javax.swing.JTextField DayField;
    private javax.swing.JTextField ManagerField;
    private javax.swing.JPanel ManagerLoginPanel;
    private javax.swing.JTextField MonthField;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField NameField1;
    private javax.swing.JPanel NewCustomerPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PriceField;
    private javax.swing.JTextField RentalField;
    private javax.swing.JPanel StorePurchasePanel;
    private javax.swing.JTextField TelephoneField;
    private javax.swing.JList VideoList;
    private javax.swing.JTextField VideoReturnField;
    private javax.swing.JLabel VideoSelect;
    private javax.swing.JLabel VideoSelect1;
    private javax.swing.JLabel VideoSelectLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel WelcomeLabel1;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JTextField YearField;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JLabel bg2;
    private javax.swing.JLabel bg3;
    private javax.swing.JLabel bg4;
    private javax.swing.JLabel bg5;
    private javax.swing.JLabel bg6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
