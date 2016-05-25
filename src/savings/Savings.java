/**
 * Savings.java
 * @author  Brandon Knieriem
 * @version Last updated April 29, 2016
 */

package savings;

import java.io.*;
import java.security.*;
import java.util.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Savings extends Application {
	/* Shared GUI */
    Stage		st;
    Background 	bkAzure 
    = new Background(new BackgroundFill(Color.AZURE, null, new Insets(4)) );
    Font 		fSavings 		
    = Font.font ("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 14);
    Font 		fBigSavings 	
    = Font.font ("Calibri", FontWeight.BOLD, FontPosture.REGULAR, 24);
    Integer 	width 			= 600;
    Integer 	height 			= 400;
	/* 0: Boss - New Boss */
    Pane		newBuserPane	= new Pane();
    Pane		newBuserTitle	= new Pane();
    Text		tNewBUser		= new Text("Add New Boss");
    VBox		vbBFieldDesc	= new VBox(10);
    Text		tBLastName		= new Text("Last Name:");
    Text		tBFirstName		= new Text("First Name:");
    Text		tBMiddleName	= new Text("Middle Name:");
    Text		tBSalary		= new Text("Salary:");
    Text		tBSavingsPe		= new Text("% Savings:");
    Text		tBLoginID		= new Text("Login ID:");
    VBox		vbBNewEmpFields	= new VBox();
    TextField	tfBNewLastName	= new TextField();
    TextField	tfBNewFirstName	= new TextField();
    TextField	tfBNewMiddleName= new TextField();
    TextField	tfBNewSalary	= new TextField();
    TextField	tfBNewSavingsPe = new TextField();
    TextField	tfBNewLoginID	= new TextField();
    HBox		hbBEmpType		= new HBox(10);
	HBox		hbBNewUser		= new HBox(10);
	Button		btBAddNew		= new Button("Add New Boss");
    /* 1: Login */
	Pane 		loginMenu 		= new Pane();
	Pane		savingsTitle	= new Pane();
	Pane		savingsAuthor	= new Pane();
    HBox 		vbLoginBut 		= new HBox(10);
    VBox 		vbNamePassField	= new VBox();
    VBox 		vbNamePassText	= new VBox(10);
    TextField	tfLogin 		= new TextField();
    TextField 	tfPassword 		= new TextField();
    Text 		tLogin 			= new Text("Login:");
    Text 		tPassword 		= new Text("Password:");
    Button 		btLogin 		= new Button("Login");
    Pane		exitPane		= new Pane();
    Button 		btLoginClose 	= new Button("Close");
    Text		tSavings		= new Text("Savings\nby Brandon Knieriem");
    /* 2: Boss - Menu */
    Pane		bossPane		= new Pane();
    HBox		hbScrollPane	= new HBox(1);
	TextArea	taEmp			= new TextArea();
    HBox		hbMenuBts		= new HBox(10);
    Button		btCreateEmp		= new Button("New Employee");
    Button		btChangeEmp		= new Button("Change Employee");
    Button		btSavingsRep	= new Button("Savings Report");
    Button 		btMenuClose 	= new Button("Close");
	/* 3: Boss - New User */
    Pane		newuserPane		= new Pane();
    Pane		newuserTitle	= new Pane();
    Text		tNewUser		= new Text("Add New User");
    VBox		vbFieldDesc		= new VBox(10);
    Text		tLastName		= new Text("Last Name:");
    Text		tFirstName		= new Text("First Name:");
    Text		tMiddleName		= new Text("Middle Name:");
    Text		tSalary			= new Text("Salary:");
    Text		tSavingsPercent = new Text("% Savings:");
    Text		tLoginID		= new Text("Login ID:");
    VBox		vbNewEmpFields	= new VBox();
    TextField	tfNewLastName	= new TextField();
    TextField	tfNewFirstName	= new TextField();
    TextField	tfNewMiddleName	= new TextField();
    TextField	tfNewSalary		= new TextField();
    TextField	tfNewSavingsPerc= new TextField();
    TextField	tfNewLoginID	= new TextField();
    HBox		hbEmpType		= new HBox(10);
	RadioButton	rbtEmpHourly	= new RadioButton("Hourly Employee");
	RadioButton	rbtEmpSal		= new RadioButton("Salary Employee");
	HBox		hbNewUser		= new HBox(10);
	Button		btAddNew		= new Button("Add New User");
	Button		btNUBack		= new Button("Back");
	/* 4: Boss - Change User Data */
	Pane		changeuserPane	= new Pane();
	VBox		vbCUDesc		= new VBox(10);
	Pane		pUpdateUserT	= new Pane();
	Text		tUpdateUser		= new Text("Update User");
	Text		tID				= new Text("Search User ID:");
	Text		tLName			= new Text("Change Last Name:");
	Text		tSal			= new Text("Change Salary:");
	VBox		vbCUFields		= new VBox(1);
	TextField	tfFindID		= new TextField();
	TextField	tfLName			= new TextField();
	TextField	tfSal			= new TextField();
	HBox		hbNUBts			= new HBox(10);
	Button		btUpdate		= new Button("Update");
	Button		btTerminate		= new Button("Terminate");
	Button		btCHBack		= new Button("Back");
	/* 5: Boss - Savings Report */
	Pane		savingsPane		= new Pane();
	Pane		savingsTPane	= new Pane();
	Text		tSavingsRepGen	= new Text("Savings report file generated.");
	HBox		hbSavings		= new HBox(1);
	TextArea	taSavings		= new TextArea();
	HBox		hbSavingsBts	= new HBox(10);
	Button		btSavingsBack	= new Button("Back");
	/* 6: Employee - Menu */
	Pane			empPane		= new Pane();
	Pane			imagePane	= new Pane();
	Pane			empTPane	= new Pane();
	Pane			empNote		= new Pane();
	Text			tEmpMenu	= new Text("Employee Portal");
	Text			tEmpNotif	= new Text("You have no power here.");
	HBox			hbEmpMenuBts= new HBox(10);
	Button			btQuit		= new Button("Quit");
	ImageView 		im			= new ImageView(new Image("Conglomo.jpg"));
	Integer			iImDimW		= 440;
	Integer			iImDimH		= 472;
	/* 7: New Password */
	Pane			newPassPane = new Pane();
	Pane			pNewPassT	= new Pane();
	Text			tNewPass	= new Text("Create Administrator Password");
	VBox			vbPassDesc	= new VBox(10);
	Text			tEnterPas1  = new Text("Enter the password:");
	Text			tEnterPas2  = new Text("Repeat the password:");
	VBox			vbPassTF	= new VBox(1);
	TextField		tfEnterPas1 = new TextField();
	TextField		tfEnterPas2 = new TextField();
	HBox			hbPassBts	= new HBox(1);
	Button			btConfirm	= new Button("Confirm Password");
	/* Scenes */
    Scene scNewBoss 		= new Scene(newBuserPane, width-300, height-135);
	Scene scLogin 			= new Scene(loginMenu, width-310, height-300);
    Scene scBMenu 			= new Scene(bossPane, width, height+20);
	Scene scNewUser 		= new Scene(newuserPane, width-300, height-135);
    Scene scChangeUser 		= new Scene(changeuserPane, width-300, height-220);
    Scene scSavingsReport 	= new Scene(savingsPane, width+10, height+10);
    Scene scEmpMenu 		= new Scene(empPane, 440, 472);
    Scene scNewPass			= new Scene(newPassPane, width-310, height-300);
    /* Arithmetic, Logic, Data Structures */
	int 						id;
	static String 				lastname;
	static String 				firstname;
	static String 				middlename;
	static String 				login;
	static String				currentLogin;
	static double 				salary;
	static double 				savingspercent;
	Boolean 					isEmployee;
	static Boolean 				empCheck = false;
	static Boolean				bossCheck = false;
	String 						date;
	/** The Employee list. */
	static ArrayList<Employee> 	empList = new ArrayList<Employee>();
	/** The list of terminated employees. */
	static ArrayList<Employee> 	termList = new ArrayList<Employee>();
	/* I/O */
	static Scanner				scIn;
	Scanner 					scRead;
	static PrintWriter 			pw;
    //--------------------------------------------------------------------------

	public static void main (String[] args){
    	launch(args);
    }
    public void start( Stage st ) throws IOException, ClassNotFoundException {
    	/* New Boss Listen */
    	btBAddNew.setOnAction		(new EHAddBoss() );
    	/* Login Listen */
    	btLogin.setOnAction			(new EHSecureLogin() );
    	btLoginClose.setOnAction	(new EHSafeExit() );
    	/* Boss Menu Listen */
    	btCreateEmp.setOnAction		(new EHAddNewUserfromMenu() );
    	btChangeEmp.setOnAction		(new EHChangeUserMenu() );
    	btSavingsRep.setOnAction	(new EHSavingsReport() );
    	btMenuClose.setOnAction		(new EHSafeExit() );
    	/* New User Listen */
    	btAddNew.setOnAction		(new EHAddNewUser() );
    	btNUBack.setOnAction		(new EHReturntoBMenu() );
    	/* Update User Listen */	
    	btUpdate.setOnAction		(new EHUpdateUser() );
    	btTerminate.setOnAction		(new EHTerminateUser() );
    	btCHBack.setOnAction		(new EHReturntoBMenu() );
    	/* Savings Report Listen */
    	btSavingsBack.setOnAction	(new EHReturntoBMenu() );
    	/* Employee Menu Listen */
    	btQuit.setOnAction			(new EHSafeExit() );
    	/* New Password Listen */
    	btConfirm.setOnAction		(new EHNewPass() );
    	/* Radio Button Grouping */
    	final ToggleGroup EmpTypeGroup = new ToggleGroup();
    	rbtEmpHourly.setToggleGroup(EmpTypeGroup);
    	rbtEmpSal.setToggleGroup(EmpTypeGroup);
    	rbtEmpSal.setSelected(true);
    	/* Build GUI */
        st.setResizable(false);
    	buildGUI();
        this.st = st;
        st.setTitle("CONGLOM-O: Employee Management Program");
    	/**
    	 * Instantiates a new Savings.
    	 *
    	 * @throws IOException Signals that an I/O exception has occurred.
    	 * @throws ClassNotFoundException the class not found exception
    	 */
    	/* Realize the Database here: Try Block */
		try {
			/* Just like putting file inside of Scanner.
			 * Reading in the file as objects and storing them in empList*/
			FileInputStream fis = new FileInputStream("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee.nextID = ois.readInt();
			empList  = (ArrayList<Employee>)ois.readObject();
			ois.close();
			LoginMenu();
			}
		catch(FileNotFoundException e) {
			System.out.println("Database not found. Create a Salary Boss.");
			NewPass();
		}
        st.show();
        /* Attempt to write to the database file. */
		try {
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeInt(Employee.nextID);
			oos.writeObject(empList);
			oos.close();
		}
		catch(IOException e) {
			System.out.println("ERROR: I/O Exception.");
		}
	}
    //-------------------------------------------------------------------------
    public void buildGUI(){
    	/* 0: New Boss */
    	// Text - Title, Fields, Field Descriptions
	    tNewBUser.setFont(fBigSavings);
	    newBuserTitle.getChildren().addAll(tNewBUser);
	    newBuserTitle.setLayoutX(width-515); newBuserTitle.setLayoutY(30);
	    
	    vbBFieldDesc.getChildren().addAll(tBLastName, tBFirstName, tBMiddleName, 
	    								 tBSalary, tBSavingsPe, tBLoginID);
	    vbBFieldDesc.setLayoutX(10); vbBFieldDesc.setLayoutY(75);
	    vbBFieldDesc.setAlignment(Pos.BASELINE_RIGHT);
	    
	    vbBNewEmpFields.getChildren().addAll(tfBNewLastName, tfBNewFirstName,
	    									tfBNewMiddleName, tfBNewSalary,
	    									tfBNewSavingsPe, tfBNewLoginID);
	    vbBNewEmpFields.setLayoutX(125); vbBNewEmpFields.setLayoutY(75);
	    vbBNewEmpFields.setPrefWidth(150);
	    	// Buttons
		hbBNewUser.getChildren().addAll(btBAddNew);
		hbBNewUser.setLayoutX(125); hbBNewUser.setLayoutY(height-170);
	    	// Build
		newBuserPane.setBackground(bkAzure);
		newBuserPane.getChildren().addAll(hbBNewUser, vbBNewEmpFields, 
										  newBuserTitle, vbBFieldDesc);
    
    	/* 1: Login */
        	// Login: Password:
        vbNamePassText.getChildren().addAll(tLogin, tPassword);
        vbNamePassText.setLayoutX(10);		vbNamePassText.setLayoutY(10);
        savingsTitle.getChildren().addAll(tSavings);
        savingsTitle.setLayoutX(10); savingsTitle.setLayoutY(75);
        tSavings.setFont(fSavings);
        vbNamePassText.setAlignment(Pos.BASELINE_RIGHT);
        	// Login Text Fields
        vbNamePassField.getChildren().addAll(tfLogin, tfPassword);
        vbNamePassField.setMinWidth(185); 	vbNamePassField.setMaxHeight(1);
        vbNamePassField.setLayoutX(100); 	vbNamePassField.setLayoutY(5);
        	// Buttons - Login, Close
        btLoginClose.setMinWidth(50); btLogin.setMinWidth(50);
        vbLoginBut.getChildren().addAll(btLogin, btLoginClose);
        vbLoginBut.setLayoutX(175); vbLoginBut.setLayoutY(65);
        	// Build Scene
        loginMenu.setBackground(bkAzure);
        loginMenu.getChildren().addAll(vbLoginBut, vbNamePassField, 
        							   vbNamePassText, savingsTitle);

        /* 2: Boss - Menu */
        	// Scrolling List - Current Employees
        taEmp.setPrefWidth(width-20); taEmp.setPrefHeight(height-55);
        hbScrollPane.setLayoutX(10); hbScrollPane.setLayoutY(10);
        hbScrollPane.getChildren().addAll(taEmp);

        	// Buttons - New User, Change User Data, Savings Report
        hbMenuBts.getChildren().addAll(btCreateEmp, btChangeEmp, btSavingsRep);
        hbMenuBts.setLayoutX(10); hbMenuBts.setLayoutY(height-25);
        exitPane.getChildren().addAll(btMenuClose);
        exitPane.setLayoutX(width-55); exitPane.setLayoutY(height-25);
        
        	// Build Scene
        bossPane.setBackground(bkAzure);
        bossPane.getChildren().addAll(hbScrollPane, hbMenuBts, exitPane);
        
        /* 3: Boss - New User */
        	// Text - Title, Fields, Field Descriptions
        tNewUser.setFont(fBigSavings);
        newuserTitle.getChildren().addAll(tNewUser);
        newuserTitle.setLayoutX(width-515); newuserTitle.setLayoutY(30);
        
        vbFieldDesc.getChildren().addAll(tLastName, tFirstName, tMiddleName, 
        								 tSalary, tSavingsPercent, tLoginID);
        vbFieldDesc.setLayoutX(10); vbFieldDesc.setLayoutY(75);
        vbFieldDesc.setAlignment(Pos.BASELINE_RIGHT);
        
        vbNewEmpFields.getChildren().addAll(tfNewLastName, tfNewFirstName,
        									tfNewMiddleName, tfNewSalary,
        									tfNewSavingsPerc, tfNewLoginID);
        vbNewEmpFields.setLayoutX(125); vbNewEmpFields.setLayoutY(75);
        vbNewEmpFields.setPrefWidth(150);
        	// Buttons
		hbEmpType.getChildren().addAll(rbtEmpHourly, rbtEmpSal);
		hbEmpType.setLayoutX(width-560); hbEmpType.setLayoutY(50);
		hbNewUser.getChildren().addAll(btAddNew, btNUBack);
		hbNewUser.setLayoutX(125); hbNewUser.setLayoutY(height-170);
        	// Build
		newuserPane.setBackground(bkAzure);
		newuserPane.getChildren().addAll(hbNewUser, vbNewEmpFields, 
										 hbEmpType, newuserTitle, vbFieldDesc);
        
        /* 4: Boss - Change User Data */
        	// Text
        		// Title
        pUpdateUserT.getChildren().addAll(tUpdateUser);
        tUpdateUser.setFont(fBigSavings);
        pUpdateUserT.setLayoutX(width-515); pUpdateUserT.setLayoutY(35);
        		// Update Data
        vbCUDesc.getChildren().addAll(tID, tLName, tSal);
        vbCUDesc.setLayoutX(10); vbCUDesc.setLayoutY(50);
        vbCUDesc.setAlignment(Pos.BASELINE_RIGHT);
        
        vbCUFields.getChildren().addAll(tfFindID, tfLName, tfSal);
        vbCUFields.setLayoutX(125); vbCUFields.setLayoutY(50);
        vbCUFields.setPrefWidth(150);
        	// Buttons
        hbNUBts.getChildren().addAll(btUpdate, btTerminate, btCHBack);
		hbNUBts.setLayoutX(90); hbNUBts.setLayoutY(height-265);
        	// Build
		changeuserPane.setBackground(bkAzure);
        changeuserPane.getChildren().addAll(pUpdateUserT, vbCUDesc, vbCUFields,
        									hbNUBts);
        
        /* 5: Boss - Savings Report */
        	// Text
        savingsTPane.getChildren().addAll(tSavingsRepGen);
        savingsTPane.setLayoutX(10); savingsTPane.setLayoutY(height-5);
        
        taSavings.setPrefWidth(width-10); taSavings.setPrefHeight(height-45);
        hbSavings.setLayoutX(10); hbSavings.setLayoutY(10);
        hbSavings.getChildren().addAll(taSavings);
        	// Buttons
        		// Back
        hbSavingsBts.getChildren().addAll(btSavingsBack);
        hbSavingsBts.setLayoutX(width-45); hbSavingsBts.setLayoutY(height-25);
        	// Build
        savingsPane.setBackground(bkAzure);
        savingsPane.getChildren().addAll(hbSavings, hbSavingsBts, savingsTPane);
        
        /* 6: Employee - Menu*/
        empTPane.getChildren().addAll(tEmpMenu);
        tEmpMenu.setFont(fBigSavings);
        empTPane.setLayoutX(iImDimW/3); empTPane.setLayoutY(20);
        tEmpNotif.setFont(fSavings);
        empNote.getChildren().addAll(tEmpNotif);
        empNote.setLayoutX(iImDimW/3+10); empNote.setLayoutY(35);
        	// Buttons
        hbEmpMenuBts.getChildren().addAll(btQuit);
        hbEmpMenuBts.setLayoutX(iImDimW-60); hbEmpMenuBts.setLayoutY(iImDimH-40);
        	// Build
        empPane.setBackground(bkAzure);
        empPane.getChildren().addAll(im, empTPane, empNote, hbEmpMenuBts);
        
        /* 7: New Password - Menu */
        	// Text
    	pNewPassT.getChildren().addAll(tNewPass);
    	tNewPass.setFont(fSavings);
    	tNewPass.setLayoutX( (width-310)/5 ); tNewPass.setLayoutY(20);
    	vbPassDesc.getChildren().addAll(tEnterPas1, tEnterPas2);
    	vbPassDesc.setLayoutX(10); vbPassDesc.setLayoutY(30);
    	vbPassDesc.setAlignment(Pos.BASELINE_RIGHT);
    	vbPassTF.getChildren().addAll(tfEnterPas1, tfEnterPas2);
    	vbPassTF.setLayoutX(140); vbPassTF.setLayoutY(25);
    		// Buttons
    	hbPassBts.getChildren().addAll(btConfirm);
    	hbPassBts.setLayoutX(180); hbPassBts.setLayoutY(height-320);
    		// Build
    	newPassPane.setBackground(bkAzure);
    	newPassPane.getChildren().addAll(pNewPassT, vbPassDesc, 
    									 vbPassTF, hbPassBts);
    }
    //-------------------------------------------------------------------------
    public void AddNewUser() throws IOException, ClassNotFoundException {
    	lastname 		= tfNewLastName.getText(); 		lastname.trim();
    	firstname 		= tfNewFirstName.getText(); 	firstname.trim();
    	middlename 		= tfNewMiddleName.getText(); 	middlename.trim();
		salary 			= Double.parseDouble(tfNewSalary.getText() );
		savingspercent 	= Double.parseDouble(tfNewSavingsPerc.getText() );
		login 			= tfNewLoginID.getText(); 		login.trim();
    	
		if(rbtEmpHourly.isSelected() == true) {
			System.out.println("Hourly Employee detected.");
			Hourly hourlyEmp = new Hourly(lastname, firstname, middlename, 
					salary, savingspercent, login);
			empList.add(hourlyEmp);
		}
		if(rbtEmpSal.isSelected() == true) {
			System.out.println("Salary Employee detected.");
			Salary salaryEmp = new Salary(lastname, firstname, middlename, 
					salary, savingspercent, login);
			empList.add(salaryEmp);
		}
		try {
			IOTryCatch();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }
    public void AddNewBoss() throws IOException, ClassNotFoundException {
    	lastname 		= tfBNewLastName.getText(); lastname.trim();
    	firstname 		= tfBNewFirstName.getText(); firstname.trim();
    	middlename 		= tfBNewMiddleName.getText(); middlename.trim();
		salary 			= Double.parseDouble(tfBNewSalary.getText() );
		savingspercent 	= Double.parseDouble(tfBNewSavingsPe.getText() );
		login 			= tfBNewLoginID.getText(); login.trim();
		
		Salary bossEmp = new Salary(lastname, firstname, middlename, 
									salary, savingspercent, login);
		empList.add(bossEmp);
		
		try {
			IOTryCatch();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
    }
	private void CreateNewPassword() throws NoSuchAlgorithmException {
		String sNewPass1 = tfEnterPas1.getText(); sNewPass1.trim();
		String sNewPass2 = tfEnterPas2.getText(); sNewPass2.trim();
		
		/* New SHA-256 hashed password file and input comparison. */
		if (sNewPass1.equals(sNewPass2)) {
			try {
				pw = new PrintWriter(new File("passhash.txt") );
				String sHashedPass = new String(computeHash(sNewPass1) );
				pw.print(sHashedPass);
				pw.close();
				System.out.println("Password match confirmed. Password set.");
				NewBoss();
			}
			catch(IOException e) {
				System.out.println("ERROR: I/O Exception.");
			}
		}
		else {System.out.println("Passwords do not match. Try again.");}
	}
    
    public static byte[] computeHash( String x )   
    throws NoSuchAlgorithmException  
    {
         MessageDigest d = MessageDigest.getInstance("SHA-256");
         d.update(x.getBytes());
         return  d.digest();
    }
	
    public void CheckLogin()
    throws ClassNotFoundException, IOException, NoSuchAlgorithmException {
    	
		try {
			Scanner scIn 	= new Scanner(new File("passhash.txt") );
			String username = tfLogin.getText();
			String userPass = tfPassword.getText(); userPass.trim();
			userPass		= new String(computeHash(userPass) );
			String hashPass = new String(scIn.nextLine() );
			System.out.println("\tPassword Comparison");
			System.out.println("User Pass: " + userPass);
			System.out.println("Hashed Pass: " + hashPass);
			scIn.close();
			
	    	if (hashPass.equals(userPass)) {
	    		for(Employee e : empList) {
	    			if(e.login.equals(username) ) {
	    	    		System.out.println("Welcome back, Admin!");
	    	    		BossMenu();
	    	    		break;
	    			}
	    			else {
	    				System.out.println("Unrecognized username.");
	    				LoginMenu();
	    			}
	    		}
    		}
	    	else {
	    		for(Employee e : empList) {
	    			if(e.login.equals(username) ) {
	    	    		System.out.println("Welcome back, Employee!");
	    	    		EmployeeMenu();
	    	    		break;
	    			}
	    			else {
	    				LoginMenu();
	    				System.out.println("Unrecognized credentials.");
	    			}
	    		}
	    	}
		}
		catch(FileNotFoundException e) {
			System.out.println("Admin credentials not found.");
			NewPass();
		}
    }
    
	private void doList() {
		taEmp.setText("");
		for(Employee e : empList) {
			taEmp.appendText(e.toString() );
			taEmp.appendText("\n");
			System.out.println(e.toString() );
		}
	}
	
	private void UpdateUser() {
		Boolean bHitMiss	= false;
		String 	findLogin 	= tfFindID.getText(); 	findLogin.trim();
    	String 	newLastName = tfLName.getText(); 	newLastName.trim();
		Double 	newSalary 	= Double.parseDouble(tfSal.getText() );
    	
		for(Employee e : empList) {
			if(e.login.equals(findLogin) ) {
				e.lastname 	= newLastName;
				e.salary 	= newSalary;
				bHitMiss	= true;
				System.out.println("User updated.");
			}
		}
		if(bHitMiss == false) {
			System.out.println("User not found.");
		}
		try {
			IOTryCatch();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	private void terminateUser() {
		String 	findLogin 	= tfFindID.getText(); 	findLogin.trim();
		Boolean	termComplete= false;
		for(Employee e : empList) {
			if(e.login.equals(findLogin) ){
				e.isEmployee = false;
				System.out.println("Terminated.");
				termList.add(e);
				empList.remove(e);
				termComplete = true;
				try {
					IOTryCatch();
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			}
			if(termComplete == false) {
				System.out.println("User not found.");
			}
		}
	}
	
	private void GenerateReport() {
		double savings;
		System.out.println("\tPersonal Savings Contribution Report\n");
		taSavings.appendText("\tPersonal Savings Contribution Report\n");
		for(Employee e : empList) {
			savings = e.GetSavings();
			System.out.print(e.lastname + ", " + e.firstname);
			System.out.printf("\tSavings: $%.2f\n", savings);
			taSavings.appendText(e.lastname + ", " + e.firstname);
			taSavings.appendText("\tSavings: " + savings + "\n");
		}
	}

	public void NewBoss() {
		st.setScene(scNewBoss);
	}
	
	public void NewPass() {
		st.setScene(scNewPass);
	}
	
    public void LoginMenu() {
    	st.setScene(scLogin);
    }
    
    public void BossMenu() {
    	st.setScene(scBMenu);
    	doList();
    }
    
    public void NewUser() {
    	st.setScene(scNewUser);
    }
    
    public void UpdateUserMenu() {
    	st.setScene(scChangeUser);
    }
    
    public void SavingsReport() {
    	st.setScene(scSavingsReport);
    }
    
    public void EmployeeMenu() {
    	st.setScene(scEmpMenu);
    }
    //-------------------------------------------------------------------------
    public void IOTryCatch() throws ClassNotFoundException, IOException {
		try {
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeInt(Employee.nextID);
			oos.writeObject(empList);
			oos.close();
		}
		catch(IOException e) {
			System.out.println("ERROR: I/O Exception.\n"
							 + "Initialize a new database");
		}
		try {
			/* Just like putting file inside of Scanner.
			 * Reading in the file as objects and storing them in empList*/
			FileInputStream fis = new FileInputStream("Employee.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee.nextID = ois.readInt();
			empList  = (ArrayList<Employee>)ois.readObject();
			ois.close();
			BossMenu();
			}
		catch(FileNotFoundException e) {
			System.out.println("Database not found. Create a Salary Boss.\n"
							 + "Selecting 'Hourly' will have no effect.");
			btNUBack.setDisable(true);
			NewBoss();
		}
    }
    //-------------------------------------------------------------------------
    class EHAddNewUser implements EventHandler<ActionEvent> {
    	public void handle( ActionEvent e ) {
    		System.out.println("Add New User pressed.");
    		try {
				AddNewUser();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    	}
    }
    class EHAddBoss implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("Add New Boss pressed.");
    		try {
				AddNewBoss();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    	}
    }
    class EHAddNewUserfromMenu implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("Add New User pressed.");
    		NewUser();
    	}
    }
    class EHChangeUserMenu implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("Update User Data pressed.");
			UpdateUserMenu();
    	}
    }
    class EHReturntoBMenu implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("Back pressed.");
    		BossMenu();
    	}
    }
    class EHSecureLogin implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e){
        	System.out.println("Login pressed.");
            try {
				CheckLogin();
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (NoSuchAlgorithmException e1) {
				e1.printStackTrace();
			}
        }
    }
    class EHUpdateUser implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("Update User pressed.");
    		UpdateUser();
    	}
    }
    class EHTerminateUser implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("Terminate pressed.");
    		terminateUser();
    	}
    }
    class EHSafeExit implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e){
        	System.out.println("Close pressed.");
            System.exit(0);
        }
    }
    class EHSavingsReport implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e){
        	System.out.println("Savings Report Menu pressed.");
        	SavingsReport();
        	GenerateReport();
        }
    }
    class EHNewPass implements EventHandler<ActionEvent> {
    	public void handle(ActionEvent e) {
    		System.out.println("(New Password) Confirm pressed.");
    		try {
				CreateNewPassword();
			} catch (NoSuchAlgorithmException e1) {
				e1.printStackTrace();
			}
    	}
    }
    //------------------------------------------------------------------------- 

}