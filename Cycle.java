class Cycle {
    public static void main(String[] args) {

        int a = 2, b = 3, c = 3;
        StringBuilder sb = new StringBuilder("");
        Cycle1(a, b, c, sb);
        Cycle2(a, b, c, sb);
        Cycle3(a, b, c, sb);
    }

    public static void Cycle1(int a, int b, int c, StringBuilder sb) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 2; j++) {
                if (i == 1 || i == 5) {
                    sb.append(a);
                    sb.append(b);
                    sb.append(c);
                } else {
                    sb.append(a);
                    sb.append(c);
                    sb.append(b);
                    sb.append(c);
                }

            }

        }
        System.out.println(sb.toString());
    }

    public static void Cycle2(int a, int b, int c, StringBuilder sb) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < 2; j++) {
                if (i == 1 || i == 6) {
                    sb.append(a);
                    sb.append(b);
                    sb.append(c);
                } else {
                    sb.append(a);
                    sb.append(c);
                    sb.append(b);
                    sb.append(c);
                }

            }

        }
        System.out.println(sb.toString());
    }

    public static void Cycle3(int a, int b, int c, StringBuilder sb) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2; j++) {
                if (i == 1) {
                    sb.append(a);
                    sb.append(b);
                    sb.append(c);
                } else {
                    sb.append(a);
                    sb.append(c);
                    sb.append(b);
                    sb.append(c);
                }

            }
        }
        sb.append(a);
        sb.append(b);
        sb.append(c);
        sb.append(2);

        System.out.println(sb.toString());
    }
}