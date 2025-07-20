Planets_App
Planets_App is a simple and educational Android application developed to demonstrate the use of ListView and Custom Adapter in Android using Java. This app displays a list of planets along with the number of moons they have and their representative images. When a user taps on any planet item, a toast message appears showing the name of the selected planet.
What I Learned
During the development of this project, I gained hands-on experience with the following concepts:
•	ListView: Implemented a scrollable list of planets using Android's ListView component.
•	Custom Adapter: Created a custom adapter to efficiently bind data (planet name, moon count, and image) to the ListView.
•	ViewHolder Pattern: Used the ViewHolder pattern to optimize performance and minimize repeated calls to findViewById.
•	Toast Messages: Added interactivity by showing a toast with the planet's name when a list item is clicked.
•	Model Class: Designed a Planets model class to represent planet data cleanly and encapsulate its properties.
•	XML Layouts: Learned how to design a custom layout for each item in the list using XML.
Features
•	Displays a list of planets with their names, moon counts, and images.
•	Responsive user interface using ListView and custom layouts.
•	On item click, shows a toast message with the planet's name.
•	Modular and scalable codebase using best practices for ListView adapters.
How It Works
•	A list of planet objects is created in MainActivity.java.
•	Each planet includes a name, moon count, and an image resource.
•	A custom adapter (MyCustomAdapter.java) binds this data to a custom layout (item_list_layout.xml) for each row in the ListView.
•	The ListView displays the list, and clicking on an item triggers a toast message showing the name of the selected planet.
Screenshots

Getting Started
•	Clone the repository.
•	Open it in Android Studio.
•	Build and run on an emulator or real device.
Technologies Used
•	Java
•	Android SDK
•	XML Layouts
•	Android Studio
Future Improvements
•	Add more details for each planet, such as distance from the sun, size, or atmospheric data.
•	Use RecyclerView instead of ListView for better performance and flexibility.
•	Add animations or transitions for a more dynamic UI.
