import java.util.Arrays;

class hash3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        System.out.println("phone_book = " + Arrays.toString(phone_book));
        for(int i = 0; i< phone_book.length; i++) {
            System.out.println("i = " + i);
            System.out.println("z = " + phone_book[i]);
            System.out.println("c = " + phone_book[i+1]);
            if (phone_book[i].length() > phone_book[i+1].length()) continue;
            if (i == phone_book.length-1) break;
            if (phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
    }
}
