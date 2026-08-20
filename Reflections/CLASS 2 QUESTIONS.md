# Computer Graphics vs Image Processing

## Question

**How is Computer Graphics different from Image Processing?**

---

## Computer Graphics

1. Creates an image.
2. Starts with objects, shapes, models, etc.
3. Goal is to generate a new image.
4. Example: Making a 3D car in a game.
5. Used in games, animations, movies, etc.

---

## Image Processing

1. Modifies or analyzes an existing image.
2. Starts with an already captured image.
3. Goal is to improve or extract information from an image.
4. Example: Removing noise from a car photo.
5. Used in medical images, CCTV, photo enhancement, etc.

---

## Key Difference

- **Computer Graphics** → Image creation / generation
- **Image Processing** → Image modification / analysis

# Generic Primitives
## Question 2: What are the Generic Primitives?

In computer graphics, **geometric primitives** are the basic shapes/elements used to create complex objects and images.

### Examples

- Points
- Lines
- Circles
- Ellipses
- Rectangles
- Polygons

---

## Question 3: Describe the Graphical Frameworks in Java

Java provides graphical frameworks for creating **GUI (Graphical User Interface)** applications and drawing graphical objects.

The main graphical frameworks in Java are:

- **AWT (Abstract Window Toolkit)**
- **Swing**

### AWT

AWT provides components such as:

- **Frame** → Creates a window
- **Button** → Creates a button
- **Label** → Displays text
- **TextField** → Accepts text as input
- **Panel** → Groups components
- **Graphics** → Used for drawing shapes such as rectangles, circles, and text

## Swing

**Swing** is an advanced GUI framework built on AWT. It provides components such as:

- **JFrame** → Creates a window
- **JButton** → Creates a button
- **JLabel** → Displays text
- **JTextField** → Accepts text input
- **JPanel** → Groups components

Java's graphical frameworks help programmers create windows, GUI components, and graphical drawings easily.

---

# Event-Driven Programming in Java

## Question 4

**What is the design pattern for creating user interfaces, event firing, event listener, etc.?**

Java uses an **event-driven programming model** for creating interactive user interfaces.

In this model, the user performs an action such as:

- Clicking a button
- Pressing a key
- Moving the mouse

This action generates an **event**.

An **event listener** listens for that event and performs the required action when the event occurs.

### Flow

```text
User Action
     ↓
Event Generated
     ↓
Event Listener
     ↓
Action Performed

# Static Graphics vs Interactive Graphics

## Question 5: How is Static Graphics different from Interactive Graphics?

### Static Graphics

1. An image/graphic is fixed.
2. No user interaction is required.
3. The user cannot modify or control the graphic.
4. **Examples:** Photographs, posters, diagrams.
5. Mainly used for display.

### Interactive Graphics

1. The graphic changes according to user input.
2. User interaction is required.
3. The user can modify or control the graphic.
4. **Examples:** Games, drawing applications.
5. Mainly used for interaction and control.

---

# Curve and Calculus

## Question 6: How is a Curve Connected with Calculus?

Curves are closely connected with calculus through **derivatives** and **integration**.

- **Derivative** → Gives the **slope of a curve**.
  - It also represents the slope of the **tangent** to the curve.

- **Second Derivative** → Gives information about the **curvature/bending** of a curve.

- **Integration** → Gives the **area under a curve**.

# SSH and HTTPS

## Question 7: Describe SSH and HTTPS

### 1. SSH (Secure Shell)

SSH is a **secure network protocol** used to access and control a remote computer over a network.

- It provides **encrypted communication**, so data such as commands and passwords are protected.
- It is commonly used for **remote access**.
- **Port:** 22
- **Example:** Using SSH to remotely access a server.

---

### 2. HTTPS (HyperText Transfer Protocol Secure)

HTTPS is the **secure version of HTTP**.

- It is used for secure communication between a **web browser and a web server**.
- It uses **TLS/SSL encryption** to protect data transferred over the internet.
- **Port:** 443
- **Example:** Used mainly for websites and web applications.

---

# Question 8: Mention the Tools Used for SSH Operations

**PuTTY** is a commonly used tool for performing **SSH (Secure Shell) operations**.

It allows a user to securely connect to and control a **remote computer/server**.

# Public and Private Keys in SSH

## Question 9: What are Public and Private Keys? How do we use them?

While using **SSH**, two keys are generated:

1. **Public Key**
2. **Private Key**

### 1. Public Key

- The public key can be **shared with others**.
- It is placed on the **server**.
- It is used to verify that you are an **authorized user**.

### 2. Private Key

- The private key must be kept **secret on your own computer**.
- You should **never share** your private key.
- It proves that you are the person who owns the corresponding public key.

### SSH Key Authentication

In SSH:

- The **public key** is stored on the server.
- The **private key** is securely kept by the user.
- The private key is used to **authenticate the user** and establish a secure connection.

> **Important:** Never share your private key with anyone.
