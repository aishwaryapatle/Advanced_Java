
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class View {

 private JFrame frmPersonTable;
 private JTextField txtID;
 private JTextField txtFname;
 private JTextField txtLname;
 private JTextField txtAge;
 public JTable table;

 private PreparedStatement stmt;
 private ResultSet rs;
 private Connection conn;
 
 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     View window = new View();
     window.frmPersonTable.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public View() {
  initialize();
  try {
   conn = DBUtils.getConnection();
  } catch (Exception e) {
   e.printStackTrace();
  }

  showTable();
 }

 public ArrayList<User> getArrayList(){
  ArrayList <User> list  = new ArrayList();
  try {
   stmt = conn.prepareStatement("Select * From person.user");
   rs = stmt.executeQuery();
   while(rs.next()){
    User user = new User(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastname"),rs.getInt("age"));
    list.add(user);
   }
  } catch (Exception e) {
   e.printStackTrace();
  }
  
  return list;
 }
 public void showTable(){
  ArrayList <User> list = getArrayList();
  DefaultTableModel model = (DefaultTableModel)table.getModel();
  Object[] cols = new Object[4];
  for (int i = 0; i < list.size(); i++) {
   cols[0] = list.get(i).getId();
   cols[1] = list.get(i).getFirstName();
   cols[2] = list.get(i).getLastName();
   cols[3] = list.get(i).getAge();
   model.addRow(cols);
  }
 }
 
 public void queryUpdate(String sql,String message){
  try {
   stmt = conn.prepareStatement(sql);
   if(stmt.executeUpdate()==1){
    DefaultTableModel model = (DefaultTableModel)table.getModel();
    model.setRowCount(0);
    showTable();
    JOptionPane.showMessageDialog(null, message + " Successfully!");
   }
  } catch (SQLException se) {
   se.printStackTrace();
  }
 }
 /**
  * Initialize the contents of the frame.
  */
 private void initialize() {
  frmPersonTable = new JFrame();
  frmPersonTable.setTitle("Person Table\r\n");
  frmPersonTable.setBounds(100, 100, 450, 300);
  frmPersonTable.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frmPersonTable.getContentPane().setLayout(null);
  
  txtID = new JTextField();
  txtID.setBounds(137, 13, 127, 20);
  frmPersonTable.getContentPane().add(txtID);
  txtID.setColumns(10);
  
  txtFname = new JTextField();
  txtFname.setColumns(10);
  txtFname.setBounds(137, 44, 127, 20);
  frmPersonTable.getContentPane().add(txtFname);
  
  txtLname = new JTextField();
  txtLname.setColumns(10);
  txtLname.setBounds(137, 80, 127, 20);
  frmPersonTable.getContentPane().add(txtLname);
  
  txtAge = new JTextField();
  txtAge.setColumns(10);
  txtAge.setBounds(137, 114, 127, 20);
  frmPersonTable.getContentPane().add(txtAge);
  
  JButton btnInser = new JButton("Insert");
//  btnInser.setIcon(new ImageIcon("C:\\Users\\Lonely\\workspace\\add-icon.png"));
  btnInser.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    String sql ="INSERT INTO person.user (firstname, lastname, age) "
       + "VALUES ('"+txtFname.getText()+"', '"+txtLname.getText()+"', '"+txtAge.getText()+"')";
    queryUpdate(sql,"Insert");
   }
  });

  btnInser.setBounds(309, 10, 98, 23);
  frmPersonTable.getContentPane().add(btnInser);
  
  JButton btnUdate = new JButton("Update");
//  btnUdate.setIcon(new ImageIcon("C:\\Users\\Lonely\\workspace\\Actions-edit-redo-icon.png"));
  btnUdate.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent arg0) {
    String sql="UPDATE person.user SET firstname='"+txtFname.getText()+"', lastname='"+txtLname.getText()+"', age='"+txtAge.getText()+"' WHERE id='"+txtID.getText()+"'";
    queryUpdate(sql, "Update");
   }
  });
  btnUdate.setBounds(309, 56, 98, 23);
  frmPersonTable.getContentPane().add(btnUdate);
  
  JButton btnDelete = new JButton("Delete");
//  btnDelete.setIcon(new ImageIcon("C:\\Users\\Lonely\\workspace\\Actions-edit-delete-icon.png"));
  btnDelete.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    String sql = "DELETE FROM person.user WHERE id='"+txtID.getText()+"'";
    queryUpdate(sql, "Delete");
   }
  });

  btnDelete.setBounds(309, 111, 98, 23);
  frmPersonTable.getContentPane().add(btnDelete);
  
  JScrollPane scrollPane = new JScrollPane();
  scrollPane.setBounds(10, 143, 414, 108);
  frmPersonTable.getContentPane().add(scrollPane);
  
  table = new JTable();
  table.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent arg0) {
    int row = table.getSelectedRow();
    TableModel model = (TableModel)table.getModel();
    txtID.setText(model.getValueAt(row, 0).toString());
    txtFname.setText(model.getValueAt(row, 1).toString());
    txtLname.setText(model.getValueAt(row, 2).toString());
    txtAge.setText(model.getValueAt(row, 3).toString());
    
   }
  });

  table.setModel(new DefaultTableModel(
   new Object[][] {
   },
   new String[] {
    "id", "first", "Last", "Age"
   }
  ));
  scrollPane.setViewportView(table);
  
  JLabel lblId = new JLabel("ID");
  lblId.setBounds(29, 14, 76, 14);
  frmPersonTable.getContentPane().add(lblId);
  
  JLabel lblLastname = new JLabel("LastName");
  lblLastname.setBounds(29, 81, 76, 14);
  frmPersonTable.getContentPane().add(lblLastname);
  
  JLabel lblFirstname = new JLabel("FirstName");
  lblFirstname.setBounds(29, 45, 76, 14);
  frmPersonTable.getContentPane().add(lblFirstname);
  
  JLabel lblAge = new JLabel("Age");
  lblAge.setBounds(29, 115, 76, 14);
  frmPersonTable.getContentPane().add(lblAge);
 }
}