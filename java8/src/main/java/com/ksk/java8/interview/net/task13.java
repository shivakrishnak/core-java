public class Testing {
    private int value = 1;
    
    public int getValue() {
        return value;
    }
    
    public void changeVal(int value) {
        value = value;
    }
    
	//what will be the output?
    public static void main(String args[]) {
        int a = 2;
        Testing c = new Testing();
        c.changeVal(a);
        System.out.println(c.getValue());
    }
}