public class Circle extends GraphicObject{
    @Override
    void draw(){
        System.out.println("Draw a circle");
    }

    @Override
    void resize(){
        System.out.println("Resizing a circle");
    }
}
