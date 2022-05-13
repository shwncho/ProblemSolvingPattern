public class Rectangle extends ShapeBasics implements RectangleInterface{

    private int height;
    private int width;

    public Rectangle(){
        super();
        height=0;
        width=0;
    }

    public Rectangle(int theOffset, int theHeight, int theWidth){
        super(theOffset);
        height=theHeight;
        width=theWidth;
    }

    public void set(int newHeight, int newWidth){
        height=newHeight;
        width=newWidth;
    }

    public void drawHere(){
        drawHorizontalLine();
        drawSides();
        drawHorizontalLine();
    }

    private void drawHorizontalLine(){
        skipSpaces(getOffset());
        for(int count=0; count<width; count++){
            System.out.print('-');
        }
        System.out.print('-');
        System.out.println();
    }

    private void drawSides(){
        for(int count=0; count<(height-2); count++){
            drawOneLineOfSides();
        }
    }
    private void drawOneLineOfSides(){
        skipSpaces(getOffset());
        System.out.print('ㅣ');
        skipSpaces(width-2);
        System.out.println('ㅣ');
    }

    private static void skipSpaces(int number){
        for(int count=0; count<number; count++){
            System.out.print(' ');
        }
    }
}
