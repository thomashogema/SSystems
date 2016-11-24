package ss.week2;

public class Rectangle {
    private int length;
    private int width;

    /**
     * Create a new Rectangle with the specified length and width.
     */
    //@ private invariant length >= 0;
    //@ private invariant width >= 0;
    /*@
     * requires theLength >= 0;
     * requires theWidth >= 0;
     * ensures length() == theLength;
     * ensures width() == theWidth; 
     */
    public Rectangle(int theLength, int theWidth) {
    }
    
    /**
     * The length of this Rectangle.
     */
    //@ ensures \result >= 0;
    /*@ pure */ public int length() {
	return 0;
    }

    /**
     * The width of this Rectangle.
     */
    //@ ensures \result >= 0;
    /*@ pure */ public int width() {
	return 0;
    }

    /**
     * The area of this Rectangle.
     */
    //@ ensures \result >=0; /* not nessasary*/
    //@ ensures \result == length() * width();
    public int area() {
	return 0;
    }

    /**
     * The perimeter of this Rectangle.
     */
    public int perimeter() {
	return 0;
    }
}
