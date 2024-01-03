import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
        	String[] input = br.readLine().split(" ");
        	int A = Integer.parseInt(input[0]);
        	int B = Integer.parseInt(input[1]);

        	bw.write((A + B) + "\n");
        }
        bw.flush();
    }
}