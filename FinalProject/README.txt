// Setup
JFrame frame - Frame controller
JPanel panel - Panel controller
Envunity page - Use main class

// Arrays and ArrayLists
String envProjects[] - Stores different projects that users can join
ArrayList : userData - Stores user signup data on join
ArrayList : fileFields - Stores names of fields for printing file
ArrayList : leaderList - Stores leaders based off Leader class
ArrayList : memberList - Stores members based off Member class

// Labels - JLabel
lblWelcome - Welcome users to Envunity
lblSelection - Tell user to pick a group
lblDirections - Direct them to fill out form
lblFName - Label for first name text field
lblLName - Label for last name text field
lblCity - Label for city text field
lblZip - Label for zipcode text field
lblCountry - Label for country text field
lblPhone - Label for phone number text field
lblEmail - Label for email text field
lblOrganizationQ - Ask if user is in organization
lblOrganization - Label for organization name text field
lblPosition - Label for position in organization text field
lblRole - Label for group role text field
lblExperience - Label for field experience text field
lblNotes - Label for adding more information to submission text field

// User Interactive
JComboBox cbProjectSelection - User chooses a project from envProjects[]

// Textboxes - JTextField
txtFName - First name text field
txtLName - Last name text field
txtCity - City text field
txtZip - Zipcode text field
txtCountry - Country text field
txtPhone - Phone number text field
txtEmail - Email text field
txtOrganization - Organization name text field
txtPosition - Position in organization text field
txtRole - Group role text field
txtExperience - Field experience text field
txtNotes - Adding more information to submission text field

//Radio Buttons - JRadioButton
radYes - Answer for lblOrganizationQ
radNo - Answer for lblOrganizationQ
ButtonGroup radGroup - Groups radYes and radNo radio buttons

// Buttons - JButton
btnJoin - Open signup form
btnView - View current members 
btnSignup - Store user signup information in database
btnBack - Go to homepage
btnExit - Exit Application

// Classes
interface Template - Setup basic functions and methods used in program

// Functions
void Message(String message) - Prints out message based on class that is sending it
String getProject() - Get user's project group (class ProjectGroup)
String getName() - Get user's name (class ProjectGroup)
String getCountry() - Get user's country (class ProjectGroup)
String getRole() - Get user's role (class ProjectGroup)
void setProject(String p) - Set user's project (class ProjectGroup)
void setName(String n) - Set user's name (class ProjectGroup)
void setCountry(String c) - Set user's country (class ProjectGroup)
void setRole(String r) - Set user's role (class ProjectGroup)