import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import jdk.internal.org.jline.utils.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in;
        in = new BufferedReader(new InputStreamReader( System.in ) );
        String cadena;
        long a, b;
        StringTokenizer ts;
        while( (cadena = in.readLine() ) != null ){
            ts = new StringTokenizer(cadena);
            String dato = ts.nextToken().trim();
            a = Long.parseLong(dato);
            dato = ts.NextToken().trim();
            b = Long.parseLong(dato);
            System.out.println(Math.abs( b - a ));
        }
        
    }
}
