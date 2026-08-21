# Class Reflection – 20-08-2026

## Topics Covered

* `paintComponent()` and `Graphics`
* `Square` class, `new` keyword, and `super` keyword
* Creating and displaying a square in Java Graphics
* Understanding the structure of the graphics code

## Notes

### `paintComponent()`, `Graphics`, `Square`, `new`, and `super`

In this Computer Graphics class, we continued working on the Java program for creating a square. We also discussed more about what specific things in the code mean. We talked about differences between
paintComponent() and Graphics, how a particular class, Square, was constructed, and what the keyword super meant in our code. Firstly, we went over the difference between paintComponent() and Graphics.

Graphics basically provides the needed functions for displaying any graphical objects on the screen. The methods provided by Graphics are utilized in paint Component() , the actual method we use for writing instructions to display our graphical object.Then, we talked about the Square class and how an instance of the class (i.e., an object) was constructed using the new keyword. Whenever we use
new , such as in new Square(), we are basically trying to create an object of whatever class follows the
new keyword. It was through this that I was able to grasp the difference between a class and an object. A class is basically a template for an object, while an object is an instance of a class.
The next keyword we discussed was super  basically meant that whatever follows it was defined in the parent class. 

We used super.paintComponent(g) in our paintComponent() method. This means that whatever class we are overriding the paintComponent() method for inherits the paintComponent() method of the parent class. I was also able to realize that in cases where we do not require the use of the parent class, we do not need to use the
super keyword.

### Drawing the Shapes

We then related all these concepts to the actual program code for constructing our square. These concepts really tie in together and we end up with a working program that displays a square on the screen. The
Square class constructs the graphical object we intend to display while the new keyword helps us instantiate an object of type Square.

The paintComponent() method is the actual place where we write the instructions for displaying our graphical object. The Graphics class is needed because it is only through it that we can utilize the drawing methods available in Java.
It was through these realizations that I came to understand that a lot goes into what looks simple in code. Understanding each segment of code makes it much easier to read and comprehend programs than just learning them by heart.


## Reflection

This class was beneficial for me as I managed to learn the context behind the Java Graphics coding rather than simply memorizing the final code segments. For instance, prior to this discussion, I knew the terms paintComponent(), Graphics, new , and super were different parts of Java programming language, but I never realized how these terms were integrated into each other when developing a specific graphical object.

The most valuable information for me was the explanation behind the new Square () command and why do we need super.paintComponent(g) command. Now I have an idea what a class is and how new command helps to instantiate a class. Furthermore, I have understood the purpose of super.paintComponent(g) command and why it is essential to call the parent class’s method before actually painting our graphical object.

Conclusively, I obtained a great insight on the Java Graphics programming language by learning the rationale behind the simple Java application code. In particular, my major takeaway is that coding implies a continuous process of heuristics, where one should not only memorize the coding rules but also understand the rationale behind every particular coding segment.
