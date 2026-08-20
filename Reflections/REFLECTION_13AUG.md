# Class Reflection – 13-08-2026

## Topics Covered

- Maven and `pom.xml`
- Computer Graphics, Pixels, and Coordinates
- Algorithm for Creating a Square
- Understanding a Moving Square in Java
- Maven Project Structure
- `src`, `main`, `java`, `resources`, and `test`
- `.gitignore`
- `JFrame`
- Development and Build Tools
- Colours and RGB in Java Graphics

## Notes

### Maven and `pom.xml`

In this Computer Graphics class, I learned about **Maven** and its role in a Java project. I understood that Maven is not a programming language; it is a build and project management tool that helps organize a project and manage tasks such as compiling code, handling dependencies, running tests, and building the project.

From Chapter 19, I also understood the importance of the `pom.xml` file. It contains important project information and helps Maven manage dependencies, plugins, and build-related settings. This made it clearer to me why a structured Java project contains files other than just Java code.

### Computer Graphics, Pixels, and Coordinates

In this class, we discussed the very basics of Computer Graphics and how objects are represented graphically on the screen using computers. I discovered that a screen is basically composed of pixels and that objects are represented digitally using coordinates.

Representation using Coordinates

The position of an object on the screen can be determined using coordinates, x and y. In Java Graphics system, (0,0) is on the upper left corner of the screen. The x increases as we move to the right while y increases as we move down.

From this, I understood that I have to first consider the position of the graphic object on the screen before deciding the coordinates to use.

Algorithm for making a square

Another important thing that we covered in this class is the algorithm for making a square. A lot of thought goes into making even a simple shape such as a square. We were required to develop an algorithm for making a square before developing the code in Java.
To define a square, we need its centre position `(Cx, Cy)` and its side length `L`. Since the distance from the centre to each side is half of the side length, we use `L / 2` to calculate the positions of the four corners.

The four corners are:

- **Upper-Left (UL):** `(Cx - L/2, Cy - L/2)`
- **Upper-Right (UR):** `(Cx + L/2, Cy - L/2)`
- **Lower-Left (LL):** `(Cx - L/2, Cy + L/2)`
- **Lower-Right (LR):** `(Cx + L/2, Cy + L/2)`

For example, if the centre is `(200, 150)` and the side length is `100`, then `L / 2` is `50`. Using this value, the four corner positions can be calculated.

The main thing I understood from this topic was that a graphical shape should first be understood mathematically. Once the position and dimensions are clear, implementing it in code becomes easier.

### Moving Square and Java Graphics

After discussing the square algorithm, the Java code for drawing and moving the square was discussed.

The position of the square in the code can be changed by working with coordinates x and y. By modifying the coordinates, the square moves when the position is updated and redrawn.

I have also learned how to set color for graphics elements with specific colors or the RGB color scheme.

The square can be drawn by setting the x and y coordinates and specifying the width and the height with equal values as all sides of the square should be equal.

The book discusses translating, rotating, scaling, and shearing in computer graphics; the last two techniques deal with altering the shape of the graphic elements. The translation involves moving the graphics elements which relates to the moving square example as it requires changing coordinates to move a square on the screen.

### Java Project Structure and Important Files

In addition, we learned how to create a Java Maven project. In the “src” folder of such a project, by default, there are two folders: “main” and “test”.

In the “main” folder, all the code of the application is located, as well as other resources. The code itself is in the “java” folder, and the rest are in the “resources” folder. In the “test” folder, tests are located, which check the code of the application.

Meanwhile, we also discussed the topic of.gitignore, that is, the file in which the names of files and folders that should not be subjected to version control are indicated. It is useful to use such a file to keep the GitHub repository as clean as possible.

### `JFrame`, Development Tools, and Build Tools

In this class I also found out what JFrame is: A window on Java Swing for showing graphical objects.

Development versus build tools. Development tools are there to write, run and test our code, and build tools are there to compile, test, manage dependencies and prepare our project.

The build and project management tool Maven is an example.
## Reflection

Learn how to make a piece of simple geometry like a square, was a Computer Graphics class that made me realize that there was a reason that this shape was so simple: There are coordinates, there is geometry, there is a program.

The most useful piece of information for me came when the centre and length of the sides were termed as the square's side and centre points, and the position of the four corners of the square could be calculated from these two points. I also grasped the simplest idea of the motion of graphs, based on the concept of variables changing positions.

In addition to graphic concepts I got a better knowledge of how to organize a java project with maven. Knowing what src, main, test, resources, pom.xml and .gitignore mean helped me to understand that sense when I encounter the different files and folders in different projects.

In general, this class taught me that it's not enough to write a graphics program, the algorithm, coordinates and structure must be known first.
