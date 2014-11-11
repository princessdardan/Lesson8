import java.net.URL;
import javax.swing.ImageIcon;

//i have chosen to be gramtically correct
public class Die {
    private int value;
    private ImageIcon pic;
    
    public Die() {
        value = 1; 
        URL file = getClass().getResource("d1.jpg");
        pic = new ImageIcon(file);
    }
    public int getValue(){
        return value;
    }
    public void roll(){
        value = (int)(Math.random()*6)+1;
        URL file = getClass().getResource("d" + value + ".jpg");
        pic = new ImageIcon(file);   
    }
    public ImageIcon getPic(){
        return pic;
    }
}