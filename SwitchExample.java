public class SwitchExample {
    public String mod7 (int n) {
        int i = n % 7;
        switch(n) {
            case 0:
                return "Zero";
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            default:
                return "Six";
            
        }
    }
}