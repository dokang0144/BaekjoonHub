import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<len; i++) {
            String base = sc.nextLine();

            int start_x = Integer.parseInt(base.split(" ")[0]);
            int start_y = Integer.parseInt(base.split(" ")[1]);

            int end_x = Integer.parseInt(base.split(" ")[2]);
            int end_y = Integer.parseInt(base.split(" ")[3]);

            int through = 0;

            int count = sc.nextInt();
            sc.nextLine();

            for(int j = 0; j < count; j++) {
                String circle = sc.nextLine();

                int x = Integer.parseInt(circle.split(" ")[0]);
                int y = Integer.parseInt(circle.split(" ")[1]);
                int r = Integer.parseInt(circle.split(" ")[2]);

                boolean StartContain = hasContain(start_x, start_y, x, y, r);
                boolean EndContain = hasContain(end_x, end_y, x, y, r);

                // 출발점과 도착점이 모두 참이 아니거나 하나만 참이면 through증가
                if (!(StartContain && EndContain) && (StartContain || EndContain)) {
                    through++;
                }
            }
            System.out.println(through);
        }
        sc.close();
    }

    // 원 하나가 출발점 또는 도착점을 포함하는지 확인하는 코드
    private static boolean hasContain(int xo, int yo, int x, int y, int r) {
        return Math.sqrt(Math.pow(xo - x, 2) + Math.pow(yo - y, 2)) < r;
    }
}