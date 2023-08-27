package com.marco.htmlmodel.factory;

// Define a generic interface HTMLElement that represents HTML elements with properties.
interface HTMLElement {
    String getTag();
    String getContent();
}

// Interface for concrete classes Heading and Paragraph
interface TextElement {
    String getTextType();
}

// Implement specialized HTML elements using generics.
class Heading implements HTMLElement, TextElement {
    private String content;

    public Heading(String content) {
        this.content = content;
    }

    public String getTag() {
        return "h1";
    }

    public String getContent() {
        return content;
    }

    public String getTextType() {
        return "Main Heading";
    }
}

class Paragraph implements HTMLElement, TextElement {
    private String content;

    public Paragraph(String content) {
        this.content = content;
    }

    public String getTag() {
        return "p";
    }

    public String getContent() {
        return content;
    }

    public String getTextType() {
        return "Regular Paragraph";
    }
}

class Button implements HTMLElement, TextElement {
    private String content;

    public Button(){

    }

    public Button(String content) {
        this.content = content;
    }

    public String getTag() {
        return "button";
    }

    public String getContent() {
        return content;
    }

    public String getTextType() {
        return "Clickable Button";
    }
}

/* 
// Define a generic HTMLElementFactory using the factory method pattern.
interface HTMLElementFactory<T extends HTMLElement> {
    T createHTMLElement(String content);
}

// Implement specialized HTML element factories.
class HeadingFactory implements HTMLElementFactory<Heading> {
    public Heading createHTMLElement(String content) {
        return new Heading(content);
    }
}

class ParagraphFactory implements HTMLElementFactory<Paragraph> {
    public Paragraph createHTMLElement(String content) {
        return new Paragraph(content);
    }
}

class ButtonFactory implements HTMLElementFactory<Button> {
    public Button createHTMLElement(String content) {
        return new Button(content);
    }
}*/


// Abstract Factory interface for creating HTML elements
interface HTMLElementFactory<T extends HTMLElement> {
    T createHTMLElement(String content);
}

// Concrete factories for creating specific HTML elements
class HeadingFactory implements HTMLElementFactory<Heading> {
    public Heading createHTMLElement(String content) {
        return new Heading(content);
    }
}

class ParagraphFactory implements HTMLElementFactory<Paragraph> {
    public Paragraph createHTMLElement(String content) {
        return new Paragraph(content);
    }
}

class ButtonFactory implements HTMLElementFactory<Button> {
    public Button createHTMLElement(String content) {
        return new Button(content);
    }
}


public class HTMLElementFactoryAdventure {
    public static void main(String[] args) {
        
        // Create HTML element factories.
        HTMLElementFactory<Heading> headingFactory = new HeadingFactory();
        HTMLElementFactory<Paragraph> paragraphFactory = new ParagraphFactory();
        HTMLElementFactory<Button> buttonFactory = new ButtonFactory();

        // Use the factories to create HTML elements.
        HTMLElement headingElement = headingFactory.createHTMLElement("Welcome to Generics Island!");
        HTMLElement paragraphElement = paragraphFactory.createHTMLElement("Explore the magic of Java generics.");
        HTMLElement buttonElement = buttonFactory.createHTMLElement("Click me!");
/**/

        // Create HTML element factories.
        //HTMLElementFactory<Heading> headingFactory = new HeadingFactory();
        //HTMLElementFactory<Paragraph> paragraphFactory = new ParagraphFactory();
       // HTMLElementFactory<Button> buttonFactory = new ButtonFactory();

        // Use the factories to create HTML elements.
        //HTMLElement headingElement = headingFactory.createHTMLElement("Welcome to Generics Island!");
        //HTMLElement paragraphElement = paragraphFactory.createHTMLElement("Explore the magic of Java generics.");
       // HTMLElement buttonElement = buttonFactory.createHTMLElement("Click me!");

        // Display the created HTML elements!
        //System.out.println("<" + headingElement.getTag() + ">" + headingElement.getContent() + "</" + headingElement.getTag() + ">");
        //System.out.println("<" + paragraphElement.getTag() + ">" + paragraphElement.getContent() + "</" + paragraphElement.getTag() + ">");
       // System.out.println("<" + buttonElement.getTag() + ">" + buttonElement.getContent() + "</" + buttonElement.getTag() + ">");

        // Cast the elements into their concrete classes and access specific properties through the interface.
        if (headingElement instanceof TextElement) {
            TextElement heading = (TextElement) headingElement;
            System.out.println("<" + headingElement.getTag() + ">" + heading.getTextType() + "</" + headingElement.getTag() + ">");
            System.out.println("Heading Type: " + heading.getTextType());
        }

        if (paragraphElement instanceof TextElement) {
            TextElement paragraph = (TextElement) paragraphElement;
            System.out.println("<" + paragraphElement.getTag() + ">" + paragraph.getTextType() + "</" + paragraphElement.getTag() + ">");
            System.out.println("Paragraph Type: " + paragraph.getTextType());
        }

        if (buttonElement instanceof TextElement) {
            TextElement button = (TextElement) buttonElement;
            System.out.println("<" + buttonElement.getTag() + ">" + button.getTextType() + "</" + buttonElement.getTag() + ">");
            System.out.println("Button Type: " + button.getTextType());
        }
    }
}

