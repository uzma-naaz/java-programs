
class tiger {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("towel");

        // sb.setCharAt(2, 'l');
        // sb.insert(0, 'p');
        // sb.delete(3, 5);
        // sb.append('a');
        // System.out.println(sb.length());
        // }
        // }
        String str = " ";
        for (int i = sb.length() - 1; i >= 0; i--) {
            str = str + sb.charAt(i);

        }
        System.out.println(str);
    }
}