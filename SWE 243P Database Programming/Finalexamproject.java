import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.sql.ResultSet;
import javax.sql.DataSource;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.io.*;
import javafx.event.EventHandler;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleStringProperty;


public class Finalexamproject extends Application {

    private final int SIZE = 3;
    String[] Dep = new String[SIZE];
    String[] Ins = new String[SIZE];

    private MenuBar menubar;
    private MenuBar menubar2;
    private Menu fileMenu;
    private Menu Studentmenu;
    private Menu Coursesmenu;
    private Menu Enrollmenu;

    private MenuItem exitItem;

    private RadioMenuItem AddStudentitem;

    private RadioMenuItem AddCourseitem;
    private RadioMenuItem Addenrollitem;
    private Label outputLabel2;
    private Label outputLabelel;
    private Label outputLabelc1;
    private Label inputlabel2;
    private Label inputlabel3;
    private Label inputlabelc1;
    private Label inputlabelc3;
    private Label inputlabelc4;
    private Label inputlabelc5;
    private Label inputlabele1;
    private Label inputlabele2;
    private Label inputlabele3;
    private TextField AddCourseTextField2;
    private TextField AddCourseTextField3;
    private TextField AddCourseTextField4;
    private String Studentinput2;
    private String Studentinput3;
    private String Courseinput2;
    private String Courseinput3;
    private String Courseinput4;
    private TextField AddStudentTextField2;
    private TextField AddStudentTextField3;
    private String Enrollinput1;
    private String Enrollinput2;
    private Label outputLabel;
    Text text1 = new Text();
    Text text2 = new Text();
    Text text3 = new Text();
    Text text4 = new Text();
    Text text5 = new Text();
    private TextField AddEnrollTextField1;
    private TextField AddEnrollTextField2;
    private ArrayList<String> allrows = new ArrayList<String>();
    private final double WIDTH = 900, HEIGHT = 700;

    public static void main(String[] args) {
        StudentDatabase();
        launch(args);

    }

    public static void StudentDatabase() {

        //address for linking to mysql
        String url = "jdbc:mysql://localhost:3306";
        // user for mysql
        String user = "root";
        // password for mysql
        String password = "Light42590!$";



        try {

            // 1. Get a connection to a database
            Connection DBConn = DriverManager.getConnection(url, user, password);

            // 2. Prepare a statement for database


            Statement stmt = DBConn.createStatement();

            // 3. Execute SQL Query

            //create database
            String mysql2 = "CREATE DATABASE STUDENTENROLLMENT";
            stmt.executeUpdate(mysql2);




            System.out.println("Insert complete");
        }
        //catches exception for database already existing.
        catch (Exception exc) {
            System.out.println("Database already exists");
        }

    }


    public void start(Stage mainstage) {


        final double WIDTH = 900, HEIGHT = 700;

        outputLabel = new Label("Welcome to University Enrollment");

        menubar = new MenuBar();

        buildFileMenu(mainstage);

        buildStudentMenu(mainstage);

        buildCourseMenu(mainstage);

        buildEnrollMenu(mainstage);



        menubar.getMenus().add(fileMenu);
        menubar.getMenus().add(Studentmenu);
        menubar.getMenus().add(Coursesmenu);
        menubar.getMenus().add(Enrollmenu);


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menubar);
        borderPane.setCenter(outputLabel);

        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
        mainstage.setScene(scene);

        mainstage.setTitle("University Enrollment");

        mainstage.show();

    }




    public void buildFileMenu(Stage mainstage) {

        fileMenu = new Menu("File");

        exitItem = new MenuItem("Exit");

        fileMenu.getItems().add(exitItem);

        exitItem.setOnAction(event -> {

            mainstage.close();

        });
    }


    public void buildStudentMenu(Stage StudentScene) {


        Studentmenu = new Menu("Students");

        AddStudentitem = new RadioMenuItem("Add Student");

        ToggleGroup studentsToggleGroup = new ToggleGroup();
        AddStudentitem.setToggleGroup(studentsToggleGroup);


        Studentmenu.getItems().add(AddStudentitem);

        AddStudentitem.setOnAction(event -> {

            addStudentScene(StudentScene);

        });



    }

    public void buildCourseMenu(Stage CoursesScene) {

        Coursesmenu = new Menu("Courses");

        AddCourseitem = new RadioMenuItem("Add Courses");

        ToggleGroup CourseToggleGroup = new ToggleGroup();
        AddCourseitem.setToggleGroup(CourseToggleGroup);


        Coursesmenu.getItems().add(AddCourseitem);

        AddCourseitem.setOnAction(event -> {

            addCoursesScene(CoursesScene);

        });
    }

    public void buildEnrollMenu(Stage EnrollScene) {

        Enrollmenu = new Menu("Enrollment");

        Addenrollitem = new RadioMenuItem("Enroll Student in Course");

        ToggleGroup CourseToggleGroup = new ToggleGroup();
        Addenrollitem.setToggleGroup(CourseToggleGroup);


        Enrollmenu.getItems().add(Addenrollitem);

        Addenrollitem.setOnAction(event -> {

            addEnrollScene(EnrollScene);

        });


    }






    public void addStudentScene(Stage StudentScene) {

        Button createStudent = new Button("Create Student");

        createStudent.setOnAction(new EventHandler<ActionEvent>()  {



            @Override
            public void handle(ActionEvent event) {



                Studentinput2 = AddStudentTextField2.getText();
                Studentinput3 = AddStudentTextField3.getText();
                StudentData();

                AddStudentTextField2.setText("");
                AddStudentTextField3.setText("");





                StudentData2();




            }


            // Inputting Student into Database



            // Inputting Student into Database
            public void StudentData() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";



                try {

                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare statement for database


                    Statement stmt = DBConn.createStatement();

                    // 3. Execute SQL Query

                    String mysql = "CREATE TABLE students " +
                            "(student_id INT NOT NULL AUTO_INCREMENT, " +
                            "first_name VARCHAR(300) NOT NULL, " +
                            "last_name VARCHAR(300) NOT NULL, " +
                            "PRIMARY KEY (student_id))";

                    stmt.executeUpdate(mysql);



                    System.out.println("Insert complete");
                }
                catch (Exception exc) {
                    System.out.println("Students Table already exists");
                }

            }



            public void StudentData2() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";

                try {

                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare statement

                    PreparedStatement statement = DBConn.prepareStatement("INSERT INTO students (first_name, last_name) VALUES (?, ?) ");


                    statement.setString(1, Studentinput2);

                    statement.setString(2, Studentinput3);



                    statement.executeUpdate();



                    System.out.println("Insert complete");
                }
                catch (Exception exc) {
                    exc.printStackTrace();
                }




            }






        });






        outputLabel2 = new Label("                   New Student Information");

        inputlabel2 = new Label("First Name ");

        inputlabel3 = new Label("Last Name ");

        AddStudentTextField2 = new TextField();

        AddStudentTextField3 = new TextField();


        HBox BottomHBox2 = new HBox(10, createStudent);

        HBox leftHBox2 = new HBox(10, inputlabel2, AddStudentTextField2);

        HBox leftHBox3 = new HBox(10, inputlabel3, AddStudentTextField3);

        VBox MainVBox = new VBox(10, outputLabel2, leftHBox2, leftHBox3, BottomHBox2);

        MainVBox.setAlignment(Pos.TOP_CENTER);

        leftHBox2.setAlignment(Pos.TOP_CENTER);

        leftHBox3.setAlignment(Pos.TOP_CENTER);

        BottomHBox2.setAlignment(Pos.TOP_CENTER);

        MainVBox.setPadding(new Insets(65));

        menubar2 = new MenuBar();

        buildFileMenu(StudentScene);

        buildStudentMenu(StudentScene);

        buildCourseMenu(StudentScene);

        buildEnrollMenu(StudentScene);

        menubar2.getMenus().add(fileMenu);
        menubar2.getMenus().add(Studentmenu);
        menubar2.getMenus().add(Coursesmenu);
        menubar2.getMenus().add(Enrollmenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menubar2);
        borderPane.setCenter(MainVBox);

        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);


        StudentScene.setScene(scene);
        StudentScene.show();


    }


    public void addCoursesScene(Stage CoursesScene) {


        Button createcourse = new Button("Create Course");

        createcourse.setOnAction(new EventHandler<ActionEvent>()  {

            public void handle(ActionEvent event) {

                Courseinput2 = AddCourseTextField2.getText();
                Courseinput3 = AddCourseTextField3.getText();
                Courseinput4 = AddCourseTextField4.getText();


                CourseData();
                AddCourseTextField2.setText("");
                AddCourseTextField3.setText("");
                AddCourseTextField4.setText("");


                AddCourseTextField2.setText("");
                AddCourseTextField3.setText("");
                AddCourseTextField4.setText("");
                CourseData2();

            }

            public void CourseData() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";



                try {

                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare statement


                    Statement stmt = DBConn.createStatement();

                    // 3. Execute SQL Query

                    String mysql = "CREATE TABLE courses " +
                            "(course_id INT NOT NULL AUTO_INCREMENT, " +
                            "course_name VARCHAR(300) NOT NULL UNIQUE, " +
                            "course_time VARCHAR(300) NOT NULL, " +
                            "course_day VARCHAR(300) NOT NULL, " +
                            "PRIMARY KEY (course_id))";


                    stmt.executeUpdate(mysql);



                    System.out.println("Insert complete");
                }
                catch (Exception exc) {
                    System.out.println("Course Table Already exist");
                }

            }


            public void CourseData2() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";

                try {

                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare statement

                    PreparedStatement statement = DBConn.prepareStatement("INSERT INTO courses (course_name, course_time, course_day) VALUES (?, ?, ?) ");

                    statement.setString(1, Courseinput2);

                    statement.setString(2, Courseinput3);

                    statement.setString(3, Courseinput4);



                    statement.executeUpdate();



                    System.out.println("Insert complete");
                }
                catch (Exception exc) {
                    System.out.println("Have to enter different course names");;
                }




            }



        });


        outputLabelc1 = new Label("                                     New Courses Information ");

        inputlabelc1 = new Label(" ");

        inputlabelc3 = new Label("   Course Name           ");

        inputlabelc4 = new Label("   Time of Course        ");

        inputlabelc5 = new Label("   Day                        ");




        AddCourseTextField2 = new TextField();

        AddCourseTextField3 = new TextField();

        AddCourseTextField4 = new TextField();




        HBox leftHBox3 = new HBox(10, inputlabelc3, AddCourseTextField2);

        HBox BottomHBox2 = new HBox(10, createcourse);

        HBox leftHBox4 = new HBox(10, inputlabelc4, AddCourseTextField3);

        HBox leftHBox5 = new HBox(10, inputlabelc5, AddCourseTextField4);

        VBox MainVBox1 = new VBox(10, outputLabelc1,leftHBox3, leftHBox4, leftHBox5, BottomHBox2);

        MainVBox1.setAlignment(Pos.TOP_CENTER);

        leftHBox3.setAlignment(Pos.TOP_CENTER);

        leftHBox4.setAlignment(Pos.TOP_CENTER);

        leftHBox5.setAlignment(Pos.TOP_CENTER);

        BottomHBox2.setAlignment(Pos.TOP_CENTER);

        MainVBox1.setPadding(new Insets(65));





        menubar2 = new MenuBar();

        buildFileMenu(CoursesScene);

        buildStudentMenu(CoursesScene);

        buildCourseMenu(CoursesScene);

        buildEnrollMenu(CoursesScene);

        menubar2.getMenus().add(fileMenu);
        menubar2.getMenus().add(Studentmenu);
        menubar2.getMenus().add(Coursesmenu);
        menubar2.getMenus().add(Enrollmenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menubar2);
        borderPane.setCenter(MainVBox1);


        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);


        CoursesScene.setScene(scene);
        CoursesScene.show();






    }




    public void addEnrollScene(Stage EnrollScene) {


        Button enrollcourse = new Button("Create Enroll");

        enrollcourse.setOnAction(new EventHandler<ActionEvent>()  {

            public void handle(ActionEvent event) {

                Enrollinput1 = AddEnrollTextField1.getText();
                Enrollinput2 = AddEnrollTextField2.getText();


                EnrollData();
                AddEnrollTextField1.setText("");
                AddEnrollTextField2.setText("");



                AddEnrollTextField1.setText("");
                AddEnrollTextField2.setText("");
                EnrollData2();

            }

            public void EnrollData() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";



                try {

                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare Stored Procedure Call


                    Statement stmt = DBConn.createStatement();

                    // 3. Execute SQL Query

                    String mysql = "CREATE TABLE enrollment " +
                            "(student_id INT NOT NULL, " +
                            "course_id INT NOT NULL, " +
                            "CONSTRAINT student_enrollment_fk_id FOREIGN KEY (student_id) REFERENCES students (student_id)," +
                            "CONSTRAINT course_enrollment_fk_id FOREIGN KEY (course_id) REFERENCES courses (course_id))";


                    stmt.executeUpdate(mysql);



                    System.out.println("Insert complete");
                }
                catch (Exception exc) {
                    System.out.println("Enrollment Table already exist");
                }


            }


            public void EnrollData2() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";

                try {

                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare Stored Procedure Call

                    PreparedStatement statement = DBConn.prepareStatement("INSERT INTO enrollment (student_id, course_id) VALUES (?, ?) ");

                    statement.setInt(1, Integer.parseInt(Enrollinput1));

                    statement.setInt(2, Integer.parseInt(Enrollinput2));


                    statement.executeUpdate();



                    System.out.println("Insert complete");
                }
                catch (Exception exc) {
                    System.out.print("Student ID or Course ID or both do not exist");
                }




            }


        });


        Button viewenrollment = new Button("View Enrollment Data");
        viewenrollment.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                EnrollData3();

            }

            public void EnrollData3() {

                //address for linking to database
                String url = "jdbc:mysql://localhost:3306/studentenrollment";
                // user for database
                String user = "root";
                // password for database
                String password = "Light42590!$";



                try {


                    // 1. Get a connection to a database
                    Connection DBConn = DriverManager.getConnection(url, user, password);

                    // 2. Prepare Stored Procedure Call


                    Statement stmt = DBConn.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT C.COURSE_NAME, S.FIRST_NAME, S.LAST_NAME, COURSE_TIME, COURSE_DAY " +
                            "FROM COURSES C JOIN ENROLLMENT E ON C.COURSE_ID = E.COURSE_ID JOIN STUDENTS S ON E.STUDENT_ID = S.STUDENT_ID ORDER BY C.COURSE_NAME, S.LAST_NAME, S.FIRST_NAME");

                    // 3. Execute SQL Query

                    while(rs.next()) {

                        allrows.add(rs.getString(1));
                        allrows.add(rs.getString(2));
                        allrows.add(rs.getString(3));
                        allrows.add(rs.getString(4));
                        allrows.add(rs.getString(5));

                    }

                    for(int i = 0; i < allrows.size(); i++) {
                        System.out.println(allrows.get(i));
                        System.out.println();
                    }


                }
                catch (Exception exc) {
                    System.out.print("Error, tables do not exist. ");
                }


            }




        });



        outputLabelel = new Label("                                     New Enrollment Information ");

        inputlabele1 = new Label(" ");

        inputlabele2 = new Label("  Student ID                 ");

        inputlabele3 = new Label("  Course ID                  ");




        AddEnrollTextField1 = new TextField();

        AddEnrollTextField2 = new TextField();




        HBox leftHBox2 = new HBox(10, inputlabele2, AddEnrollTextField1);

        HBox leftHBox3 = new HBox(10, inputlabele3, AddEnrollTextField2);

        HBox BottomHBox2 = new HBox(10, enrollcourse, viewenrollment);

        VBox MainVBox1 = new VBox(10,  outputLabelel, leftHBox2, leftHBox3, BottomHBox2);

        MainVBox1.setAlignment(Pos.TOP_CENTER);

        leftHBox2.setAlignment(Pos.TOP_CENTER);

        leftHBox3.setAlignment(Pos.TOP_CENTER);

        BottomHBox2.setAlignment(Pos.TOP_CENTER);

        MainVBox1.setPadding(new Insets(65));





        menubar2 = new MenuBar();

        buildFileMenu(EnrollScene);

        buildStudentMenu(EnrollScene);

        buildCourseMenu(EnrollScene);

        buildEnrollMenu(EnrollScene);


        menubar2.getMenus().add(fileMenu);
        menubar2.getMenus().add(Studentmenu);
        menubar2.getMenus().add(Coursesmenu);
        menubar2.getMenus().add(Enrollmenu);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menubar2);
        borderPane.setCenter(MainVBox1);


        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);


        EnrollScene.setScene(scene);
        EnrollScene.show();






    }









}


























