import java.io.*;

public class Testing {
    public static void main(String[] args) {
            Testing a = new Testing();
            a.Filez();
    }
    public void Filez(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("retry.txt"));
            writer.write("Hi Callum");
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader("retry.txt"));
            reader.readLine();
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
