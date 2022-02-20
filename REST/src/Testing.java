import java.io.*;

public class Testing {
    public static void main(String[] args) {
        new Testing().Filez();
    }
    public void Filez(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));
            writer.write("Hi Callum");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            reader.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
